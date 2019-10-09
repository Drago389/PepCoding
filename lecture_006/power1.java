import java.util.Scanner;
public class power1{
    public static Scanner scn=new Scanner(System.in);
      public static  void main(String[] args){
          int a= scn.nextInt();
          int b = scn.nextInt();
          System.out.println(power1(a,b));
      }
      public static int power1(int a,int b){
          if(b==0){
              return 1;
          }
          int res= power1(a,b-1);
          return res*a
      }
      public static int power(int a,int b){
          if(b==0){
              
          }
      }