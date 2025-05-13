package Problems.array;

public class MaxAndMin {
  
public static int max(int[] arr)
{
   int max=0;

   for (int i : arr) {

    if(i>max)
    {
      max=i;
    }
   }
  return max;
}
public static int min(int[] arr)
{
int min=arr[0];
   for (int i : arr) {


    if(i<min)
    {
      min=i;
    }
   }
  return min;
}


public static void main(String[] args) {
  
  int[] num =sumandaverage.inputarr();
  
  int maximum=max(num);
  int min=min(num);
  System.out.println("the maximum element in the array is:" +maximum);
  System.out.println("the minimum element in the array is:" +min);


}


}
