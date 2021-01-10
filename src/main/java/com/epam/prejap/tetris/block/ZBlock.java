package com.epam.prejap.tetris.block;

final class ZBlock extends Block {

    private static final byte[][] IMAGE = {
            {1, 1, 0},
            {0, 1, 1},
    };

    ZBlock() {
        super(IMAGE);
    }
}
