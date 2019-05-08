package com.mphasis.talentswot.configurations;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.mphasis.talentswot.entities.Candidate;
import com.mphasis.talentswot.entities.Skills;



@Configuration
@EnableWebMvc
@EnableAspectJAutoProxy
@EnableTransactionManagement
@ComponentScan(basePackages = "com.mphasis.talentswot.*")
public class AppConfig {

	/*@Bean
	public InternalResourceViewResolver getViewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/jsp/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}*/
	
	@Bean
	public WebMvcConfigurer corsConfiguration() {
		return new WebMvcConfigurerAdapter() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
				.allowedMethods("HEAD","GET","PUT","DELETE","POST")
				.allowedHeaders("Origin","X-Requested-with","Content-Type","Accept");
			}
		};
	}
	
	@Bean
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		ds.setUsername("talentswot");
		ds.setPassword("123");
		return ds;
	}
	
	@Bean
	public LocalSessionFactoryBean getSessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(getDataSource());
		sessionFactory.setPackagesToScan("com.mphasis.talentswot.entities");
		sessionFactory.setAnnotatedClasses(Skills.class);
		sessionFactory.setAnnotatedClasses(Candidate.class);
//		sessionFactory.setAnnotatedClasses(Product.class);
//		sessionFactory.setAnnotatedClasses(Employee1.class);
//		sessionFactory.setAnnotatedClasses(Department1.class);
	Properties properties = new Properties();
		properties.put("hibernate.dialect", "org.hibernate.dialect.OracleDialect");
		properties.put("hibernate.hbm2ddl.auto", "update");
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.format_sql", "true");
		sessionFactory.setHibernateProperties(properties);
		return sessionFactory;
	}
	
	@Bean
	public HibernateTransactionManager getHibernateTransactionManger(SessionFactory s) {
		HibernateTransactionManager hibernateTransactionManager=new HibernateTransactionManager();
		hibernateTransactionManager.setSessionFactory(s);
		return hibernateTransactionManager;
	}
}
