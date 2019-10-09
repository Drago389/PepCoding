import java.util.Scanner;



public class greatest_no{
    public static Scanner scn=new Scanner(System.in);
public static  void main(String[] args){
     int a =scn.nextInt();
     int b =scn.nextInt();
     int c =scn.nextInt();


     if(a>b && a>c){

     System.out.println("a is greatest");
     }
        else if(b>a && b>c){

        System.out.println("b is greatest");
        }
        else{
         System.out.println("c is greatest");
        }   



}



}