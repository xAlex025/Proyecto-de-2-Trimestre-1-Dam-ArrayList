package Proyecto_DAM;
import java.util.ArrayList;
import java.util.Iterator;


public class Empresa {
    String id ;
    String Nombre;
    private ArrayList<Empleado> empleados;
    private ArrayList <Departamento> departamentos;
    private ArrayList<Posicion> posiciones;
    private ArrayList<Proyecto> proyectos;

    public Empresa(String id,String nombre, ArrayList<Empleado> empleados, ArrayList<Departamento> departamentos, ArrayList<Posicion> posiciones, ArrayList<Proyecto> proyectos) {
        this.id = id;
        this.Nombre = nombre;
        this.empleados = empleados;
        this.departamentos = departamentos;
        this.posiciones = posiciones;
        this.proyectos = proyectos;


    }

    public Empresa(String id,String Nombre) {
        this.id = id;
        this.Nombre = Nombre;
        this.empleados = new ArrayList<>();
        this.departamentos = new ArrayList<>();
        this.posiciones = new ArrayList<>();
        this.proyectos = new ArrayList<>();


    }
    public Departamento buscarDepartamentoPorNombre (String nombre){
          Departamento d2  = null;
        for (Departamento d1 : this.departamentos ) {
            if (d1.getNombre().equalsIgnoreCase(nombre)){

               return d1;

            }

        }
        return d2;
    }


    public void añadirDepartamentos ( Departamento d1){

        if (this.departamentos.contains(d1)){
            System.out.println("Este departamento ya esta creado");
        }else{
            this.departamentos.add(d1);

        }


    }

    public void añadirPosiciones ( Posicion p1){


        if (this.posiciones.contains(p1)){
            System.out.println("Esta posicion ya esta creada");
        }else{
            this.posiciones.add(p1);

        }

    }
    public Posicion buscarPosicionPorNombre (String Nombre){
        Posicion p2 = null;
        for (Posicion p1 : this.posiciones ) {
            if (p1.getNombre().equalsIgnoreCase(Nombre)){

                return p1;

            }

        }
        return p2;
    }
    public void agregarEmpleados (String id, String nombre, String apellido, double salario, Departamento departamento, Posicion posicion){


      Empleado e1 = new Empleado(id,nombre,apellido,salario,departamento,posicion);
      this.empleados.add (e1);




    }
    public void borrarEmpleadosPorId (String id){
        boolean borrado = false;
        Iterator<Empleado> iterator = this.empleados.iterator();

        while (iterator.hasNext()){

            Empleado e1 = iterator.next();
             if (e1.getId().equalsIgnoreCase(id)){

                iterator.remove();
                 System.out.println("El empleado "  + e1.getId() + " ha sido borrado");
                 borrado = true;
            }
        }
        if (borrado == false ){

            System.out.println("No se ha encontrado ningun empleado con esa ID");
        }


    }
    public void mostrarEmpresa (){

        System.out.println("La id de la empresa es :" + this.id);
        for (Empleado empleado : empleados) {

            empleado.mostrarEmpleados();
        }
        for (Departamento departamento : departamentos) {

            departamento.mostrarDepartamentos();
        }
        for (Posicion posiciones : posiciones) {

            posiciones.mostrarPosicion();
        }
        for (Proyecto proyecto : proyectos) {
            proyecto.mostrarProyectos();
        }


    }
    public void mostrarEmpleados (){
        int contador = 0;

        for (Empleado empleado : empleados) {
            contador++;
            System.out.println("\nEmpleado " + contador);
            empleado.mostrarEmpleados();
        }
    }
    public void mostrarNombreEmpleados (){
        System.out.print("Nombre Empleados:");
        for (Empleado empleado : empleados) {

            System.out.print(empleado.getNombre()  + ",");
        }
    }

    public  void añadirEmpleado (Empleado e1){

        this.empleados.add(e1);
    }
    public ArrayList<Empleado> buscarEmpleadoPorNombre (String nombre){

        ArrayList <Empleado> empleados = new ArrayList<>();
        for (Empleado empleado : this.empleados) {

            if (empleado.getNombre().equalsIgnoreCase(nombre)){

                empleados.add(empleado);
            }
        }
        return empleados;
    }
    public ArrayList<Empleado> buscarEmpleadoPorDepartamento (Departamento d1){

        ArrayList <Empleado> empleados = new ArrayList<>();
        for (Empleado empleado : this.empleados) {

            if (empleado.getDepartamento().equals(d1)){

                empleados.add(empleado);
            }
        }
        return empleados;
    }
    public double calcularSalarioTotalEmpresa (){
        double Salario = 0;
        for (Empleado empleado : empleados) {
            Salario = Salario + empleado.getSalario();
        }

        return  Salario;
    }
    public void actualizarEmpleado(String idEmpleado,
                                   double nuevoSalario, Departamento nuevoDepartamento,
                                   Posicion nuevaPosicion) {
        for (Empleado empleado : this.empleados) {
            if (empleado.getId().equalsIgnoreCase(idEmpleado)) {
                empleado.setSalario(nuevoSalario);
                empleado.setDepartamento(nuevoDepartamento);
                empleado.setPosicion(nuevaPosicion);
                System.out.println("Información del empleado actualizada con éxito.");
                return;
            }
        }
        System.out.println("No se encontró un empleado con el ID proporcionado.");
    }
    public void añadirProyecto (Proyecto p1 ) {

        if (this.proyectos.contains(p1)){

            System.out.println("Este proyecto ya existe en la empresa");
        }else{
            System.out.println("Este proyecto se ha añadido correctamente");
            this.proyectos.add(p1);
        }

    }
    public void mostrarNombreDepartamentos (){

        for (Departamento dep : this.departamentos) {

            System.out.print(dep.getNombre()  + ",");

        }
    }
    public void mostrarProyectosEmpresa (){

        int contador = 0;
        for (Proyecto proyecto : proyectos) {

            System.out.println("--------------------");
            System.out.println("Proyecto: " + contador++ );
            proyecto.mostrarProyectos();
            System.out.println("----------------------");
        }
    }

    public Proyecto buscarProyectosPorNombre (String nombre){
        Proyecto p2 = null;
        for (Proyecto proyecto : proyectos) {

            if (proyecto.getNombre().equalsIgnoreCase(nombre)){
                p2 = proyecto;
                return p2;
            }

        }
        return p2;

    }


    public Empleado buscarEmpleadoPorNombre_Objeto (String nombre1){

        Empleado e1 = null;
        for (Empleado empleado : this.empleados) {

            if (empleado.getNombre().equalsIgnoreCase(nombre1)){

                e1 = empleado;
            }
        }

        return e1;
    }
    public void mostrarProyectosDeEmpleado(String nombre) {
        Empleado empleado = buscarEmpleadoPorNombre_Objeto( nombre);


        if (empleado != null) {
            ArrayList<Proyecto> proyectosEmpleado = empleado.getProyectos();

            if (!proyectosEmpleado.isEmpty()) {
                System.out.println("Proyectos del empleado " + empleado.getNombre() + ":");
                for (Proyecto proyecto : proyectosEmpleado) {
                    proyecto.mostrarProyectos();
                }
            } else {
                System.out.println("El empleado no está asignado a ningún proyecto.");
            }
        }else{
            System.out.println("El empleado no existe");
        }
    }

}
