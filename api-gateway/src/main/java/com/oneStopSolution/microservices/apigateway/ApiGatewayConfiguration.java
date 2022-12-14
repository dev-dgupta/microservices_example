package com.oneStopSolution.microservices.apigateway;

import org.springframework.cloud.gateway.route.Route;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.Buildable;
import org.springframework.cloud.gateway.route.builder.PredicateSpec;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
public class ApiGatewayConfiguration {

    @Bean
    public RouteLocator gatewayRouter(RouteLocatorBuilder builder){
        // we are re-routing our request to the URI if a request like get comes
        Function<PredicateSpec, Buildable<Route>> routeFunction=
                p -> p.path("/get")
                .uri("http://httpbin.org:80");
        return builder.routes()
                .route(routeFunction)
                .build();
    }

}
