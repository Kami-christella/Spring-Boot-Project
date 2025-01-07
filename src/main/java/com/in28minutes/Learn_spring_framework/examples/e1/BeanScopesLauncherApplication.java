package com.in28minutes.Learn_spring_framework.examples.e1;

import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.in28minutes.Learn_spring_framework.game.GameRunner;
import com.in28minutes.Learn_spring_framework.game.GamingConsole;

@Component
class NormalClass{
	
}

@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass{
	
}


@Configuration
@ComponentScan
public class BeanScopesLauncherApplication {

	
	public static void main(String[] args) {
	
   try(var context = new AnnotationConfigApplicationContext(BeanScopesLauncherApplication.class)){
      
       System.out.println( context.getBean(NormalClass.class));
       System.out.println( context.getBean(NormalClass.class));
	   
	   System.out.println( context.getBean(PrototypeClass.class));
       System.out.println( context.getBean(PrototypeClass.class));
       System.out.println( context.getBean(PrototypeClass.class));
   };

	}

}
