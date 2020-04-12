package ru.hw.MyCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class PhoneBook {

    private Map<String, LinkedList> dataBase = new HashMap<>();

    public void addInfo (String lastName, int phoneNumber, String email) {
        if (dataBase.containsKey(lastName)) {
            LinkedList<Person> newList = dataBase.get(lastName);
            newList.add(new Person(lastName, phoneNumber, email));
//            dataBase.put(lastName, newList);
        }else{
            LinkedList<Person> newList = new LinkedList<>();
            newList.add(new Person(lastName, phoneNumber, email));
            dataBase.put(lastName, newList);
        }
    }

    private LinkedList<Person> getPersons(String lastName){
        return dataBase.get(lastName);
    }

    public ArrayList<Integer> getPhones(String lastName){
        LinkedList<Person> persons = getPersons(lastName);
        ArrayList<Integer> phones = new ArrayList<>();

        for (Person person : persons) {
            phones.add(person.getPhone());
        }

        return phones;
    }

    public ArrayList<String> getEmails(String lastName){
        LinkedList<Person> persons = getPersons(lastName);
        ArrayList<String> emails = new ArrayList<>();

        for (Person person : persons) {
            emails.add(person.getEmail());
        }

        return emails;
    }
}
