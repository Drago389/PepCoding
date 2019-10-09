import java.util.Scanner;
public class array{
    public static Scanner scn=new Scanner(System.in);
      public static  void main(String[] args){
          int n = scn.nextInt();
          int[]arr=new int[n];
          input(arr);
      }
      public static void input(int[] arr){
          for(int i =0;i<arr.length;i++){
              arr[i] = scn.nextInt();
          }
          display(arr);
      }
      public static void display(int[] arr){
          for(int i : arr){
              System.out.print(i + " ");
          }
    }
}
