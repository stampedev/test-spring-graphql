# test-spring-grpcsrv
Test/template for grpc

- basic concepts: https://www.baeldung.com/grpc-introduction and https://www.baeldung.com/google-protocol-buffer
- spring boot adaptation: https://medium.com/turkcell/grpc-implementation-with-spring-boot-7d6f98349d27

UIs used for testing
- grpcurl
```
$ grpcurl --plaintext localhost:9090 de.kopfgarn.tmpl.proto.TestService/test
{
  "timestamp": "2023-05-22T09:59:31.400068Z"
}
```
- https://github.com/getezy/ezy
- https://gripgrpc.dev/


## TODOs
- resolve workaround in config-class to support spring-boot >= 3.0
- implement unit-tests
- solve controller-pattern, provide solution for DTOs vs DAOs