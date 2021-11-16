#!/bin/sh
mvn clean package && docker build -t ma.emsi/tpCustomerApplicationBouazzaoui .
docker rm -f tpCustomerApplicationBouazzaoui || true && docker run -d -p 9080:9080 -p 9443:9443 --name tpCustomerApplicationBouazzaoui ma.emsi/tpCustomerApplicationBouazzaoui