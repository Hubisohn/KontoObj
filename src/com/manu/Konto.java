package com.manu;

import java.util.Scanner;

public class Konto {

    Scanner scanner = new Scanner(System.in);

    protected int money = 0;
    protected int credit = 0;
    protected float zins = 0;

    protected Konto(){
        this.money = 10;
    }

    public void setCredit(){
        System.out.println("Wie hoch soll der Kredit sein den Sie beantragen?");
        this.credit = scanner.nextInt();
    }

    public void setZins() {
        System.out.println("Wie hoch soll der Zinssatz sein?");
        this.zins = scanner.nextFloat();
    }

    public void getInfo(){
        System.out.println("Money (ohne Zins): " + this.money);
        System.out.println("Money (mit Zins): " + (this.money + (this.money*this.zins)));
        System.out.println("Credit: " + this.credit);
        System.out.println("Zins: " + this.zins);
    }

    public void addMoney(int money){
        int temp;
        String yesno = new String();
        if(money == 0) {
            System.out.println("Wollen Sie Geld einzahlen? (Ja/Nein)");
            yesno = scanner.nextLine();
            if(yesno.equalsIgnoreCase("Ja")) {
                System.out.println("Wieviel Geld wollen Sie einzahlen?");
                temp = scanner.nextInt();
                this.money += temp;
            }
            return;
        }else{
            System.out.println("Der Betrag von " + money + " wurde erfolgreich überwießen!");
            this.money += money;
        }
    }

    public void rmMoney(){
        int temp;
        System.out.println("Wieviel Geld wollen Sie abheben?");
        temp = scanner.nextInt();
        this.money -= temp;
    }

    public int payover(){
        int temp;
        System.out.println("Bitte geben Sie den Geld - Betrag ein, den Sie überweißen wollen:");
        temp = scanner.nextInt();
        if(this.money - temp < 0){
            if(this.credit + this.money < temp){
                System.out.println("Diese überweißung sprengt den Rahmen!");
                return 0;
            }else {
                this.money -= temp;
                this.credit += this.money;
                this.money = 0;
            }
        }else {
            this.money -= temp;
        }
        return temp;
    }
}
