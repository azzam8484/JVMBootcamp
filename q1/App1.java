package org.example1.q1;

public class App1 {
    public static void main( String[] args )
    {
        BinarySearch bs=new BinarySearch();
        int answer=bs.binarySearch(new int[] {1,4,2,6,8,3},45);
        System.out.println(answer);
    }
}
