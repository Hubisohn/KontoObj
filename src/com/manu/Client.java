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

}
