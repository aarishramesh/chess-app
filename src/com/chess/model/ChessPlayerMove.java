package com.chess.model;

public final class ChessPlayerMove {
	private String fromMove;
	private String toMove;
	
	private int fromRank;
	private int fromFile;
	
	private int toRank;
	private int toFile;
	
	public ChessPlayerMove(String fromMove, String toMove, int fromRank, int fromFile, int toRank, int toFile) {
		super();
		this.fromMove = fromMove;
		this.toMove = toMove;
		this.fromRank = fromRank;
		this.fromFile = fromFile;
		this.toRank = toRank;
		this.toFile = toFile;
	}
	public String getFromMove() {
		return fromMove;
	}
	public void setFromMove(String fromMove) {
		this.fromMove = fromMove;
	}
	public String getToMove() {
		return toMove;
	}
	public void setToMove(String toMove) {
		this.toMove = toMove;
	}
	public int getFromRank() {
		return fromRank;
	}
	public void setFromRank(int fromRank) {
		this.fromRank = fromRank;
	}
	public int getFromFile() {
		return fromFile;
	}
	public void setFromFile(int fromFile) {
		this.fromFile = fromFile;
	}
	public int getToRank() {
		return toRank;
	}
	public void setToRank(int toRank) {
		this.toRank = toRank;
	}
	public int getToFile() {
		return toFile;
	}
	public void setToFile(int toFile) {
		this.toFile = toFile;
	}
	
	
	
}
