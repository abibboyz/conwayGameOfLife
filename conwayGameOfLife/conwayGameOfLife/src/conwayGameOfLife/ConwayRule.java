package conwayGameOfLife;
import java.util.Random;

//class to solve conway rule: Game of Life
public class ConwayRule {

	//Main Function
	public static void main(String[] args) {
		/*
		 * 1.This line is for the number of cell to generate
		 * 2. here i took m,n as 200 for [200]X[200] matrix cell
		 * 3. You can change the values to small number like 5 to check
		 * 4.To change array matrix only this values need to be changed.
		 */
		int m = 200, n = 200;
		
		//This is actual array declared
		int[][] arr = new int[m][n];
		
		//To generate Random Number automatically for the biginning 
		//you can give it according to your need
		Random rand = new Random();
		
		//This loop automatically generate the array of size m x n.
		for(int i = 0; i < m; i++) {
			System.out.print("|");
			for(int j =0; j < n; j++) {
				arr[i][j] = rand.nextInt(2); 
				System.out.print(arr[i][j]);
			}
			System.out.print("|");
			System.out.println("");
		}
		System.out.println("Upcomming Generations");
		
		
		//Generating 100 of upcomming generations.
		// you can change the value of x to 5 to check 5 generations value
		int x=0;
		while(x<100) {
			System.out.println("-------");
			System.out.println(x+1 + " generation");
			System.out.println("-------");
			/*function call to generate next generation and accept 
			 * returned array for next generation.
			*/
			arr = nextGeneration(arr, m, n);
			x++;
			
			//this is just a seperation line added to seperate generations.
			System.out.println("*******************************************************************");
			System.out.println("*******************************************************************");
		}

	}
	
	//Function that helps to generate new Function
	public static int[][] nextGeneration(int board[][], int M, int N)
    {
		// For next generation cell
        int[][] next = new int[M][N];
 
        // Loop through every cell
        for (int l = 1; l < M - 1; l++)
        {
            for (int m = 1; m < N - 1; m++)
            {
                // finding no Of Neighbours that are alive
                int aliveNeighbours = 0;
                for (int i = -1; i <= 1; i++)
                    for (int j = -1; j <= 1; j++)
                        aliveNeighbours += board[l + i][m + j];
 
                // The cell needs to be subtracted from
                // its neighbours as it was counted before
                aliveNeighbours -= board[l][m];
 
                // Implementing the Rules of Life
 
                // Cell is lonely and dies
                if ((board[l][m] == 1) && (aliveNeighbours < 2))
                    next[l][m] = 0;
 
                // Cell dies due to over population
                else if ((board[l][m] == 1) && (aliveNeighbours > 3))
                    next[l][m] = 0;
 
                // A new cell is born
                else if ((board[l][m] == 0) && (aliveNeighbours == 3))
                    next[l][m] = 1;
 
                // Remains the same
                else
                    next[l][m] = board[l][m];
            }
        }
        //printing the next generation
        for (int i = 0; i < M; i++)
        {
            for (int j = 0; j < N; j++)
            {
                if (next[i][j] == 0)
                    System.out.print(0);
                else
                    System.out.print(1);
            }
            System.out.println();
        }
        //return the next generation array to main function to re-iterate
		return next;
    }
}