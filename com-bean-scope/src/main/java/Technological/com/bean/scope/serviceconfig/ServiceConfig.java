package Technological.com.bean.scope.serviceconfig;

import org.springframework.context.annotation.Configuration;

import java.security.Provider.Service;

import org.springframework.context.annotation.Bean;
@Configuration

public class ServiceConfig {
	
	@Bean("serv1")
	public Service serviceTech(){
		
	return new Service("AWS CLOUD S3","SILENTLOOM");
		
		
		
		
		
		
		
	}
			
			
	

}
