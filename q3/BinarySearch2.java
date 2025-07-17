package org.example1.q3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch2 {


    @Autowired
    private Sorter1 sorter;

    public int binarySearch(int[] numbers,int target)
    {
        numbers=sorter.sort(numbers);

        //logic of binarySearch
        return 3;
    }
}
