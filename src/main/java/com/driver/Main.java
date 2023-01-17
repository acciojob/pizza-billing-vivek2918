package com.driver;

public class Main {
  public static void main(String[] args) {
    DeluxePizza dp = new DeluxePizza(true);
    System.out.println("Base Price Of The Pizza: " + dp.getPrice());
    //dp.addTakeaway();
    dp.addExtraCheese();
    dp.addExtraToppings();
    //dp.addTakeaway();
    System.out.println("Total Price: " + dp.getBill() + "\n");

    Pizza p = new Pizza(true);
    System.out.println("Base Price Of The Pizza: " + p.getBill());
    p.addExtraCheese();
    p.addExtraToppings();
    p.addTakeaway();
    System.out.println("Total Price: " + p.getBill() + "\n");
  }
}