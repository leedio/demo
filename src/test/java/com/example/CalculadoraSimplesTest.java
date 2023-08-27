package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CalculadoraSimplesTest {
    @Test
    void testAdd() {
        CalculadoraSimples calc = new CalculadoraSimples();
        assertEquals(25, calc.add(10, 15));
        assertTrue(calc.add(10, 20)==30);
    }

    @Test
    void testSubtrair(){
        CalculadoraSimples calc = new CalculadoraSimples();
        assertTrue(calc.subtrair(40, 10) == 30 );

        
    
    }
}
