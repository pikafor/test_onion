package org.example.tranzit.spring_app.database.config;

import org.example.tranzit.spring_app.database.model.EntityScanMarker;
import org.example.tranzit.spring_app.database.repository.RepositoryScanMarker;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

@Configuration
@EntityScan(basePackageClasses = EntityScanMarker.class)
@EnableJpaRepositories(basePackageClasses = RepositoryScanMarker.class)
public class DataBaseConfiguration {

    @Bean
    public DataSource dataSource () {
        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
        EmbeddedDatabase db = builder
                .setType(EmbeddedDatabaseType.H2)
                .build();
        return db;
    }
}
