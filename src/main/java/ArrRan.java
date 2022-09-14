import java.util.*;
import java.util.function.ToLongFunction;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class ArrRan {
    public static void main(String[] args) {

        //Створення списку з 10 елементів із рандомними чмслами

        //Створення списку з 10 елементів із рандомними чмслами

        List<Integer> integerArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integerArrayList.add(new Random().nextInt(10) + 1);
        }
        System.out.println(integerArrayList);

        //Зведення у квадрат кожного елемента
        //Згортка елементів у одне число

        int result = integerArrayList.stream().map(i -> i * i).reduce(0, Integer::sum);
        System.out.println("Sum = " + result);

        // Визначення кількості парних елементів

        long evens = integerArrayList.stream().filter(i -> (i % 2) == 0).count();
        System.out.println("Evens = " + evens);
    }}

