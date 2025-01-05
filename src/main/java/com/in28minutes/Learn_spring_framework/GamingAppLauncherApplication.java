package com.in28minutes.Learn_spring_framework;

import com.in28minutes.Learn_spring_framework.game.MarioGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.in28minutes.Learn_spring_framework.game.PacmanGame;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.Learn_spring_framework.game.GameRunner;
import com.in28minutes.Learn_spring_framework.game.GamingConsole;
import com.in28minutes.Learn_spring_framework.game.SuperContraGame;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.Learn_spring_framework.game.GameRunner;
import com.in28minutes.Learn_spring_framework.game.GamingConsole;
import com.in28minutes.Learn_spring_framework.game.PacmanGame;

@Configuration
@ComponentScan("com.in28minutes.Learn_spring_framework.game")
public class GamingAppLauncherApplication {

	public static void main(String[] args) {
	
	var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication .class);
	   context.getBean(GamingConsole.class).up();
	  
	   context.getBean(GameRunner.class).run();
	    

	}

}
