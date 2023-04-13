package Algoritmos_ordenacao;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Sort {
    public static <T> void insertionSort(BiFunction<T, T, Integer> cmp, List<T> list, int esq, int dir) {
        for (int i=esq; i<=dir; i++) {
            T temp = list.get(i);
            int j = i;
            while (j > esq && cmp.apply(list.get(j-1), temp) == 1) {
                list.set(j, list.get(j-1));
                j--;
            }
            list.set(j, temp);
        }
    }

}