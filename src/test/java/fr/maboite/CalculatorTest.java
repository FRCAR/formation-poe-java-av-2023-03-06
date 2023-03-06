package fr.maboite;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class CalculatorTest 
{
    @Test
    public void testCalcule()
    {
        assertEquals(Math.sqrt(2), new Calculator().calculePlusGrandeLongueur(0, 0, 1, 0, 0, 1), 0.01);
    }
}
