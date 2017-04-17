import com.kolmisoft.exercise.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TableOfNumbersTest {

    @Test
    public void shouldFindTwoMagicSquares() {
        int[][] table = new int[4][5];
        table[0] = new int[]{4, 9, 2, 3, 5};
        table[1] = new int[]{3, 5, 7, 4, 2};
        table[2] = new int[]{8, 1, 6, 6, 2};
        table[3] = new int[]{1, 1, 6, 6, 2};

        TableOfNumbers tableOfNumbers = new TableOfNumbers(table);
        List<com.kolmisoft.exercise.MagicSquare> foundSquares = tableOfNumbers.findMagicSquares();
        Assert.assertEquals(2, foundSquares.size());
        MagicSquare firstSquare = foundSquares.get(0);

        Assert.assertEquals(0, firstSquare.getPositionRow());
        Assert.assertEquals(0, firstSquare.getPositionColumn());
        Assert.assertEquals(15, firstSquare.getSum());
        Assert.assertEquals(3, firstSquare.getSize());

        MagicSquare secondSquare = foundSquares.get(1);
        Assert.assertEquals(2, secondSquare.getPositionRow());
        Assert.assertEquals(2, secondSquare.getPositionColumn());
        Assert.assertEquals(12, secondSquare.getSum());
        Assert.assertEquals(2, secondSquare.getSize());
    }

    @Test
    public void shouldFindOneSquareInMinimumSizeTable() {
        int[][] table = new int[2][2];
        table[0] = new int[]{2, 2};
        table[1] = new int[]{2, 2};

        TableOfNumbers tableOfNumbers = new TableOfNumbers(table);
        List<com.kolmisoft.exercise.MagicSquare> foundSquares = tableOfNumbers.findMagicSquares();
        Assert.assertEquals(1, foundSquares.size());
        MagicSquare firstSquare = foundSquares.get(0);

        Assert.assertEquals(0, firstSquare.getPositionRow());
        Assert.assertEquals(0, firstSquare.getPositionColumn());
        Assert.assertEquals(4, firstSquare.getSum());
        Assert.assertEquals(2, firstSquare.getSize());
    }

    @Test
    public void shouldFindDeepestOneSquareIn4x5Table() {
        int[][] table = new int[4][5];
        table[0] = new int[]{1, 2, 2, 3, 5};
        table[1] = new int[]{3, 4, 5, 6, 7};
        table[2] = new int[]{8, 2, 1, 9, 9};
        table[3] = new int[]{3, 2, 5, 9, 9};

        TableOfNumbers tableOfNumbers = new TableOfNumbers(table);
        List<com.kolmisoft.exercise.MagicSquare> foundSquares = tableOfNumbers.findMagicSquares();
        Assert.assertEquals(1, foundSquares.size());
        MagicSquare firstSquare = foundSquares.get(0);

        Assert.assertEquals(2, firstSquare.getPositionRow());
        Assert.assertEquals(3, firstSquare.getPositionColumn());
        Assert.assertEquals(18, firstSquare.getSum());
        Assert.assertEquals(2, firstSquare.getSize());
    }

    @Test
    public void shouldFindDeepestOneSquareIn5x3Table() {
        int[][] table = new int[5][3];
        table[0] = new int[]{1, 2, 2};
        table[1] = new int[]{3, 4, 5};
        table[2] = new int[]{8, 2, 1};
        table[3] = new int[]{9, 9, 5};
        table[4] = new int[]{9, 9, 5};

        TableOfNumbers tableOfNumbers = new TableOfNumbers(table);
        List<com.kolmisoft.exercise.MagicSquare> foundSquares = tableOfNumbers.findMagicSquares();
        Assert.assertEquals(1, foundSquares.size());
        MagicSquare firstSquare = foundSquares.get(0);

        Assert.assertEquals(3, firstSquare.getPositionRow());
        Assert.assertEquals(0, firstSquare.getPositionColumn());
        Assert.assertEquals(18, firstSquare.getSum());
        Assert.assertEquals(2, firstSquare.getSize());
    }

    @Test
    public void shouldFindAllSquareIn4x4Table() {
        int[][] table = new int[4][4];
        table[0] = new int[]{1, 1, 1, 1};
        table[1] = new int[]{1, 1, 1, 1};
        table[2] = new int[]{1, 1, 1, 1};
        table[3] = new int[]{1, 1, 1, 1};

        TableOfNumbers tableOfNumbers = new TableOfNumbers(table);
        List<com.kolmisoft.exercise.MagicSquare> foundSquares = tableOfNumbers.findMagicSquares();
        Assert.assertEquals(14, foundSquares.size());
    }
}
