package ru.hw.MyCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Parser {
    String source = "отдельный метод для поиска номера телефона по фамилии ввели фамилию получили ArrayList телефонов и отдельный метод для поиска e-mail по фамилии следует учесть что под одной фамилией может быть несколько записей";



    public static void main(String[] args) {

        Map <String, Integer> map = new HashMap<>();
        String source = "отдельный метод для поиска номера телефона по фамилии ввели фамилию получили ArrayList телефонов и отдельный метод для поиска e-mail по фамилии следует учесть что под одной фамилией может быть несколько записей";
        String[] arr = source.split(" ");
        for(int i = 0; i < arr.length; i++){
            if (!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else{
                Integer buff = map.get(arr[i]);
                buff++;
                map.replace(arr[i], buff);
            }
        }
        System.out.println("список");
        System.out.println(map.keySet());
        System.out.println("упомянания");
        System.out.println(map);
    }

}
