package com.chess.util;

import com.chess.model.ChessPlayerMove;

public final class ChessMoveParser {
	
	public static void main(String[] args) {
		String fromMove = "2c";
		String toMove = "3c";
		
		System.out.println(parse(fromMove, toMove));
	}
	
	public static ChessPlayerMove parse(String fromMove, String toMove) {
		if (fromMove != null && toMove != null) {
			if (fromMove.length() == 2 && toMove.length() == 2) {
				if ((fromMove.charAt(0) >= '1' && fromMove.charAt(0) < '9'
						) && (toMove.charAt(0) >= '1' && toMove.charAt(0) < '9')) {
					if ((fromMove.charAt(1) >= 97 && fromMove.charAt(1) <= 104)
							&& (toMove.charAt(1) >= 97 && toMove.charAt(1) <= 104)) {
						int fromRank = fromMove.charAt(0) - 49;
						int toRank = toMove.charAt(0) - 49;
						int fromFile = fromMove.charAt(1) - 97;
						int toFile = toMove.charAt(1) - 97;
						ChessPlayerMove move = new ChessPlayerMove(fromMove, toMove, fromRank, fromFile,
								toRank, toFile);
						return move;
					}
				}
			}
		}
		return null;
	}
}
