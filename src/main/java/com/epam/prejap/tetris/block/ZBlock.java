package com.epam.prejap.tetris.block;

/**
 * ZBlock is type of block shape existing in Tetris game
 *
 * @implNote This class contains static 2d array of byte types to represent "Z-shape" on the board.
 * @see Block
 */

final class ZBlock extends Block {

    private static final byte[][] IMAGE = {
            {1, 1, 0},
            {0, 1, 1},
    };

    ZBlock() {
        super(IMAGE);
    }
}
