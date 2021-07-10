public class GameStrategy {
	private boolean placedQueens[][] = new boolean[8][8];
	private int numQueens = 0;

	private int getColumn(int cellId) {
		// WRITE YOUR LOGIC HERE...................................		
		
		return cellId%8;	// just for the heck of it
	}
	
	private int getRow(int cellId) {
		// WRITE YOUR LOGIC HERE....................................
		
		return cellId/8	;	// just for the heck of it
	}

	public boolean isValidPosition(int cellId) {
		boolean isValid = true;

		if(numQueens == 8) throw new GameOverException();	// just return out of the method

		// the game is still on, so let us continue...
		
		int col = getColumn(cellId);
		
		int row = getRow(cellId);
		
		int i,j;
		for (i = 0;i < 8;i++) {//to check if the row is free
			if(placedQueens[i][col] == true) {
				isValid = false;
			}}
		for(j = 0;j<8;j++) {
			if(placedQueens[row][j] == true) {//to check column
				isValid = false;
			}}
		for (i = row,j=col;i>=0 && j>=0;i--,j--) {//to check tower right diagonal
			if(placedQueens[i][j] == true) {
				isValid = false;
			}}
		for (i = row,j=col;i<8 && j<8;i++,j++) {//to check upper right diagonal
			if(placedQueens[i][j] == true) {
				isValid = false;
			}}
		for (i = row,j=col;j>=0 && i<8;i++,j--) {//to check upper right diagonal
			if(placedQueens[i][j] == true) {
				isValid = false;
			}}
		for (i = row,j=col;i>=0 && j<8;i--,j++) {//to check lower right diagonal 
			if(placedQueens[i][j] == true) {
				isValid = false;
			}}
		
		if(isValid) {
			placedQueens[row][col] = true;
			numQueens++;
		}
		return isValid;
	}
}














