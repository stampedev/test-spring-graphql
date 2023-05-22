package de.kopfgarn.tmpl.controller;

import com.google.protobuf.Any;
import com.google.rpc.Code;
import com.google.rpc.Status;
import de.kopfgarn.tmpl.config.GrpcTmplUtil;
import de.kopfgarn.tmpl.proto.TestErrorCode;
import de.kopfgarn.tmpl.proto.TestException;
import io.grpc.StatusRuntimeException;
import io.grpc.protobuf.StatusProto;
import net.devh.boot.grpc.server.advice.GrpcAdvice;
import net.devh.boot.grpc.server.advice.GrpcExceptionHandler;

@GrpcAdvice
public class GrpcTmplExceptionHandler {

    @GrpcExceptionHandler(RuntimeException.class)
    public StatusRuntimeException handleGenericError(RuntimeException exception) {
        // TestException is defined in .proto as error-response
        TestException responseEx = TestException.newBuilder()
                .setTimestamp(GrpcTmplUtil.getCurrentTimestamp())
                // error-codes are defined in .proto as well
                .setCode(TestErrorCode.UNEXPECTED)
            .build();

        Status result = Status.newBuilder()

                .setCode(Code.UNKNOWN.getNumber())
                .setMessage(exception.getMessage())
                .addDetails(Any.pack(responseEx))
                .build();

        return StatusProto.toStatusRuntimeException(result);
    }
}
