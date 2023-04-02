package Consultation_30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       // Есть список с целыми числами
        // нужно написать метод который вернет список
      //  без элементов, которые больше заданного числа n/
     // [3,1,6,8] 3 -> [3,1]
     // И  протестировать

        Main main = new Main();

        List<Integer> list = Arrays.asList(3,1,6,8);
        System.out.println(main.isWithoutMoreThanRequired(list,3)); //[3,1]
        //----------------------------------------------------------------\\


        List<String> list1 = Arrays.asList("bb", "a", "ddd");
        System.out.println(main.findMinOrMax(list1));  // a
    }
    public  List<Integer> isWithoutMoreThanRequired (List <Integer> ints , int n ) {
        List<Integer> result = new ArrayList<>();

        for ( int i : ints){
            if (i<=n)
                result.add(i);
        }
        return result;

    }
    /* 2. есть лист строк. Написать метод возвразаюший строку которая встречаетсч в листе ранбше
    самую короткую или самую длинную.
    лист не пустой и строки все разные
    bb  a ddd -> a
     */

    public  String findMinOrMax (List<String> strings){
        String shortest = strings.get(0);
        int indexShortest = 0;// 1
        String longest = strings.get(0);
        int indexLongest = 0;// 2

        for (int i = 0; i <strings.size(); i++){
            if (strings.get(i).length() < shortest.length()){
                shortest= strings.get(i); // 1 (a)
                indexShortest = i;//1
            }else  if (strings.get(i).length() > longest.length()){
                longest = strings.get(i);//3 (ddd)

                indexLongest = i; // 2

            }
        }
        if (indexLongest > indexShortest) {
            return shortest;
        }

        return longest;
    }
}
