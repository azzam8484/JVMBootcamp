package org.example1.q2;

import org.example1.q1.BinarySearch;

public class App2
{
    public static void main( String[] args )
    {
        Sorter sorter=new BubbleSort1();
        //can give quickSort() also if present;

        BinarySearch1 bs=new BinarySearch1(sorter);
        int index=bs.binarySearch(new int[] {4,2,6,2,76,2},5);
        System.out.println("Index: " + index);
    }
}
