package com.j2.templatemethod.barista;

public class BeverageTestDrive {
  public static void main(String[] args) {
    CoffeeWithHook coffee = new CoffeeWithHook();
    TeaWithHook tea = new TeaWithHook();
    CaramelMacchiatoWithHook caramelMacchiato = new CaramelMacchiatoWithHook();
    
    System.out.println("Make Coffee");
    coffee.prepareRecipe();
    System.out.println("Here is a Coffee with sugar and milk");
    
    System.out.println("Make Tea");
    tea.prepareRecipe();
    System.out.println("Here is a Tea with LemonSlice");
      
    System.out.println("Make CaramelMacchiato");
    caramelMacchiato.prepareRecipe();
    System.out.println("Here is a CaramelMacchiato with vanilla syrup");
  }
}