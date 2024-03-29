import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class TestClient {

    public static void main(String[] args) {

        // create initial board from file
        //In in = new In(args[0]);
        In in = new In("/home/skatta/workspace/Algo1Week4/8puzzle/puzzle07.txt");
        int n = in.readInt();
        int[][] blocks = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                blocks[i][j] = in.readInt();
    
        Board initial = new Board(blocks);

        // solve the puzzle
        Solver solver = new Solver(initial);

        // print solution to standard output
        if (!solver.isSolvable())
            StdOut.println("No solution possible");
        else {
            StdOut.println("Minimum number of moves = " + solver.moves());
            for (Board board : solver.solution())
                StdOut.println(board);
        }
    }

}
