package com.in28minutes.Learn_spring_framework.examples.g1;

import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.in28minutes.Learn_spring_framework.game.GameRunner;
import com.in28minutes.Learn_spring_framework.game.GamingConsole;

import jakarta.inject.Inject;
import jakarta.inject.Named;

//@Component
@Named
class BusinessService {
	private DataService dataService;

	//@Autowired
	@Inject
	public void setDataService(DataService dataService) {
		System.out.println("Setter Injection");
		this.dataService = dataService;
	}
	
	public DataService getDataService() {
		
		return dataService;
	}

	
	
	
}
//@Component
@Named
class DataService {
	    
   }

@Configuration
@ComponentScan
public class CdIContextLauncherApplication {

	
	public static void main(String[] args) {
	
   try(var context = new AnnotationConfigApplicationContext(CdIContextLauncherApplication .class)){
	  Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println); 
	  System.out.println(context.getBean(BusinessService.class).getDataService());
   };

	}

}
