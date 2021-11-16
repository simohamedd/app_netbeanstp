@echo off
call mvn clean package
call docker build -t ma.emsi/tpCustomerApplicationBouazzaoui .
call docker rm -f tpCustomerApplicationBouazzaoui
call docker run -d -p 9080:9080 -p 9443:9443 --name tpCustomerApplicationBouazzaoui ma.emsi/tpCustomerApplicationBouazzaoui