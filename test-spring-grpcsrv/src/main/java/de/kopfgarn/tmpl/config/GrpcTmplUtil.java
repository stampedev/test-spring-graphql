package de.kopfgarn.tmpl.config;

import com.google.protobuf.Timestamp;

import java.time.Instant;

public class GrpcTmplUtil {

    public static Timestamp getCurrentTimestamp() {
        Instant now = Instant.now();
        Timestamp timestamp = Timestamp.newBuilder().setSeconds(now.getEpochSecond())
                .setNanos(now.getNano()).build();
        return timestamp;
    }
}
