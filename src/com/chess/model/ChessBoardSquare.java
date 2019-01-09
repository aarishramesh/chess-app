package com.chess.model;

public final class ChessBoardSquare extends BoardSquare {
	
	private SquareColour colour; 
	private SquareIndex index;
	private ChessPiece piece;
	private boolean isOccupied;
	
	public ChessBoardSquare(SquareIndex index, SquareColour colour, ChessPiece piece) {
		this.colour = colour;
		this.piece = piece;
		if (piece != null)
			this.isOccupied = true;
	}
	
	public static enum SquareColour {
		WHITE, BLACK;
	}

	public SquareColour getColour() {
		return colour;
	}

	public void setColour(SquareColour colour) {
		this.colour = colour;
	}

	public ChessPiece getPiece() {
		return piece;
	}

	public void setPiece(ChessPiece piece) {
		this.piece = piece;
	}

	public boolean isOccupied() {
		return isOccupied;
	}

	public void setOccupied(boolean isOccupied) {
		this.isOccupied = isOccupied;
	}

	public SquareIndex getIndex() {
		return index;
	}

	public void setIndex(SquareIndex index) {
		this.index = index;
	}
	
	
}
