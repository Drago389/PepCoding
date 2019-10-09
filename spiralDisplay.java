import java .util.scanner;
public class spiralDisplay{
    public static Scanner scn=new Scanner(System.in);
    public static void spiralDisplay(int[][]args){
        int rmin = 0;
        int cmin = 0;
        int rmax =arr.length-1;
        int cmax =arr[0].length-1;
        int tne = arr.length * arr[0].length;
        while(tne>0){
            for(int i = cmin;i<=cmax && tne>0;i++){
                System.out.print(arr[rmin][i] + " ");
                tne--;
            }
            rmin++;
            for(int i = rmin;i<=rmax;i++){
                System.out.print(arr[i][cmax] + " ");
                tne--;                           

            }
            cmax--;
            for(int i =cmax;i>=cmin && tne>0;i--){
                System.out.print(arr[rmax][i] + " ");
                tne--;

            }
            rmax--;
            for(int i = rmax;i>=rmin && tne>0;i--){
                System.out.print(arr[i][cmin] + " ");
                tne--;
            }
        }cmin++;
    }
}public static void input(int[]

)