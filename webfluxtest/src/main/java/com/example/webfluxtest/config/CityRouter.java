package com.example.webfluxtest.config;

/**
 * @file: CityRouter.class
 * @author: Dusk
 * @since: 2018/12/27 22:52
 * @desc:
 */

import com.example.webfluxtest.handler.CityHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

/**
 * 路由类Router
 */

@Configuration
public class CityRouter {

    @Bean
    public RouterFunction<ServerResponse> routerCity(CityHandler cityHandler) {
        return RouterFunctions
                .route(RequestPredicates.GET("/hello")
                                .and(RequestPredicates.accept(MediaType.TEXT_PLAIN)),
                        cityHandler::helloCity);
    }
}
