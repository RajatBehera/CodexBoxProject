package javatraining.sample.arrays;

public class ForEachArrays {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int i=10;
        System.out.println("Array value using for each loop");
        for (int ar:arr)
        {

            System.out.println(i++);
        }
    }
}
