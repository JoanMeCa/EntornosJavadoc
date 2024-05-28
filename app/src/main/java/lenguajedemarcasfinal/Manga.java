/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lenguajedemarcasfinal;

/**
 * Clase que representa un manga en el sistema.
 * Cada manga tiene un ID único, un nombre, un ID de autor, un estado y un número de capítulos.
 * 
 * @author Party
 */
public class Manga {
    private int id;              // ID del manga
    private String nombre;       // Nombre del manga
    private int autorId;         // ID del autor del manga
    private String estado;       // Estado del manga
    private int numCapitulos;    // Número de capítulos del manga

    /**
     * Constructor de la clase Manga.
     * 
     * @param id           El ID del manga.
     * @param nombre       El nombre del manga.
     * @param autorId      El ID del autor del manga.
     * @param estado       El estado del manga.
     * @param numCapitulos El número de capítulos del manga.
     */
    public Manga(int id, String nombre, int autorId, String estado, int numCapitulos) {
        this.id = id;
        this.nombre = nombre;
        this.autorId = autorId;
        this.estado = estado;
        this.numCapitulos = numCapitulos;
    }

    // Getters y Setters

    /**
     * Método para obtener el ID del manga.
     * 
     * @return El ID del manga.
     */
    public int getId() {
        return id;
    }

    /**
     * Método para establecer el ID del manga.
     * 
     * @param id El ID del manga.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Método para obtener el nombre del manga.
     * 
     * @return El nombre del manga.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para establecer el nombre del manga.
     * 
     * @param nombre El nombre del manga.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener el ID del autor del manga.
     * 
     * @return El ID del autor del manga.
     */
    public int getAutorId() {
        return autorId;
    }

    /**
     * Método para establecer el ID del autor del manga.
     * 
     * @param autorId El ID del autor del manga.
     */
    public void setAutorId(int autorId) {
        this.autorId = autorId;
    }

    /**
     * Método para obtener el estado del manga.
     * 
     * @return El estado del manga.
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Método para establecer el estado del manga.
     * 
     * @param estado El estado del manga.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Método para obtener el número de capítulos del manga.
     * 
     * @return El número de capítulos del manga.
     */
    public int getNumCapitulos() {
        return numCapitulos;
    }

    /**
     * Método para establecer el número de capítulos del manga.
     * 
     * @param numCapitulos El número de capítulos del manga.
     */
    public void setNumCapitulos(int numCapitulos) {
        this.numCapitulos = numCapitulos;
    }
}
