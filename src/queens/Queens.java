package queens;

public class Queens {

	private static String queens ="0000001000010000010000000000"
			+ "100000000100000100000000100001000000";
	
	private static char[][] board = new char[8][8];
	
	private static boolean isValid;
	
	
	private static void printBoard(char[][]board){
		for (int i = 0; i < 8; ++i) {
		    for (int j = 0; j < 8; ++j) {
		        System.out.print(board[i][j] + " ");
		    }
		    System.out.print("\n");
		}
	}
	private static char[][] createBoard(char [][] board){
		for (int i = 0; i < 8; ++i) {
		    for (int j = 0; j < 8; ++j) {
		        board[i][j] = queens.charAt(8 * i + j);
		    }
		}
		return board;
	}
	
	private static boolean checkBoard(char[][] board){
		int countQ;
		boolean valid=true;
		for (int i = 0; i < 8; ++i) {
			countQ=0;
		    for (int j = 0; j < 8; ++j) {
		       if(board[i][j]=='1'){
		    	   ++countQ;
		    	   if(countQ>1){
			    	   valid=false;}
		       }
		    }
		}
		return valid;
	}
	
	public static void answer(boolean isValid){
		if(isValid ==true){
			System.out.println("The puzzle is solved!");
		}else{
			System.out.println("The puzzle is not solved!");
		}
	}
	
	public static void main(String [] args){
		
		board= createBoard(board);
		printBoard(board);
		isValid=checkBoard(board);
		answer(isValid);
	}
}
