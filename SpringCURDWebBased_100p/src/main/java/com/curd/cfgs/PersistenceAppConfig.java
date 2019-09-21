package com.curd.cfgs;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jndi.JndiObjectFactoryBean;

@Configuration
@ComponentScan(basePackages="com.curd.dao")
@PropertySource("classpath:/com/curd/commons/jdbc.properties")
public class PersistenceAppConfig {
	@Value("${ds.jndi}")
	 private  String  jndiName;
	
	 @Autowired
     Environment env;
	
	@Bean
	public  JndiObjectFactoryBean createJOFB() {
		JndiObjectFactoryBean jofb=null;
		jofb=new JndiObjectFactoryBean();
		jofb.setJndiName(jndiName);
		return jofb;
	}
	
	@Bean
	public   JdbcTemplate  createJT(JndiObjectFactoryBean jfb) {
		return new JdbcTemplate((DataSource) jfb.getObject());
		
	}
	

}
