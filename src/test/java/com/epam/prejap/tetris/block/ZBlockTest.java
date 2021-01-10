package com.epam.prejap.tetris.block;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Test(groups = "Block")
public class ZBlockTest {

    @Test
    public void shouldCreateBlockWithProperDimensions() {
        //given
        ZBlock zBlock = new ZBlock();
        byte[][] expectedImage = new byte[2][3];

        //when
        int actualRows = zBlock.rows;
        int actualColumns = zBlock.cols;

        //then
        assertEquals(actualRows, expectedImage.length, "Should created ZBlock with proper row dimension, but did not");
        assertEquals(actualColumns, expectedImage[0].length, "Should created ZBlock with proper column dimension, but did not");
    }

    //given
    @Test(dataProvider = "zBlockShape")
    public void shouldCreateBlockThatIsZShaped(byte[][] expected) {

        //when
        byte[][] actual = new ZBlock().image;

        //then
        assertEquals(actual, expected, "Should created ZBlock that is Z-Shaped, but did not");
    }

    @Test(dataProvider = "dotsForZBlock")
    public void shouldCreateZBlockWithProperZDots(int row, int col) {
        //given
        ZBlock zBlock = new ZBlock();
        int expectedValue = 1;

        //when
        int actualValue = zBlock.dotAt(row, col);

        //then
        assertEquals(actualValue, expectedValue, "Should created ZBlock with correct dot values, but did not");
    }

    @Test(dataProvider = "emptySpacesForZBlock")
    public void shouldCreateZBlockWithProperEmptySpaces(int row, int col) {
        //given
        ZBlock zBlock = new ZBlock();
        int expectedValue = 0;

        //when
        int actualValue = zBlock.dotAt(row, col);

        //then
        assertEquals(actualValue, expectedValue, "Should created ZBlock with correct empty spaces, but did not");
    }


    @DataProvider()
    public static Object[] zBlockShape() {
        byte[][] zBlock = {
                {1, 1, 0},
                {0, 1, 1},
        };
        return new Object[]{zBlock};
    }

    @DataProvider()
    public static Object[] dotsForZBlock() {
        return new Object[][]{
                {0, 0},
                {0, 1},
                {1, 1},
                {1, 2},
        };

    }

    @DataProvider()
    public static Object[] emptySpacesForZBlock() {
        return new Object[][]{
                {0, 2},
                {1, 0},
        };
    }
}
