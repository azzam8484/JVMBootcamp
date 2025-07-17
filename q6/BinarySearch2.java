package org.example1.q6;

import org.example1.q2.BinarySearch1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch2 {


    @Autowired
    private Sorter1 sorter;

    public BinarySearch2(Sorter1 sorter)
    {
        System.out.println("Constructor injection happening");
        this.sorter=sorter;
    }
    public int binarySearch(int[] numbers,int target)
    {
        numbers=sorter.sort(numbers);

        //logic of binarySearch
        return 3;
    }
}
