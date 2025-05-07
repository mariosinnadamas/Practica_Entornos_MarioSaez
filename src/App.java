import modelo.Gato;
import modelo.Perro;

/**
 * Clase principal que demuestra el uso de las clases {@link Perro} y {@link Gato}
 *
 * Crea objetos y muestra sus sonidos característicos
 *
 * @author mario
 * @version 1.0
 */
public class App {
    public static void main(String[] args) {
        //Creación de objetos
        Perro p = new Perro("Firulais");
        Gato g = new Gato("Gotham");

        //Funcionamiento
        System.out.println(p);
        System.out.println(g);
        p.sonido();
        g.sonido();
    }
}
