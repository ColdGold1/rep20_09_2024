package sstreams;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainS {

    public static void main(String[] args) {

        List<String> bingoPool = new ArrayList<>(75);

        int start = 1;
        for (char c : "BINGO".toCharArray()) {
            for (int i = start; i < (start + 15); i++){
                bingoPool.add("" + c + i);
//                System.out.println("" + c + i);
            }
            start += 15;
        }

        Collections.shuffle(bingoPool);

        for (int i = 0; i < 15; i++){
            System.out.println(bingoPool.get(i));
        }
        System.out.println("--------------------------");

        List<String> firstOnes = new ArrayList<>(bingoPool.subList(0, 15));
        firstOnes.sort(Comparator.naturalOrder());
        firstOnes.replaceAll(s -> {
            if (s.indexOf("G") == 0 || s.indexOf("O") == 0){
                String updated = s.charAt(0) + "-" + s.substring(1);
                System.out.printf(updated + " ");
                return updated;
            }
            return s;
        });
        System.out.println("\n--------------------------");
        for (int i = 0; i < 15; i++){
            System.out.println(bingoPool.get(i));
        }
        System.out.println("--------------------------");


        var tempStream = bingoPool.stream()
                .limit(15)
                .filter(s -> s.indexOf("G") == 0 || s.indexOf("O") == 0)
                .map(s -> s.charAt(0) + "-" + s.substring(1))
                .sorted();
//                .forEach(s -> System.out.printf(s + " "));
        tempStream.forEach(s -> System.out.printf(s + " "));
        System.out.println();

        String[] strings = {"One", "Two", "Three"};

        var firstStream = Arrays.stream(strings)
                .sorted(Comparator.reverseOrder());
//                .forEach(System.out::println);

        var secondStream = Stream.of("Six","Five","Four")
                .map(String::toUpperCase);
//                .forEach(System.out::println);

        Stream.concat(secondStream,firstStream)
                .map(s -> s.charAt(0) + "-" + s)
                .forEach(System.out::println);

        Map<Character, int[]> myMap = new LinkedHashMap<>();
        int bingoIndex = 1;
        for (char c : "BINGO".toCharArray()){
            int[] numbers = new int[15];
            int labelNo = bingoIndex;
            Arrays.setAll(numbers, i -> i + labelNo);
            myMap.put(c,numbers);
            bingoIndex += 15;
        }

        myMap.entrySet()
                .stream()
                .map(e -> e.getKey() + " has range: " + e.getValue()[0] + " - " +
                        e.getValue()[e.getValue().length - 1])
                .forEach(System.out::println);

        Random random = new Random();
        Stream.generate(() -> random.nextInt(2))
                .limit(10)
                .forEach(s -> System.out.printf(s + " "));
        System.out.println();

        IntStream.iterate(1,n -> n + 1)
                .filter(MainS::isPrime)
                .limit(20)
                .forEach(s -> System.out.printf(s + " "));
        System.out.println();

        IntStream.iterate(1, n -> n + 1)
                .limit(100)
                .filter(MainS::isPrime)
                .forEach(s -> System.out.printf(s + " "));
        System.out.println();

        IntStream.iterate(1,n -> n <= 100, n -> n + 1)
                .filter(MainS::isPrime)
                .forEach(s -> System.out.printf(s + " "));
        System.out.println();

        IntStream.rangeClosed(1,100)
                .filter(MainS::isPrime)
                .forEach(s -> System.out.printf(s + " "));
        System.out.println();
    }

    private static boolean isPrime(int someNumber){

        if (someNumber <= 1){
            return false;
        }

        for (int i = 2; i <= someNumber / 2; i++){
            if (someNumber % i == 0){
                return false;
            }
        }

        return true;
    }
}
