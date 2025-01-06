package com.in28minutes.Learn_spring_framework.examples.c1;

import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.Learn_spring_framework.game.GameRunner;
import com.in28minutes.Learn_spring_framework.game.GamingConsole;

@Configuration
@ComponentScan
public class RealWorldSpringContextLauncherApplication {

	
	public static void main(String[] args) {
	
   try(var context = new AnnotationConfigApplicationContext(RealWorldSpringContextLauncherApplication .class)){
	  Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println); 
   
	  System.out.println(context.getBean(BusinessCalculationService.class).findMax());
   ;
   }

	}

}
