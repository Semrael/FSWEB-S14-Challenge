package org.example.models;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private  double healthyExtra1price;
    private String healthyExtra2Name;
    private double healthy2ExtraPrice;

   public HealthyBurger(String name, double price, String breadRollType){
       super(name,"Tofu",price,breadRollType);
   }



    public void addHealthyAddition1(String healthy1N,double healthy1P){
        this.healthyExtra1Name=healthy1N;
        this.healthy2ExtraPrice=healthy1P;
    }
    public void addHealthyAddition2(String healthy2N ,double healthy2P){
        this.healthyExtra2Name=healthy2N;
        this.healthy2ExtraPrice=healthy2P;
    }

    @Override
    public double itemizeHamburger() {
        double toplamUcret= super.itemizeHamburger();
        if(healthyExtra1Name!=null){
            toplamUcret+=healthyExtra1price;
            System.out.println(healthyExtra1Name +" eklendi.");
        }
        if (healthyExtra2Name!= null){
            toplamUcret+=healthy2ExtraPrice;
            System.out.println(healthyExtra2Name+" eklendi.")     ;  }
        return toplamUcret;
    }
}
