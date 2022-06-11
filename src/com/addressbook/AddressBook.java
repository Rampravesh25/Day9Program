package com.addressbook;

import java.util.LinkedList;
import java.util.Scanner;

public class AddressBook {
    static Scanner scan = new Scanner(System.in);

    LinkedList<Contacts> listData = new LinkedList();

    public void contactList() {
        System.out.println("Enter First Name");
        String firstName = scan.nextLine();

        System.out.println("Enter last Name");
        String lastName = scan.nextLine();

        System.out.println("Enter State Name");
        String state = scan.nextLine();

        System.out.println("Enter City Name");
        String city = scan.nextLine();

        System.out.println("Enter Address");
        String addressName = scan.nextLine();

        System.out.println("Enter phone Number");
        String phone = scan.nextLine();

        System.out.println("Enter email Address");
        String email = scan.nextLine();

        Contacts contactsList = new Contacts(firstName,lastName,state,city,addressName,phone,email);
        listData.add(contactsList);
    }
}
