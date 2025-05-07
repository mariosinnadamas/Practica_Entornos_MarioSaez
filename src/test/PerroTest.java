package test;

import modelo.Gato;
import modelo.Perro;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerroTest {

    @Test
    void sonido() {
        Perro p1 = new Perro ("Firulais");
        assertEquals("Guau",p1.sonido());
    }
}