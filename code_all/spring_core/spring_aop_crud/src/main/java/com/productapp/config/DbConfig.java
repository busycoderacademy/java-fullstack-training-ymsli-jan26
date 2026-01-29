package com.productapp.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@PropertySource("classpath:db.properties")
@Configuration
@EnableTransactionManagement
public class DbConfig {

	@Value("${jdbc.url}")
	private String url;
	@Value("${jdbc.driver}")
	private String driverName;

	@Value("${jdbc.username}")
	private String username;

	@Value("${jdbc.password}")
	private String password;

	// HikariCP cp without boot
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dms = new DriverManagerDataSource();
		dms.setUsername(username);
		dms.setPassword(password);
		dms.setUrl(url);
		dms.setDriverClassName(driverName);
		return dms;
	}

	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}

    // --- Transaction Manager (core of @Transactional) ---
    @Bean
    public PlatformTransactionManager transactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

}
