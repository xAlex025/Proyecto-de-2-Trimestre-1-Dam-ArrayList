package Proyecto_DAM;

import java.util.Objects;

public class Proyecto {
    private String id ;
    private  String nombre;


    public Proyecto(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Proyecto(String id) {
        this.id = id;
        this.nombre = "";
    }

    public void mostrarProyectos (){

        System.out.println("La id del proyecto es: " + this.id);
        System.out.println("El nombre del proyecto es: " + this.nombre);


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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Proyecto proyecto = (Proyecto) o;
        return Objects.equals(id, proyecto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}



