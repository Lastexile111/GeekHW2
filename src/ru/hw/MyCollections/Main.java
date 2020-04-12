package ru.hw.MyCollections;

public class Main {
    public static void main(String[] args) {
        PhoneBook base = new PhoneBook();


        base.addInfo("AAA",123, "A1@123");
        base.addInfo("AAA",124, "A2@123");
        base.addInfo("AAA",125, "A3@123");
        base.addInfo("BBB",111, "B1@123");
        base.addInfo("BBB",112, "B2@123");

        System.out.println(base.getPhones("AAA"));
        System.out.println(base.getEmails("BBB"));
    }
}
