package Backtracking;

import java.util.Scanner;
//this is the only two path problem we have to go either down or right
public class printpath {
   public static void path(int sc,int ec,int sr,int er,String s)
   {
       if (sc > ec || sr > er) {
           return;
       }
       if(sr==er&&sc==ec)
       {
           System.out.println(s);
           return;
       }
       //down
       path(sc, ec, sr + 1, er, s + "D");
       
       //right
       path(sc+1, ec, sr, er, s+ "R");
   }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of the row");
        int row = sc.nextInt();
        System.out.println("enter the value of the column");
        int col = sc.nextInt();
        path(1, col, 1, row, " ");

    }
}
