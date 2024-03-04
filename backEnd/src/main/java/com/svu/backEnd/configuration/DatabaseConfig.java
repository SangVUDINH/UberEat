package com.svu.backEnd.configuration;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

@Configuration
public class DatabaseConfig {

    @Bean
    public ResourceDatabasePopulator databasePopulator(DataSource dataSource) {
        ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
        populator.addScript(new ClassPathResource("addData1.sql"));
        populator.execute(dataSource);
        return populator;
    }
}
