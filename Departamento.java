package Proyecto_DAM;

import java.util.Objects;

public class Departamento {
    private String id;
    private String nombre;

    public Departamento(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Departamento(String id) {
        this.id = id;
        this.nombre = "";

    }

    public Departamento() {
    }

    public void mostrarDepartamentos (){
        System.out.println("-------------------------------------------------");
        System.out.println("La id del departamento es: " + this.id);
        System.out.println("El nombre del departamento es: " + this.nombre);
        System.out.println("----------------------------------------------------");
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
        Departamento that = (Departamento) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

