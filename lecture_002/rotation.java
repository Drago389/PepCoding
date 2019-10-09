import java.util.Scanner;



public class rotation{
    public static Scanner scn=new Scanner(System.in);
      public static  void main(String[] args){
          int n = scn.nextInt();
          int r = scn.nextInt();
          System.out.println(rotation(n,r));//
      }
      public static int noOfDigits(int n){
           int count_ = 0;
           while(n!=0){
               n /= 10;
               count_++;
           }
               return count_;

           }
           
           public static int rotation(int n, int r){
               int digit= noOfDigits(n);
               r%=digit;
               int mult = 1;
               int div = 1;
               for(int i = 1;i<=digit;i++){
                   if(i<=r){
                       mult*=10;
                   } else{
                       div*=10;
                   }
               }
                   int rem = n%div;
                   n/=div;
                   return(rem*mult+n);
               
           }
} 


     

