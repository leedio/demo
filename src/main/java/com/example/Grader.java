package com.example;

public class Grader {
    
    public char nota(int valorNota){
        if (valorNota < 0 ) {
            throw new IllegalArgumentException("Não valido");
        } else if (valorNota < 60) {
            return 'F';
        } else if (valorNota< 70){
            return 'D';
        } else if (valorNota<80){
            return 'C';
        } else if ( valorNota<90){
            return 'B';
        } else {
            return 'A';
        } 
        }
    
}
