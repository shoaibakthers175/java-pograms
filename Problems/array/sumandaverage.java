package Problems.array;

import java.util.Scanner;

public class sumandaverage {


public static int[] inputarr()
{
    Scanner input=new Scanner(System.in);
    System.out.println("Welcome to array sum and average ");
    System.out.println("enter the size an array ");
    int num=input.nextInt();
    int[] nums=new int[num];
    int i=0;

    while (i<num) {
      System.out.println("please enter the element no" + (i+1) + ":");
      nums[i]=input.nextInt();
      i++;
    }
    return nums;

}

public static long sum(int[] arr){

  long total=0;

  for (int i : arr) {
    total+=i;
    
  }
  return total;

}

public static double average(int[] arr)
{
  long total=sum(arr);
  return (double)total/arr.length;
}
public static void main(String[] args) {
  System.out.println("Welcome to array sum and average ");
  int[] input=inputarr();
  
  long totalsum=sum(input);
  double average=average(input);

  System.out.println("The sum of the element is :" +totalsum);
  System.out.println("The average of the element is :" +average);


}
  
}
