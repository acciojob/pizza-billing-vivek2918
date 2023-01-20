package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean addCheese = false;
    private  boolean addTopping = false;
    private  boolean addPaperBag = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes herr
        if(isVeg){
            this.price = 300;
        }
        else{
            this.price = 400;
        }
    }

    public int getPrice(){
        return price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!addCheese){
            addCheese = true;
            price += 80;
        }
        //System.out.println("Extra Cheese Added: " + 80);
        //return;
    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg && addTopping == false){
            addTopping = true;
            price += isVeg?70:120;
        }
        // System.out.println("Extra Toppings Added: " + 70);
        //return;
    }

    public void addTakeaway(){
        // your code goes here
        if(addPaperBag == false){
            this.addPaperBag = true;
            this.price += 20;
        }
        //System.out.println("Paperbag Added: " + 20);
        //return;
    }

    public String getBill(){
        // your code goes here
        this.bill = "Base Price Of The Pizza: " + (isVeg?300:400) + "\n" + (addCheese?("Extra Cheese Added: " +80+ "\n"):"") + (addTopping?("Extra Toppings Added: " + (isVeg?70:120) + "\n"):"") + (addPaperBag?("Paperbag Added: " +20+"\n"):"")+"Total Price: " + price+"\n";
       return this.bill;
    }
}
