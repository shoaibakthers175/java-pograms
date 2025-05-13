package Problems.array;

import java.util.Scanner;

public class arraysearching {

  public static void main(String[] args) {
    int arr[]={10,20,30,40};

    Scanner input=new Scanner(System.in);
    System.out.println("Enter the element you want to search in an list of array:");
    int num=input.nextInt();
    if (isfound(arr, num)) {
       System.out.println("element found");
    }
    else
    {
      System.out.println("element not found");
    }

    
  }


  public static boolean isfound(int arr[],int num)
  {
    int i=0;
    while (i<arr.length) 
    {
     if (arr[i]==num) {
      return true;
     } 
     i++;
    }
    return false;
  }
  
}
