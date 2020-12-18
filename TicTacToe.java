import java.util.*;
public class TicTacToe {
	public static void main(String[] args) {
		int [][] board = new int[3][3];
		System.out.println("Welcome to Tic Tac Toe.");
		System.out.println();
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		boolean xIsTrue = true;
		int maxTurns = 9;
		while(maxTurns > 0) {
			if(xIsTrue) {
				System.out.println("Enter your co-ordinates for the symbol X");
				xIsTrue =! xIsTrue;
			}
			else {
				System.out.println("Enter your co-ordinates for the symbol O");
				xIsTrue =! xIsTrue;
			}
			String[] location = new String[2];
			location[0] = scan.nextLine();
			location[1] = scan.nextLine();
			int row = -1;
			int col = -1;
			try {
				row = Integer.parseInt(location[0]);
				col = Integer.parseInt(location[1]);
			}catch(Exception e) {
				System.out.println("Please enter valid co-ordinates.");
			}
			if(row < 0 || col < 0 || row > 2 || col > 2) {
				System.out.println("Please enter valid co-ordinates.");
				continue;
			}
			if(xIsTrue) {
				if(board[row][col] != 0) {
					System.out.println("This square is already used. Enter Valid co-ordinates.");
					continue;
				}
				board[row][col] = -1;
			}
			else {
				if(board[row][col] != 0) {
					System.out.println("This square is already used. Enter Valid co-ordinates.");
					continue;
				}
				board[row][col] = 1;
			}
			for(int i = 0; i < board.length; i++) {
				for(int j = 0; j < board[i].length; j++) {
					if(board[i][j] == 0) {
						System.out.print(" - ");
					}else if(board[i][j] == 1) {
						System.out.print(" X ");
					}
					else if(board[i][j] == -1) {
						System.out.print(" O ");
					}
				}
				System.out.println();
			}
			boolean winner = checkForWinner(board, row, col);
			if(winner) {
				if(xIsTrue) {
					System.out.println("'O' won the game.");
				}
				if(!xIsTrue) {
					System.out.println("'X' won the game.");
				}
				break;
			}
		}
	}
	
	public static boolean checkForWinner(int[][] b, int i, int j) {
		boolean isTopLeftCorner = checkForTopLeftCorner(i, j);
		boolean isTopRightCorner = checkForTopRightCorner(i, j);
		boolean isBottomLeftCorner = checkForBottomLeftCorner(i, j);
		boolean isBottomRightCorner = checkForBottomRightCorner(i, j);
		boolean isTopEdge = checkForTopEdge(i, j);
		boolean isLeftEdge = checkForLeftEdge(i, j);
		boolean isRightEdge = checkForRightEdge(i, j);
		boolean isBottomEdge = checkForBottomEdge(i, j);
		boolean isCenter = checkForCenterSquare(i, j);
		if(isTopLeftCorner) {
			return ((b[0][0] == b[1][1] && b[1][1] == b[2][2])
					|| (b[0][0] == b[0][1] && b[0][1] == b[0][2])
					|| (b[0][0] == b[1][0] && b[1][0] == b[2][0]));
		}
		if(isTopRightCorner) {
			return ((b[0][2] == b[1][2] && b[1][2] == b[2][2])
					|| (b[0][0] == b[0][1] && b[0][1] == b[0][2])
					|| (b[0][2] == b[1][1] && b[1][1] == b[2][0]));
		}
		if(isBottomLeftCorner) {
			return ((b[2][0] == b[1][0] && b[1][0] == b[0][0])
					|| (b[2][0] == b[2][1] && b[2][1] == b[2][2])
					|| (b[0][2] == b[1][1] && b[1][1] == b[2][0]));
		}
		if(isBottomRightCorner) {
			return ((b[0][2] == b[1][2] && b[1][2] == b[2][2])
					|| (b[0][0] == b[1][1] && b[1][1] == b[2][2])
					|| (b[2][0] == b[2][1] && b[2][1] == b[2][2]));
		}
		if(isTopEdge) {
			return ((b[0][1] == b[1][1] && b[1][1] == b[2][1])
					|| (b[0][0] == b[0][1] && b[0][1] == b[0][2]));
		}
		if(isLeftEdge) {
			return ((b[0][0] == b[1][0] && b[1][0] == b[2][0])
					|| (b[1][0] == b[1][1] && b[1][1] == b[2][1]));
		}
		if(isRightEdge) {
			return ((b[0][0] == b[1][0] && b[1][0] == b[2][0])
					|| (b[0][2] == b[1][2] && b[1][2] == b[2][2]));
		}
		if(isBottomEdge) {
			return ((b[2][0] == b[2][1] && b[2][1] == b[2][2])
					|| (b[2][1] == b[1][1] && b[1][1] == b[0][1]));
		}
		if(isCenter) {
			return ((b[0][0] == b[1][1] && b[1][1] == b[2][2])
					|| (b[0][2] == b[1][1] && b[1][1] == b[2][0])
					|| (b[1][0] == b[1][1] && b[1][1] == b[2][0])
					|| (b[2][1] == b[1][1] && b[1][1] == b[0][1]));
		}
		return false;
	}
	public static boolean checkForTopLeftCorner(int i, int j) {
		return (i == 0 && j == 0);
	}
	
	public static boolean checkForTopRightCorner(int i, int j) {
		return (i == 0 && j == 2);
	}
	
	public static boolean checkForBottomLeftCorner(int i, int j) {
		return (i == 2 && j == 0);
	}
	
	public static boolean checkForBottomRightCorner(int i, int j) {
		return (i == 2 && j == 2);
	}
	
	public static boolean checkForTopEdge(int i, int j) {
		return (i == 0 && j == 1);
	}
	
	public static boolean checkForLeftEdge(int i, int j) {
		return (i == 1 && j == 0);
	}
	
	public static boolean checkForRightEdge(int i, int j) {
		return (i == 1 && j == 2);
	}
	
	public static boolean checkForBottomEdge(int i, int j) {
		return (i == 2 && j == 1);
	}
	
	public static boolean checkForCenterSquare(int i, int j) {
		return (i == 1 && j == 1);
	}

}
//	private final int[][] board; 
//	private final int n;
//	public TicTacToe(final int n) {
//		this.n = n;
//		board = new int[n][n];
//	}
//	s
//	public int move(int player, int row, int col) throws IllegalArgumentException{
//		if(row < 0 || col < 0 || row >= n || col >= n) {
//			throw new IllegalArgumentException("Out of board boundary.");
//		}else if(board[row][col] != 0) {
//			throw new IllegalArgumentException("The square is already occupied.");
//		}else if(player != 1 && player != 0) {
//			throw new IllegalArgumentException("Player Invalid.");
//		}else {
//			player = (player == 0)?-1: 1;
//			board[row][col] = player;
//			boolean winRow = true, winCol = true, winDiag = true, winDiagReverse = true;
//			for(int i = 0; i < n; i++) {
//				if(board[row][i] != player) 
//					winRow = false;
//				if(board[i][col] != player)
//					winCol = false;
//				if(board[i][i] != player)
//					winDiag = false;
//				if(board[i][n - 1 - i] != player)
//					winDiagReverse = false;
//			}
//		}
//	}
