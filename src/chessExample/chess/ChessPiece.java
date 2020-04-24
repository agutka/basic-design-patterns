package chessExample.chess;

abstract public class ChessPiece {

    String name;
    String numberPosition;
    String  letterPosition;
    Color color;

    public ChessPiece(String name, String numberPosition, String letterPosition, String color) {
        this.name = name;
        this.numberPosition = numberPosition;
        this.letterPosition = letterPosition;
        switch (color.toLowerCase()) {
            case "black" -> this.color = ColorRepository.getBlack();
            case "white" -> this.color = ColorRepository.getWhite();
        }
    }

    public String getName() {
        return name;
    }

    public String getNumberPosition() {
        return numberPosition;
    }

    public String getLetterPosition() {
        return letterPosition;
    }

    public Color getColor() {
        return color;
    }
}
