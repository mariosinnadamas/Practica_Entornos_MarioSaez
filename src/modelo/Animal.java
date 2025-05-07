package modelo;

/**
 * Clase abstracta de animal
 * Proporciona sus atributos y métodos básicos incluyendo
 * el del sonido de un animal en función del tipo que sea
 *
 * @author mario
 * @version 1.0
 */
public abstract class Animal {

    private String nombre;

    /**
     * Constructor que inicializa el nombre del animal
     *
     * @param nombre Nombre del animal
     */
    public Animal(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el nombre de un animal
     *
     * @return Nombre del animal
     */

    public String getNombre() {
        return nombre;
    }

    /**
     * Establece un nuevo nombre para el animal
     *
     * @param nombre Nuevo nombre del animal
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return String de los atributos del animal, en este caso solo el nombre
     */
    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    /**
     * Metodo abstracto que representa el sonido que hace un animal
     * Debe ser implementado en subclases
     */
    public abstract String sonido();
}