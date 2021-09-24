package com.manu;

public class Main {

    public static void main(String[] args) {
        Client Jack = new Client();

        Jack.newKonto();
        Jack.konto.setCredit();
        Jack.konto.setZins();
        Jack.newKonto();
        Jack.konto.getInfo();

        Client Luke = new Client();
        Luke.newKonto();
        Luke.konto.addMoney(Jack.konto.payover());

        System.out.println("---------Jack---------");
        Jack.konto.getInfo();
        System.out.println("---------Jack---------");
        System.out.println("---------Luke---------");
        Luke.konto.getInfo();
        System.out.println("---------Luke---------");
    }
}
