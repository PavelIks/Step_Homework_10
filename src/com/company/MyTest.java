package com.company;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class MyTest
{
    private final SquareClass squareсlass = new SquareClass();

    @Test
    void test1()
    {
        int[] Array = { 10, 10, 10, 10 };

        assertEquals(true, squareсlass.MySquare(Array));
    }
}