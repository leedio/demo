package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class GraderTest {
    
    Grader grader = new Grader();
    
    @Test
    void testNota50() {
        //Grader grader = new Grader();
        assertEquals(grader.nota(50), 'F');
    }

    @Test
    void testNota60(){
        assertEquals(grader.nota(62), 'D');
    }

    @Test
    void testNota75(){
        assertEquals(grader.nota(76),'C');
    }

    @Test
    void testNota86(){
        assertEquals(grader.nota(86), 'B');
    }

    @Test
    void testNota97(){
        assertEquals(grader.nota(97), 'A');
    }
    @Test
    void testNota100(){
                assertEquals(grader.nota(100), 'A');
    }

    @Test
    void testarNegativo(){
        //assertThrows(null, null, null)
        assertThrows(IllegalArgumentException.class, () ->{
            grader.nota(-1);
        });
    }
}
