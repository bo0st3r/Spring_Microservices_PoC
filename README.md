# Spring_Microservices_PoC
PoC of a microservices architecture with Spring Boot and Spring Cloud.

### Steps to run:
1. Run the **"config-service"** first, as services don't start fully configurated and need it
1. Start the others services, order doesn't matter
1. Wait for them to all start and subscribe to the Eureka server's registry
1. You're ready to go

### Access services through the Gateway:
1. Enter its host address and include **"/{service's-name}/endpoint"** as path 
