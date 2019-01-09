package com.chess.model;

public class SquareIndex {
	private int rank;
	private int file;
	
	public SquareIndex(int rank, int file) {
		super();
		this.rank = rank;
		this.file = file;
	}
	
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public int getFile() {
		return file;
	}
	public void setFile(int file) {
		this.file = file;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + file;
		result = prime * result + rank;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SquareIndex other = (SquareIndex) obj;
		if (file != other.file)
			return false;
		if (rank != other.rank)
			return false;
		return true;
	}
	
	
}
