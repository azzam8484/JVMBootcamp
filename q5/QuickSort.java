package org.example1.q5;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("QuickQuick")
public class QuickSort implements Sorter1 {
    @Override
    public int[] sort(int[] numbers) {
        //logic for quickSort
        System.out.println("Used Quick Sort");
        return numbers;
    }
}
