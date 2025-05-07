package modelo;

/**
 * Subclase de Animal, tipo Perro
 * Implementa el metodo de la clase Animal para representar
 * el sonido de un perro
 *
 * @author mario
 * @version 1.0
 */
public class Perro extends Animal{

    /**
     * Construye un nuevo perro con el nombre especificado.
     *
     * @param nombre es el nombre del perro
     */
    public Perro(String nombre) {
        super(nombre);
    }

    /**
     * Implementación del metodo abstracto que hereda de la clase Padre.
     *
     * Imprime "Guau"
     */
    @Override
    public String sonido() {
        return "Guau";
    }

    /**
     * @return Una cadena que representa el perro y el metodo toString de la clase Padre
     */
    @Override
    public String toString() {
        return "Perro{"+super.toString()+"}";
    }
}

