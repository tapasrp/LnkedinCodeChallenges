package org.tapaspati;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class AppTest 
{

    @Test
    public void testEven()
    {

        assertTrue( EvenOrOdd.isEven(12) );
        assertTrue( EvenOrOdd.isEven(8) );
        assertTrue( EvenOrOdd.isEven(344535646) );
        assertTrue( EvenOrOdd.isEven(45454) );
        assertTrue( EvenOrOdd.isEven(22) );

    }

    @Test
    public void testOdd()
    {

        assertFalse( EvenOrOdd.isEven(13) );
        assertFalse( EvenOrOdd.isEven(81) );
        assertFalse( EvenOrOdd.isEven(344535643) );
        assertFalse( EvenOrOdd.isEven(45451) );
        assertFalse( EvenOrOdd.isEven(25) );

    }
}
