package com.addressbook;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book Main Program");

        AddressBook a1 = new AddressBook();
        a1.contactList();
        a1.contactList();
        a1.contactList();
        System.out.println(a1.listData);

        System.out.println("if you want to change person Name , reply yes/no : ");
        String check = AddressBook.scan.nextLine();

        System.out.println("enter name whose details you want to edit : ");
        String name = AddressBook.scan.nextLine();

        if (check.equals("yes")) {
            for (Contacts cThrough : a1.listData) {

                if (cThrough.getFirstName().equals(name)) {
                    System.out.println("enter updated phone number : ");
                    cThrough.setPhone(AddressBook.scan.next());
                    break;
                }
            }
        }
        System.out.println(a1.listData);
    }
}

