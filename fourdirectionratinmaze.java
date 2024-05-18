package Backtracking;
//Here we are going to four directions also 
public class fourdirectionratinmaze {
    public static void print(int sr, int er, int sc, int ec, String s, boolean[][] visited) {
        if (sr > er || sc > ec)
            return;

        if (sr < 0 || sc < 0)
            return;

        if (visited[sr][sc] == true)
            return;

        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }

        visited[sr][sc] = true;
        print(sr + 1, er, sc, ec, s+"D", visited);
        print(sr, er, sc + 1, ec, s+"R", visited);
        print(sr, er, sc - 1, ec, s+"L", visited);
        print(sr - 1, er, sc, ec, s+"u", visited);

        visited[sr][sc] = false;
    }
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        boolean isvisited[][] = new boolean[3][3];
      print(0, row-1, 0, col-1, " ", isvisited);
    }
}


