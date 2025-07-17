package org.example1.q2;

public class BinarySearch1 {


    private final Sorter sorter;

    public BinarySearch1(Sorter sorter)
    {
        this.sorter=sorter;
    }
    public int binarySearch(int[] numbers,int target)
    {
        numbers=sorter.sort(numbers);

        //logic of binarySearch
        return 3;
    }
}
