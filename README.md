# Spring_Microservices_PoC
PoC of a microservices architecture using Spring Boot and Spring Cloud.

### How to run :
1. As services don't come with their configuration, you have to run the **"config-service"** first.
1. Start the others services, the order doesn't matter.
1. Wait for the services to both run and subscribe to the Eureka server's registry.

### How to use the gateway :
1. Simply access services through it by using it's URL and including **"/{service's-name}/endpoint"**.
