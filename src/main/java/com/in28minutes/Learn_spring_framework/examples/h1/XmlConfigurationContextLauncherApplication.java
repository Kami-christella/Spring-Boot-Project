package com.in28minutes.Learn_spring_framework.examples.h1;

import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in28minutes.Learn_spring_framework.game.GameRunner;
import com.in28minutes.Learn_spring_framework.game.GamingConsole;

 
public class XmlConfigurationContextLauncherApplication {

	
	public static void main(String[] args) {
	
   try(var context = new ClassPathXmlApplicationContext("contextConfiguration.xml")){
	  Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println); 
   
	  System.out.println(context.getBean("name"));
       
	  System.out.println(context.getBean("age"));
      
	  context.getBean(GameRunner.class).run();
   
   };

	}

}
