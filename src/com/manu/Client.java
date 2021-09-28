package com.manu;

import java.util.Scanner;

public class Client {

    protected String name = new String();
    protected int accountnmb = 0;
    public Konto konto = null;

    protected Client(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your Name:");
        name = scanner.nextLine();
        System.out.println("Please enter your Accountnumber:");
        accountnmb = scanner.nextInt();
    }

    public void newKonto(){
        if(this.konto == null) {
            System.out.println("Client " + this.name + " created a account!");
            this.konto = new Konto();
        }else{
            System.out.println("Sie besitzen bereits ein Konto!");
        }
    }

    public void closeKonto(){
        System.out.println("Sind Sie sicher dass Sie das Konto schließen wollen? [Ja/Nein]");
        String accept = new String();
        Scanner scanner = new Scanner(System.in);
        accept = scanner.nextLine();

        if(accept.equalsIgnoreCase("Ja")){
            if((this.konto.money - 30) >= 0) {
                System.out.println("Konto wurde gschlossen!");
                System.out.println("Ihnen wurde " + (this.konto.money - 30) + " ausgezahlt! (-30€ Bearbeitungsgebühr!)");
                this.konto = null;
            }else{
                System.out.println("Sie schulden der Bank " + (this.konto.money - 30) + ". Überweißen Sie oder wir töten Sie!");
            }   System.out.println("Deswegen kann das Konto nicht gschlossen werden!");
        }else{
            System.out.println("Vorgang abgebrochen!");
        }
    }

}
