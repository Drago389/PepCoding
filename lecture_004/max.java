import java.util.Scanner;
public class array{
    public static Scanner scn=new Scanner(System.in);
      public static  void main(String[] args){
          int n = scn.nextInt();
          rotate(arr,-2);
          public static void rotate(int[] arr,int r){
              r%arr.length:r;
              int[] ans=new int[arr.length];
              int k=0;
              for(int i=r;i<arr.length;i++){
                  ans[k]=arr[i];
                  k++;
              }
              for(int i=0;i)
          }