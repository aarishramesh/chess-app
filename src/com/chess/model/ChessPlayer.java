package com.chess.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChessPlayer {
	private Map<SquareIndex, ChessBoardSquare> pieces;
	private List<ChessPlayerMove> moves;
	
	public ChessPlayer() {
		
	}

	public List<ChessPlayerMove> getMoves() {
		return moves;
	}

	public void setMoves(List<ChessPlayerMove> moves) {
		this.moves = moves;
	}
	
	public void addMove(ChessPlayerMove move) {
		if (moves == null) {
			moves = new ArrayList<ChessPlayerMove>();
		}
		moves.add(move);
	}

	public Map<SquareIndex, ChessBoardSquare> getPieces() {
		if (pieces == null)
			pieces = new HashMap<SquareIndex, ChessBoardSquare>();
		return pieces;
	}

	public void setPieces(Map<SquareIndex, ChessBoardSquare> pieces) {
		this.pieces = pieces;
	}
	
	
}
