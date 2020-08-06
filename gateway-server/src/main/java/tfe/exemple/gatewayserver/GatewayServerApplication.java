package tfe.exemple.gatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayServerApplication.class, args);
	}
	
	@Bean 
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("employee-service", r -> r
                        .path("/employee/**")
                        .filters(f -> f.stripPrefix(1))
                        .uri("lb://employee-service/")
                )
                .route("manager-service", r -> r
                        .path("/manager/**")
                        .filters(f -> f.stripPrefix(1))
                        .uri("lb://manager-service/")
                )
                .build();
	}

}
