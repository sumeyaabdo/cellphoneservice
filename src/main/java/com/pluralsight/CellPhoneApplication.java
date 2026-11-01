package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone phone1 = new CellPhone();
        CellPhone phone2 = new CellPhone();
        // Creating Scanner
        Scanner input = new Scanner(System.in);

        // Asking for Serial number
        System.out.println("What is the serial number?");
        int serialNumber = input.nextInt();
        phone1.setSerialNumber(serialNumber);
        input.nextLine();

        // Asking for phone model
        System.out.println("What is the phone model?");
        String model = input.nextLine();
        phone1.setModel(model);

        // Asking for carrier
        System.out.println("What is the carrier?");
        String carrier = input.nextLine();
        phone1.setCarrier(carrier);

        // Asking for phone number
        System.out.println("What is the phone number?");
        String phoneNumber = input.nextLine();
        phone1.setPhoneNumber(phoneNumber);

        // Asking for owner of the phone
        System.out.println("Who is the owner of the phone?");
        String owner = input.nextLine();
        phone1.setOwner(owner);

        // get
        System.out.println("Serial Number " + phone1.getSerialNumber());
        System.out.println("Model " + phone1.getModel());
        System.out.println("Carrier " + phone1.getCarrier());
        System.out.println("Phone Number " + phone1.getPhoneNumber());
        System.out.println("Owner " + phone1.getOwner());

        phone2.setOwner("Dana");
        phone2.setPhoneNumber("855-555-2222");

        display(phone1);
        display(phone2);

        phone1.dial(phone2.getPhoneNumber());
        phone2.dial(phone1.getPhoneNumber());

    }
    public static void display(CellPhone phone){

        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier " + phone.getCarrier());
        System.out.println("Phone Number " + phone.getPhoneNumber());
        System.out.println("Owner " + phone.getOwner());

    }
}
