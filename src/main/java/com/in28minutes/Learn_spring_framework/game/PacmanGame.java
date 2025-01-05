package com.in28minutes.Learn_spring_framework.game;

import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements GamingConsole{
	
  public void up() {
	System.out.println("up");  
  }
  
  public void down() {
	  System.out.println("down");
  }
  
  public void left() {
	  System.out.println("Left");
  }
  
  public void right() {
	  System.out.println("right");
  }
}
