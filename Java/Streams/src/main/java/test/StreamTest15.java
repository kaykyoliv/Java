package test;

import dominio.Category;
import dominio.LightNovel;
import dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import static dominio.Promotion.NORMAL_PRICE;
import static dominio.Promotion.UNDER_PROMOTION;
import static java.util.stream.Collectors.*;

public class StreamTest15 {

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long sum = 10_000_000;

        sumFor(sum);
        sumStreamIterate(sum);
        sumParallelStreamIterate(sum);
        sumLongStreamIterate(sum);
        sumParallelLongStreamIterate(sum);

    }
    private static void sumFor(long sum){
        System.out.println("Sum for");
        long result = 0;
        long init = System.currentTimeMillis();
        for(long i = 1; i < sum; i++){
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumStreamIterate(long sum){
        System.out.println("Sum sumStreamIterate");

        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).limit(sum).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumParallelStreamIterate(long sum){
        System.out.println("Sum sumParallelStreamIterate");

        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).parallel().limit(sum).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumLongStreamIterate(long sum){
        System.out.println("Sum sumLongStreamIterate");

        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, sum).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumParallelLongStreamIterate(long sum){
        System.out.println("Sum sumParallelLongStreamIterate");

        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, sum).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }
}
