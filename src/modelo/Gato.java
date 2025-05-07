package modelo;

public class Gato extends Animal{
    /**
     * Construye un nuevo gato con el nombr especificado
     * @param nombre es el nombre del gato
     */
    public Gato(String nombre) {
        super(nombre);
    }

    /**
     * Implementación del metodo abstracto que hereda de la clase Padre.
     *
     * Imprime "Miau"
     */
    @Override
    public void sonido() {
        System.out.println("Miau");
    }

    /**
     *
     * @return una que representa al gato y el metodo toString de la clase Padre
     */
    @Override
    public String toString() {
        return "Gato{"+super.toString()+"}";
    }
}
