package com.cjss.rahul;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here

      /*  List<String> phones =
                Arrays.asList("IPhone 12","IPhone 11",
                        "Samsung Galaxy S10", "OnePlus Nord",
                        "Samsung Galaxy S20", "Nokia 1100");

        List<String> l1 = phones.stream().filter(s-> s.startsWith("S")).sorted().collect(Collectors.toList());
        List<String> result = phones ;
        phones.stream().filter(s->s.startsWith("S")).map(a -> " * "+a).forEach(a -> System.out.println(a));


        System.out.println(l1);
        System.out.println(result);
        result.stream().map(a -> " * "+a).forEach(a -> System.out.println(a));
        long count = phones.stream() .count();

        System.out.println(count);

       */
        List<Integer> nl = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13);
        List<Integer> f = nl.stream().filter(a -> a%3 == 0).collect(Collectors.toList());
        System.out.println(f);
        List<String> s = nl.stream().map(a -> String.valueOf(a)).filter(a -> a.contains("3")).collect(Collectors.toList());
        System.out.println(s);

        List<Integer> t = f.stream().map(a -> a*a ).collect(Collectors.toList());
        System.out.println(t);

       Integer sum = nl.stream().reduce(0,(x,y)->x+y);
       System.out.println(sum);
      //  nl.stream().filter(a -> a%5==0).forEach(a -> System.out.println(a*a));
        List<Integer> t2= nl.stream().filter(a -> a%5==0).map(x->x*x).collect(Collectors.toList());
        System.out.println(t2);

        List<String> str = Arrays.asList("rahul","sindhu", "karthik","sunil","siddharth","varun","shambhavi","holi","kudala");
        List<String> phones = Arrays.asList("IPhone 12","IPhone 11", "Sony","Samsung Galaxy S10", "OnePlus Nord", "Samsung Galaxy S20", "Nokia 1100");
        List<String> ms = str.stream().filter(a -> a.length()<6).sorted().collect(Collectors.toList());
      //List<String> j = str.stream().filter(){x -> phones.stream().map()};
        System.out.println(ms);
        System.out.println("*************************************************************");
        List<String> res = phones.stream()
                .filter(j->j.startsWith("S") || j.startsWith("O"))
                .collect(Collectors.toList());
        System.out.println(res);
      //  List<Integer> test = Arrays.asList();
        System.out.println("*************************************************************");

      //  System.out.println(test.hashCode());

        //Optional<Integer> o = nl.stream().reduce((total,num) -> total + num);
       // System.out.println(o.get());
        //str.forEach(System.out::println);

        List<String> o = str.stream().filter(a -> (a.startsWith("k")) || (a.startsWith("s")) ).collect(Collectors.toList());
       // o.stream().forEach(result -> System.out.println(" hi " + result));

    }
}