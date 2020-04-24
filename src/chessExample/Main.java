package chessExample;

import chessExample.chess.*;

public class Main {

    public static void main(String[] args) {

        ChessPiece blackPawn = new BlackPiece("Czarny pionek", "7", "a");
        ChessPiece whitePawn = new WhitePiece("Bialy pionek", "2", "a");
        ChessPiece whiteQueen = new WhiteQueen("Biała królowa");
        ChessPiece blackQueen = new BlackQueen("Czarna królowa");

        //exactly same color object are used
        System.out.println(blackPawn.getColor()==blackQueen.getColor());
        System.out.println(whitePawn.getColor()==whiteQueen.getColor());
    }
}
