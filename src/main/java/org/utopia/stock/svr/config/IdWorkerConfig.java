package org.utopia.stock.svr.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.utopia.stock.svr.utils.IdWorker;

@Configuration
public class IdWorkerConfig {
    @Bean
    public IdWorker idWorker() {
        return new IdWorker(1, 1, 1);
    }
}
