package de.kopfgarn.tmpl.controller;

import com.google.protobuf.Timestamp;
import de.kopfgarn.tmpl.config.GrpcTmplUtil;
import de.kopfgarn.tmpl.proto.TestRequest;
import de.kopfgarn.tmpl.proto.TestResponse;
import de.kopfgarn.tmpl.proto.TestServiceGrpc;
import de.kopfgarn.tmpl.service.GrpcTmplService;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * GRPC test service
 * - uses artificial controller/service pattern, although not supported per se
 */
@GrpcService
public class GrpcTmplController extends TestServiceGrpc.TestServiceImplBase {

    @Autowired
    private GrpcTmplService service;

    @Override
    public void test(TestRequest request, StreamObserver<TestResponse> responseObserver) {
        String textin = request.getText();
        // TODO: validate input?

        String textout = service.test(textin);

        // build response
        TestResponse response = TestResponse.newBuilder()
                .setText(textout)
                // TODO: use DTO for complex data-types?
                .setTimestamp(GrpcTmplUtil.getCurrentTimestamp())
            .build();

        // set response obj
        responseObserver.onNext(response);
        // trigger completion
        responseObserver.onCompleted();
    }
}
