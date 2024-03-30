package org.example.models;

public class DeluxeBurger extends Hamburger{
    private String drink="COKE";
    private String cips="CURVY";



    public DeluxeBurger() {
        super("Deluxe Burger", "Bilemedim",19.10, "Kepekli");

    }
    public String getDrink(){
        return this.drink;
    }

    public String getCips() {
        return  this.cips;
    }


    @Override
    public void addHamburgerAddition1(String a1n, double a1p) {

        System.out.println("\\nDeluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition2(String a2n, double a2p) {
        System.out.println("\\nDeluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition3(String a3n, double a3p) {
        System.out.println("\\nDeluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition4(String a4n, double a4p) {
        System.out.println("\\nDeluxe Burger için yeni malzeme eklenemez.");
    }
}










