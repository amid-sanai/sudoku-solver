public class TestSudokuSolver {
	public static void main(String[] args) {
		int[][] table = {
			{6, 0, 0, 0, 3, 0, 0, 9, 0},
			{0, 0, 0, 7, 0, 4, 5, 8, 3},
			{0, 3, 0, 5, 0, 0, 1, 0, 0},
			{5, 6, 8, 4, 0, 0, 9, 0, 0},
			{0, 4, 0, 0, 0, 0, 6, 0, 0},
			{0, 0, 7, 6, 0, 3, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0, 0, 2},
			{9, 0, 0, 8, 7, 0, 3, 5, 0},
			{0, 0, 0, 0, 0, 6, 8, 0, 0}
		};
		SudokuSolver solver = new SudokuSolver(table);
		solver.printSolvedTable();
	}
}
