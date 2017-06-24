package com.niit.diaspora.config;
import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.niit.diaspora.model.*;


@Configuration
@ComponentScan("com.niit.disapora")
@EnableTransactionManagement
@EnableWebMvc
public class AppConfig{
/* extends WebMvcConfigurerAdapter {
	@Override
	public void addCorsMappings(CorsRegistry registry) {
	  registry.addMapping("/User/**")
	   	  .allowedOrigins("http://localhost:8585", "http://localhost:8787")
		  .allowedMethods("POST", "GET",  "PUT", "OPTIONS", "DELETE")
		  .allowedHeaders("X-Auth-Token", "Content-Type")
		  .exposedHeaders("custom-header1", "custom-header2")
		  .allowCredentials(false)
		  .maxAge(4800);
	}*/
	@Autowired
	@Bean(name ="dataSource")
	public DataSource dataSource() {

		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("org.h2.Driver");
		ds.setUrl("jdbc:h2:tcp://localhost/~/diaspora");
		ds.setUsername("sa");
		ds.setPassword("");
		return ds;
	}

	private Properties getHibernateProperties() {
		Properties prop = new Properties();
		prop.put("hibernate.show_sql", "true");
		prop.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		prop.put("hibernate.format_sql", "true");
		prop.put("hibernate.hbm2ddl.auto", "update");
		return prop;
	}

	@Autowired
	@Bean
	public SessionFactory sessionFactory(DataSource dataSource) {
		LocalSessionFactoryBuilder builder = new LocalSessionFactoryBuilder(dataSource);
		builder.addProperties(getHibernateProperties());
		// builder.scanPackages("com.niit.ecomm_backend");
		builder.addAnnotatedClass(User.class);
		return builder.buildSessionFactory();
	}

	// Create a transaction manager
	@Bean
	@Autowired
	public HibernateTransactionManager txManager(SessionFactory sessionFactory) {
		return new HibernateTransactionManager(sessionFactory);
	}
} 