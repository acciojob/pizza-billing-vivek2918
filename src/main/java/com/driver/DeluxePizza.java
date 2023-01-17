package com.driver;

public class DeluxePizza extends Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        price = 400;
    }

    public int getPrice(){
        return this.price;
    }

    boolean add1 = false;
    public void addExtraCheese(){
        // your code goes here
        if(add1 == false){
            add1 = true;
        }
        System.out.println("Extra Cheese Added: " + 80);
    }
    boolean add2 = false;
    public void addExtraToppings(){
        // your code goes here
        if(add2 == false){
            add2 = true;
        }
        System.out.println("Extra Toppings Added: " + 120);
    }

    boolean ta = false;
    public void addTakeaway(){
        // your code goes here
        ta = true;
        System.out.println("Paperbag Added: " + 20);
    }

    public String getBill(){
        // your code goes here
        int total = 0;
        if(add1)
            total += 80;
        if(add2)
            total += 120;
        if(ta)
            total += 20;

        total += price;
        bill = String.valueOf(total);
        return this.bill;
    }
}
