package Algoritmos_ordenacao;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Sort {
    public static <T> void insertionSort(BiFunction<T, T, Integer> cmp, List<T> list, int ini, int fim, int ordem) {
        for (int i=ini; i<=fim; i++) {
            T temp = list.get(i);
            int j = i-1;
            while (j >= 0 && cmp.apply(list.get(j), temp)*ordem == 1) {
                list.set(j+1, list.get(j));
                j--;
            }
            list.set(j+1, temp);
        }
    }

}