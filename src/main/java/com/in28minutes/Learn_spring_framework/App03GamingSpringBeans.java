package com.in28minutes.Learn_spring_framework;

import com.in28minutes.Learn_spring_framework.game.MarioGame;
import org.springframework.context.annotation.Bean;

import com.in28minutes.Learn_spring_framework.game.PacmanGame;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.Learn_spring_framework.game.GameRunner;
import com.in28minutes.Learn_spring_framework.game.GamingConsole;
import com.in28minutes.Learn_spring_framework.game.SuperContraGame;
public class App03GamingSpringBeans {

	public static void main(String[] args) {
	
	var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);
	   context.getBean(GamingConsole.class).up();
	  
	   context.getBean(GameRunner.class).run();
	    

	}

}
