package com.j2.templatemethod.barista;
import java.io.*;

public class CoffeeWithHook extends CaffineBeverageWithHook {
  public void brew() {
    System.out.println("Dropping Coffee through filter...");
  }
  public void addCondiments() {
    System.out.println("Adding Sugar and Milk...");
  }
  
  public boolean customerWantsCondiments() {
    String answer = "yes";
    
    if(answer.toLowerCase().startsWith("y")) {
      return true;
    } else {
      return false;
    }
  }
}
  
 
    