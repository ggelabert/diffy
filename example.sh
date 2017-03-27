#!/usr/bin/env bash
java -jar ./target/scala-2.11/diffy-server.jar \
-candidate='localhost:7001' \
-master.primary='atlgtw.live.service:80' \
-master.secondary='atlgtw.live.service:80' \
-service.protocol='http' \
-serviceName='ATLGTW' \
-allowHttpSideEffects=true \
-proxy.port=:8880 \
-admin.port=:8881 \
-http.port=:8888 \
-rootUrl='localhost:8888'
