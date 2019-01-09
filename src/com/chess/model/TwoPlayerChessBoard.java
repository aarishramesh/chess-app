package com.chess.model;

import com.chess.model.ChessBoardSquare.SquareColour;

public final class TwoPlayerChessBoard extends Board {
	
	private static int ranks = 8;
	private static int files = 8;
	
	private ChessBoardSquare[][] boardSquares;
	
	public TwoPlayerChessBoard() {
		init();
	}
	
	private void init() {
		boardSquares = new ChessBoardSquare[ranks][files];
		SquareColour colour = SquareColour.WHITE;
		//boolean colourToggle = true;
		for (int i = ranks - 1; i >= 0; i--) {
			for (int j = 0; j < files; j++) {
				ChessPiece piece = getInitPieceForSquare(i, j);
				SquareIndex index = new SquareIndex(i, j);
				boardSquares[i][j] = new ChessBoardSquare(index, colour, piece);
			}
		}
	}
	
	private ChessPiece getInitPieceForSquare(int rank, int file) {
		if (rank == 6 || rank == 1) {
			return ChessPiece.Pawn;
		} else if (rank == 0 || rank == 7) {
			if (file == 0 || file == 7) {
				return ChessPiece.Rook;
			} else if (file == 1 || file == 6) {
				return ChessPiece.Knight;
			} else if (file == 2 || file == 5) {
				return ChessPiece.Bishop;
			} else if (file == 3) {
				return ChessPiece.Queen;
			} else  if (file == 4) {
				return ChessPiece.King;
			}
		}
		return null;
	}
	
	public static int getRanks() {
		return ranks;
	}

	public static void setRanks(int ranks) {
		TwoPlayerChessBoard.ranks = ranks;
	}

	public static int getFiles() {
		return files;
	}

	public static void setFiles(int files) {
		TwoPlayerChessBoard.files = files;
	}

	public ChessBoardSquare[][] getBoardSquares() {
		return boardSquares;
	}

	public void setBoardSquares(ChessBoardSquare[][] boardSquares) {
		this.boardSquares = boardSquares;
	}
	
}