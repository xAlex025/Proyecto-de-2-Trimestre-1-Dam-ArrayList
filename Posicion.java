package Proyecto_DAM;

public class Posicion {
    private String id;
    private String nombre;

    public Posicion(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Posicion(String id) {
        this.id = id;
        this.nombre = "";
    }

    public Posicion() {
    }

    public void mostrarPosicion (){
        System.out.println("--------------------------------------------");
        System.out.println("La id de la posicion es: " + this.id);
        System.out.println("El nombre del posicion es: " + this.nombre);
        System.out.println("------------------------------------------------");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
