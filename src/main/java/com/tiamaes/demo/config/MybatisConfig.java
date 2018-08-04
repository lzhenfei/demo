package com.tiamaes.demo.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class MybatisConfig {
	
	@Bean(name="dataSource")
	public DriverManagerDataSource dataSource(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUsername("root");
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setPassword("root");
		dataSource.setUrl("jdbc:mysql://localhost:3306/test");
		return dataSource;
	}
	@Bean
	public SqlSessionFactoryBean sqlSessionFactory(){
		SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
		sqlSessionFactory.setDataSource(dataSource());
		return sqlSessionFactory;
	}

	
}
