package Backtracking;

public class rateinamaze {
    public static int ratinmaze(int sr,int sc,int er,int ec)
    {
        if (sc > ec || sr > er) {
            return 0;
        }
        if (sr == er && sc == ec) {
            //System.out.println();
            return 1;
        }
        int down = ratinmaze(sr + 1, sc, er, ec);
        int right = ratinmaze(sr, sc + 1, er, ec);
        int total = down + right;
        return total;
    }
    public static void main(String[] args) {
        int row = 6;
        int col = 4;
int ways=ratinmaze(1, 1, row, col);System.out.println(ways);

    }
}
