package com.chess.service;

import com.chess.model.ChessPlayer;
import com.chess.model.ChessPlayerMove;
import com.chess.model.SquareIndex;

public class TwoPlayerChessAppService {
	
	private ChessPlayer player1;
	private ChessPlayer player2;
	
	public TwoPlayerChessAppService(ChessPlayer player1, ChessPlayer player2) {
		this.player1 = player1;
		this.player2 = player2;
	}
	
	public boolean processMove(ChessPlayerMove move, boolean isPlayer1) {
		SquareIndex fromMoveIndex = new SquareIndex(move.getFromRank(), move.getToFile());
		SquareIndex toMoveIndex = new SquareIndex(move.getToRank(), move.getToFile());
		if (isPlayer1) {
			if (player1.getPieces().containsKey(fromMoveIndex)) {
				if (!player1.getPieces().containsKey(toMoveIndex)) {
					if (fromMoveIndex.getRank() < toMoveIndex.getRank()) {
						int diff = toMoveIndex.getRank() - fromMoveIndex.getRank();
						if (diff > 0) {
							if (((fromMoveIndex.getRank() == 1 && diff == 2)
									|| diff == 1)
								&& fromMoveIndex.getFile() == toMoveIndex.getFile()) {
								player1.addMove(move);
								return true;
							}
						}
					}
					/**
					Map<SquareIndex, ChessBoardSquare> piecesMap = player1.getPieces();

					ChessBoardSquare fromMoveSquare = piecesMap.get(fromMoveIndex);
					ChessPiece piece = fromMoveSquare.getPiece();
					fromMoveSquare.setPiece(null);
					fromMoveSquare.setOccupied(false);

					ChessBoardSquare toMoveSquare = board.getBoardSquares()[toMoveIndex.getRank()][toMoveIndex.getFile()];
					toMoveSquare.setPiece(piece);
					toMoveSquare.setOccupied(true);

					piecesMap.remove(fromMoveIndex);
					piecesMap.put(toMoveIndex, toMoveSquare);
					if (player2.getPieces().containsKey(toMoveIndex)) {
						
					}
					player1.addMove(move); **/
				}
			}
		} else {
			if (player2.getPieces().containsKey(fromMoveIndex)) {
				if (!player2.getPieces().containsKey(toMoveIndex)) {
					if (fromMoveIndex.getRank() > toMoveIndex.getRank()) {
						int diff = fromMoveIndex.getRank() - toMoveIndex.getRank();
						if (diff > 0) {
							if (((fromMoveIndex.getRank() == 6 && diff == 2)
									|| diff == 1)
								&& fromMoveIndex.getFile() == toMoveIndex.getFile()) {
								player2.addMove(move);
								return true;
							}
						}
					}
					/**
					if (!player2.getPieces().containsKey(toMoveIndex)) {
						Map<SquareIndex, ChessBoardSquare> piecesMap = player1.getPieces();

						ChessBoardSquare fromMoveSquare = piecesMap.get(fromMoveIndex);
						ChessPiece piece = fromMoveSquare.getPiece();
						fromMoveSquare.setPiece(null);
						fromMoveSquare.setOccupied(false);

						ChessBoardSquare toMoveSquare = board.getBoardSquares()[toMoveIndex.getRank()][toMoveIndex.getFile()];
						toMoveSquare.setPiece(piece);
						toMoveSquare.setOccupied(true);

						piecesMap.remove(fromMoveIndex);
						piecesMap.put(toMoveIndex, toMoveSquare);
					} else {

					}**/
				}
			}
		}
		return false;
	}
}
