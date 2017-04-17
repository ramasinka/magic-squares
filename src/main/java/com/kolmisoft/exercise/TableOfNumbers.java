package com.kolmisoft.exercise;

import java.util.ArrayList;
import java.util.List;

public class TableOfNumbers {
     private int[][] table;

    public TableOfNumbers(int[][] table) {
        this.table = table;
    }

    public List<MagicSquare> findMagicSquares() {

        List<MagicSquare> foundMagicSquares = new ArrayList<>();
        int maxColNumber = table[0].length - 1;
        int maxRowNumber = table.length - 1;

        for (int row = 0; row < maxRowNumber; row++) {
            for (int col = 0; col < maxColNumber; col++) {
                for (int size = 2; size + row <= table.length && size + col <= table[0].length; size++) {
                    MagicSquare magicSquare = getMagicSquareAt(row, col, size);
                    if (magicSquare != null) {
                        foundMagicSquares.add(magicSquare);
                    }
                }
            }
        }

        return foundMagicSquares;
    }

    private MagicSquare getMagicSquareAt(int row, int col, int size) {

        int currentSum = 0;
        int prevSum = 0;

        //Sum of rows check
        for (int r = row; r < size + row; r++) {
            for (int c = col; c < size + col; c++) {
                currentSum = currentSum + table[r][c];
            }
            if (prevSum != currentSum && prevSum != 0) {
                return null;
            }
            prevSum = currentSum;
            currentSum = 0;
        }

        //Sum of columns check
        for (int c = col; c < size + col; c++) {
            for (int r = row; r < size + row; r++) {
                currentSum = currentSum + table[r][c];
            }
            if (prevSum != currentSum) {
                return null;
            }
            prevSum = currentSum;
            currentSum = 0;
        }

        //Sum of diagonal check
        for (int r = row, c = col; r < size + row; r++, c++) {
            currentSum = currentSum + table[r][c];
        }
        if (prevSum != currentSum) {
            return null;
        }
        currentSum = 0;

        //Sum of opposite diagonal check
        for (int r = row, colReduce = 1; r < size + row; r++, colReduce++) {
            currentSum = currentSum + table[r][(col + size) - colReduce];
        }
        if (prevSum != currentSum) {
            return null;
        }

        return new MagicSquare(row, col, currentSum, size);
    }
}
