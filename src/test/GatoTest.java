package test;

import modelo.Gato;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GatoTest {

    @Test
    void sonido() {
        Gato g1 = new Gato ("Paco");
        assertEquals("Miau",g1.sonido());
    }
}