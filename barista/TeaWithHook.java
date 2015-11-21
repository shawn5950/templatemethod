package com.j2.templatemethod.barista;

import java.io.*;
public class TeaWithHook extends CaffineBeverageWithHook {
  public void brew() {
    System.out.println("Steeping the tea...");
  }
  public void addCondiments() {
    System.out.println("Adding LemonSlice...");
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
  
 