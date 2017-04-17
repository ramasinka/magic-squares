package com.kolmisoft.exercise;

public class MagicSquare {
    private int positionRow;
    private int positionColumn;
    private int sum;
    private int size;

    public MagicSquare(int positionRow, int positionColumn, int sum, int size) {
        this.positionRow = positionRow;
        this.positionColumn = positionColumn;
        this.sum = sum;
        this.size = size;
    }

    public int getPositionRow() {
        return positionRow;
    }

    public int getPositionColumn() {
        return positionColumn;
    }

    public int getSum() {
        return sum;
    }

    public int getSize() {
        return size;
    }

}
