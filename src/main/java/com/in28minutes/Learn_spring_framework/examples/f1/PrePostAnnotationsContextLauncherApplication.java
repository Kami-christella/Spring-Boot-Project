package com.in28minutes.Learn_spring_framework.examples.f1;

import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.in28minutes.Learn_spring_framework.game.GameRunner;
import com.in28minutes.Learn_spring_framework.game.GamingConsole;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass{
	private SomeDependency someDependency;
	
	public SomeClass (SomeDependency someDependency) {
		super();
		this.someDependency=someDependency;
		System.out.println("All dependencies are ready!");
	}
	
	@PostConstruct
	public void initialize() {
		someDependency.getReady();
	}
	@PreDestroy
	public void cleanup() {
		System.out.println("Cleanup");
	}
}

@Component
class SomeDependency{
	public void getReady() {
		System.out.println("Some logic using someDependency");
	}
}

@Configuration
@ComponentScan
public class PrePostAnnotationsContextLauncherApplication {

	
	public static void main(String[] args) {
	
   try(var context = new AnnotationConfigApplicationContext(PrePostAnnotationsContextLauncherApplication .class)){
	  Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println); 
   };

	}

}
