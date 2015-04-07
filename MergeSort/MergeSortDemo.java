import java.util.Arrays;

/**
   This program demonstrates the merge sort algorithm by
   sorting an array that is filled with random numbers.
*/
public class MergeSortDemo
{  
   public static void main(String[] args)
   {  
      String[] a = new String[8];
      a[0] = "these";
      a[1] = "two";
      a[2] = "next";
      a[3] = "to";
      a[4] = "me";
      a[5] = "are";
      a[6] = "useless";
      System.out.println(Arrays.toString(a));

      MergeSorter.sort(a);

      System.out.println(Arrays.toString(a));
   }
}

