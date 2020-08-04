package ru.stepev;


import java.util.*;

import static java.util.function.UnaryOperator.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Main {
    public static void main(String[] args) {


                System.out.println(Integer.toBinaryString(15));
                String sequence = Integer.toBinaryString(15);
//                List <String> countChars = sequence.toLowerCase().chars().mapToObj(e -> (char) e)
//                        .collect(groupingBy(identity(), LinkedHashMap::new, counting()));

        char[] mas = sequence.toCharArray();
        char first = mas[0];
        StringBuilder builder = new StringBuilder();
        List<String> list = new ArrayList<>();
        builder.append(first);
        for(int i = 1; i < mas.length;i++){
        //    System.out.println(mas[i]);
            if(first == mas[i]){
                builder.append(first);
            }
            else {
                list.add(builder.toString());
                first = mas[i];
                builder = new StringBuilder();
                builder.append(first);
                if(i == (mas.length-1)){
                    list.add(builder.toString());
                }
            }
        }
        OptionalInt max = list.stream().filter(str-> str.contains("0")).mapToInt(String::length).max();
        if(max.isPresent())
        System.out.println(max.getAsInt());

    }
}
