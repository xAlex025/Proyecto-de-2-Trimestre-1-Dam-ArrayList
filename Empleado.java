package Proyecto_DAM;

import java.util.ArrayList;

public class Empleado {
    private String id;
    private String nombre;
    private String apellido;
    private double salario;
    private Departamento departamento;
    private Posicion posicion;
    private ArrayList<Proyecto> proyectos;



    public Empleado(String id, String nombre, String apellido, double salario, Departamento departamento, Posicion posicion, ArrayList<Proyecto> proyectos) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.departamento = departamento;
        this.posicion = posicion;
        this.proyectos = proyectos;
    }

    public Empleado(String id, String nombre, String apellido, double salario, Departamento departamento, Posicion posicion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.departamento = departamento;
        this.posicion = posicion;
        this.proyectos = new ArrayList<>();

    }



    public void mostrarEmpleados (){



        System.out.println("La id del empleado es: " + this.id );
        System.out.println("El nombre del empleado es: " + this.nombre );
        System.out.println("El apellido del empleado es: " + this.apellido );
        System.out.println("El salario es: " + this.salario );
        this.departamento.mostrarDepartamentos();
        this.posicion.mostrarPosicion();
        for (Proyecto proyecto : proyectos) {

            proyecto.mostrarProyectos();
            System.out.println("*********************************");
        }







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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public ArrayList<Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(ArrayList<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }

    public void añadirProyectosEmpleado (Proyecto p2 ){

               if (this.proyectos.contains(p2)){
                   System.out.println("Este proyecto ya existe ");

               }else{
                   System.out.println("\nEl proyecto se ha asignado correctamente");
                   this.proyectos.add(p2);
               }


    }


}





