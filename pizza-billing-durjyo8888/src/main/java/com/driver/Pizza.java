//package com.driver;
//
//public class Pizza {
//
//    private int price;
//    private Boolean isVeg;
//    private String bill;
//
//    public static int VegBasePrice = 300;
//    public static int NonVegBasePrice = 400;
//    public static int CheesePrice = 80;
//    public static int vegToppingPrice = 70;
//    public static int nonVegToppingPrice = 120;
//    public static int takeAwayPrice = 20;
//
//    private boolean isCheeseAdded;
//    private boolean isToppingAdded;
//    private boolean isTakeAwayAdded;
//    private int myToppingPrice = 0;
//    private int BasePrice = 0;
//
//    public Pizza(Boolean isVeg){
//        this.isVeg = isVeg;
//        this.BasePrice = isVeg ? VegBasePrice : NonVegBasePrice;
//        this.price = BasePrice;
//        this.bill = "";
//        this.isCheeseAdded = false;
//        this.isToppingAdded = false;
//        this.isTakeAwayAdded = false;
//
//        // your code goes here
//    }
//
//    public int getPrice(){
//
//        this.price += BasePrice;
//        if(isCheeseAdded){
//            this.price += CheesePrice;
//        }
//        if(isToppingAdded){
//            this.price += this.myToppingPrice;
//        }
//        if(isTakeAwayAdded){
//            this.price += takeAwayPrice;
//        }
//        return this.price;
//    }
//
//    public void addExtraCheese(){
//        // your code goes here
//        if(!isCheeseAdded){
//            isCheeseAdded = true;
//        }
//    }
//
//    public void addExtraToppings(){
//        // your code goes here
//        if(!isToppingAdded){
//            this.myToppingPrice = isVeg ? vegToppingPrice : nonVegToppingPrice;
//            isToppingAdded = true;
//        }
//    }
//
//    public void addTakeaway(){
//        // your code goes here
//        if(!isTakeAwayAdded){
//            isTakeAwayAdded = true;
//        }
//    }
//
//    public String getBill(){
//        // your code goes here
////        Base Price Of The Pizza: 300
////        Extra Cheese Added: 80
////        Extra Toppings Added: 70
////        Paperbag Added: 20
////        Total Price: 470
//        if(isVeg) {
//            this.bill += "Base Price of the Pizza " + VegBasePrice + "\n";
//        }else{
//            this.bill += "Base Price of the Pizza " + NonVegBasePrice + "\n";
//        }
//        if(isCheeseAdded) {
//            this.bill += "Extra Cheese Added:  " + CheesePrice + "\n";
//        }
//        if(isToppingAdded){
//            this.bill += "Extra Toppings Added: " + myToppingPrice + "\n";
//        }
//        if(isTakeAwayAdded){
//            this.bill += "Paperbag Added: " + takeAwayPrice + "\n";
//        }
//        this.bill += "Total Price: " + this.price + "\n";
//
//        return this.bill;
//    }
//}


package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private Boolean extraCheese = false;
    private Boolean extraToppings = false;
    private Boolean paperBag = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        // your code goes here
        if(isVeg == true){
            this.price += 300;
        }else{
            this.price += 400;
        }

    }

    public int getPrice(){

        return this.price;

    }

    public void addExtraCheese(){
        // your code goes here
        if(this.extraCheese == true){
            return;
        }
        price = price + 80;
        this.extraCheese = true;
    }

    public void addExtraToppings(){
        // your code goes here
        if(extraToppings == true){
            return;
        }
        if(isVeg == true){
            price = price + 70;
        }else{
            price = price + 120;
        }
        extraToppings = true;


    }

    public void addTakeaway(){
        // your code goes here
        if(paperBag == true){
            return;
        }
        price = price + 20;
        paperBag = true;
    }

    public String getBill(){
        // your code goes here
        if(isVeg == true){
            bill = "Base Price Of The Pizza: 300\n";
        }else{
            bill = "Base Price Of The Pizza: 400\n";
        }

        if(extraCheese == true){
            bill = bill + "Extra Cheese Added: 80\n";
        }

        if(extraToppings == true){
            if(isVeg == true){
                bill = bill + "Extra Toppings Added: 70\n";
            }else{
                bill = bill + "Extra Toppings Added: 120\n";
            }
        }

        if(paperBag == true){
            bill = bill + "Paperbag Added: 20\n";
        }

        String totalPrice = Integer.toString(price);

        bill = bill + "Total Price: " + totalPrice + "\n";
        return this.bill;
    }
}