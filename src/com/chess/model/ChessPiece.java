package com.chess.model;

public enum ChessPiece {
	
	King(Integer.MAX_VALUE), Queen(9), Rook(5), Bishop(3), Knight(3), Pawn(1);
	
	int points;
	
	ChessPiece(int points) {
		this.points = points;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}
	
}
