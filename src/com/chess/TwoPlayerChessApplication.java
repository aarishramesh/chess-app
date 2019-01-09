package com.chess;

import java.util.Scanner;

import com.chess.model.ChessBoardSquare;
import com.chess.model.ChessPlayer;
import com.chess.model.ChessPlayerMove;
import com.chess.model.SquareIndex;
import com.chess.model.TwoPlayerChessBoard;
import com.chess.service.TwoPlayerChessAppService;
import com.chess.util.ChessMoveParser;

public class TwoPlayerChessApplication {

	private static TwoPlayerChessBoard board = new TwoPlayerChessBoard();

	private static ChessPlayer player1 = new ChessPlayer();
	private static ChessPlayer player2 = new ChessPlayer();

	private static TwoPlayerChessAppService service = new TwoPlayerChessAppService(player1, player2);
	
	public static void main(String[] args) {

		assignSquaresToPlayersFromBoard();

		Scanner sc = new Scanner(System.in);

		boolean isPlayer1Move = true;
		String playerMove = "";

		while (((playerMove = sc.nextLine()) != null && !playerMove.equals("q"))) {
			if (!playerMove.isEmpty()) {
				if (playerMove.equals("q"))
					System.exit(0);
				try {
					String fromMove = playerMove.split(" ")[0];
					String toMove = playerMove.split(" ")[1];
					ChessPlayerMove move = ChessMoveParser.parse(fromMove, toMove);
					if (move != null) {
						boolean processed = service.processMove(move, isPlayer1Move);
						if (processed) {
							isPlayer1Move = !isPlayer1Move;
							System.out.println("OK");
						} else {
							System.out.println("Invalid");
						}
					} else {
						System.out.println("Invalid");
					}
				} catch (Exception ex) {
					System.out.println("Invalid move! Same player try again");
				}
			}
		}
		sc.close();
	}

	private static void assignSquaresToPlayersFromBoard() {
		for (int rank = TwoPlayerChessBoard.getRanks() - 1; rank >= 0; rank--) {
			for (int file = 0; file < TwoPlayerChessBoard.getFiles(); file++) {
				if (rank == 7 || rank == 6) {
					SquareIndex index = new SquareIndex(rank, file);
					ChessBoardSquare square = board.getBoardSquares()[rank][file];
					player2.getPieces().put(index, square);
				} else if (rank == 0 || rank == 1) {
					SquareIndex index = new SquareIndex(rank, file);
					ChessBoardSquare square = board.getBoardSquares()[rank][file];
					player1.getPieces().put(index, square);
				}
			}
		}
	}
}
