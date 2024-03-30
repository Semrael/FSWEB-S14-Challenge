package org.example.models;

public  class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public void addHamburgerAddition1(String a1n, double a1p) {
        this.addition1Name = a1n;
        this.addition1Price = a1p;
    }

    public void addHamburgerAddition2(String a2n, double a2p) {
        this.addition2Name = a2n;
        this.addition2Price = a2p;
    }

    public void addHamburgerAddition3(String a3n, double a3p) {
        this.addition3Name = a3n;
        this.addition3Price = a3p;
    }

    public void addHamburgerAddition4(String a4n, double a4p) {
        this.addition4Name = a4n;
        this.addition4Price = a4p;
    }

    public double itemizeHamburger() {

        System.out.println("Hamburger ekmek tipi: " + this.breadRollType + " Et türü: " + this.meat + " Ücret: " + price);
        double toplamUcret = this.price;
        if (addition1Name != null) {
            System.out.println(addition1Name + " eklendi");
            toplamUcret += this.addition1Price;

        }
        if (addition2Name != null) {
            System.out.println(addition2Name + " eklendi");
            toplamUcret += this.addition2Price;

        }
        if (addition3Name != null) {
            System.out.println(addition3Name + " eklendi");
            toplamUcret += this.addition3Price;

        }
        if (addition4Name != null) {
            System.out.println(addition4Name + " eklendi");
            toplamUcret += this.addition4Price;

        }

        System.out.println("Toplam Ücret: "+ toplamUcret);
        return toplamUcret;


    }



}
