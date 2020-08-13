package org.example.wjs.transactions.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/*@Configuration
public class DataSourceConfig {
    private final static Logger LOGGER = LoggerFactory.getLogger(DataSourceConfig.class);

    private final static String DATASOURCE_PREFIX = "spring.datasource";
    @Bean(name = "demoDB")
    @ConfigurationProperties(prefix = DATASOURCE_PREFIX)
    public DataSource dataSource() {
        LOGGER.info("init data source：");

        return DataSourceBuilder.create()*//*
                .type(com.alibaba.druid.pool.DruidDataSource.class)
                .driverClassName("com.mysql.jdbc.Driver")
                .url("jdbc:mysql://localhost:3306/demo?serverTimezone=UTC&useSSL=true&useUnicode=true&characterEncoding=utf-8")
                .username("root").password("root")*//*
                .build();
    }
}*/
