package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone phone1 = new CellPhone();

        Scanner input = new Scanner(System.in);

        System.out.println("What is the serial number?");
        int serialNumber = input.nextInt();
        phone1.setSerialNumber(serialNumber);
        input.nextLine();

        System.out.println("What is the phone model?");
        String model = input.nextLine();
        phone1.setModel(model);

        System.out.println("What is the carrier?");
        String carrier = input.nextLine();
        phone1.setCarrier(carrier);

        System.out.println("What is the phone number?");
        String phoneNumber = input.nextLine();
        phone1.setPhoneNumber(phoneNumber);

        System.out.println("Who is the owner of the phone?");
        String owner = input.nextLine();
        phone1.setOwner(owner);

        System.out.println("Serial Number " + phone1.getSerialNumber());
        System.out.println("Model " + phone1.getModel());
        System.out.println("Carrier " + phone1.getCarrier());
        System.out.println("Phone Number " + phone1.getPhoneNumber());
        System.out.println("Owner " + phone1.getOwner());









    }
}
