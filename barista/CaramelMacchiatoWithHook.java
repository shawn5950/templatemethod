package com.j2.templatemethod.barista;

import java.io.*;
public class CaramelMacchiatoWithHook extends CaffineBeverageWithHook {
  public void steamMilk() {
    System.out.println("Steaming milk...");
  }
  public void caramelSource() {
    System.out.println("Adding Caramel Source...");
  }
  public void brew() {
    System.out.println("make espresso...");
  }
  public void addCondiments() {
    System.out.println("Adding vanilla syrup...");
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
  
  
 