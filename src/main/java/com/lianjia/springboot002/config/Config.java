package com.lianjia.springboot002.config;

import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.cache.interceptor.CacheResolver;
import org.springframework.cache.interceptor.SimpleCacheResolver;
import org.springframework.context.annotation.Bean;

public class Config {
    /*@Bean
    public CacheResolver cacheResolver() {
        return new SimpleCacheResolver(new ConcurrentMapCacheManager("entities"));
    }*/
}
