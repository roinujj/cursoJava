package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Jota");
        list.add("Mari");
        list.add("Gabi");
        list.add("Lili");
        list.add(2, "Amor");
        list.add(3, "Teste1");
        list.add(3, "Teste2");
        list.add(0, "Primeiro");

        for (String obj: list){
            System.out.println(obj);

        }
        System.out.println(list.size());

        list.remove("Amor");
        list.remove(0);
        list.removeIf( x -> x.charAt(0)=='T');


        for (String obj: list){
            System.out.println(obj);

        }

        System.out.println("Index of Jota: " + list.indexOf("Jota"));
        System.out.println("Index of Amor: " + list.indexOf("Amor"));

        String name = list.stream().filter(x -> x.charAt(3) == 'i').findFirst().orElse(null); // cria um stream da lista e filtra
        System.out.println(name);

        name = list.stream().filter(x -> x.charAt(3) == 'z').findFirst().orElse(null);
        System.out.println(name);

        System.out.println("===============");

        //Cria uma sublista com conteudo filtrado do stream

        List<String> result = list.stream().filter(x->x.charAt(3)=='i').collect(Collectors.toList());
        for (String x: result){
            System.out.println(x);
        }



    }
}
