package com.company;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class MyTest
{
    private final Sum1 sum1 = new Sum1();

    @Test
    void test1()
    {
        int[] Array = { 10, 10, 10, 10 };

        assertEquals(true, sum1.MySum1(Array));
    }
}