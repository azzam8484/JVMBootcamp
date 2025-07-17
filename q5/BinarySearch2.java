package org.example1.q5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch2 {


    @Autowired
//    @Qualifier("QuickQuick")
    private Sorter1 quickSort;

    public int binarySearch(int[] numbers,int target)
    {
        numbers=quickSort.sort(numbers);

        //logic of binarySearch
        return 3;
    }
}
