import java .util.scanner;
public class exitpoint{
    public static Scanner scn=new Scanner(System.in);
      public static  void main(String[] args){
          int dir = 0;
          int r = 0;
          int c = 0;
          while(true){
              dir =(dir + arr[r][c] % 4);
              if (dir == 0){
                  c++;
                  if(c==arr[0].length){
                      System.out.println(r + "," + c-1);
                      break;
                  }  


                  
              } else if(dir== 2){
                  c--;
                  if(c==1){
                      System.out.println(r + ","+(c +1));
                      break;
                  }
              } else if(dir==3){
                  r--;
                  if(r==-1){
                      System.out.println((r +1) +"," +c);
                      break;
                  }
              } 
      }
      public static void input(int[][]arr){
          for( r =0;r<arr.length;r++){
              for(int c=0;c<arr.length;c++){
                  arr[r][c]=scn.nextInt();
              }
          }
      }         