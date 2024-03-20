package Proyecto_DAM;
import java.util.ArrayList;
import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Empresa empresa = new Empresa("125", "Tech" );  // Instancia de la clase Empresa
        Departamento Desarrollo = new Departamento("001","Desarrollo");
        Departamento Financiero = new Departamento("002","Financiero");
        empresa.añadirDepartamentos(Desarrollo) ;
        empresa.añadirDepartamentos(Financiero) ;

        Posicion Desarrollador = new Posicion("001","Desarrollador");
        Posicion Contador = new Posicion("002","Contador");
        empresa.añadirPosiciones(Desarrollador);
        empresa.añadirPosiciones(Contador);

        Empleado e4 = new Empleado("001","Alex","Lopez",30000,Desarrollo,Contador);
        empresa.añadirEmpleado(e4);
        Empleado e5 = new Empleado("002","Sergio","DeLaFuente",123,Desarrollo,Contador);
        empresa.añadirEmpleado(e5);

        empresa.añadirProyecto(new Proyecto("001","Facebok"));
        empresa.añadirProyecto(new Proyecto("002","Instagram"));



        int opcion = 0;
        do {
            mostrarmenu ();

            System.out.println("Elige una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Cual es la id del empleado: ");
                    String id_1 = sc.nextLine();
                    System.out.println("Cual es el  nombre del empleado: ");
                    String nombre_1 = sc.nextLine();
                    System.out.println("Cual es el apellido del empleado: ");
                    String apellido_1 = sc.nextLine();
                    System.out.println("Cuanto va a cobrar el empleado");
                    double salario_1 = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("En que departamento trabaja ");
                    System.out.print("("); empresa.mostrarNombreDepartamentos(); System.out.print(")");
                    System.out.println();


                    String departamento_1 = sc.nextLine();
                    Departamento d1 = empresa.buscarDepartamentoPorNombre(departamento_1);
                    if (d1 == null ){
                        d1 = new Departamento();
                        System.out.println("No se ha encontrado el departamento");
                    }else{

                        System.out.println("El departamento se ha añadido correctamente");
                    }

                    System.out.println("En que posicion trabaja (Desarrollador/Contador): ");
                    String posicion_1 = sc.nextLine();
                    Posicion p1 = empresa.buscarPosicionPorNombre(posicion_1);
                    if (p1 == null ){
                        p1 = new Posicion();
                        System.out.println("No se ha encontrado la posicion");
                    }else{

                        System.out.println("La posicion se ha añadido correctamente");
                    }
                    empresa.agregarEmpleados(id_1,nombre_1,apellido_1,salario_1,d1,p1);




                    break;
                case 2:
                    System.out.println("Cual es la id de los empleados que quieres borrar : ");
                    String id_2 = sc.nextLine();
                    empresa.borrarEmpleadosPorId(id_2);
                    break;
                case 3:
                    System.out.println("Cual es la id del empleado que quieres actualizar: ");
                    String  id_3 = sc.nextLine();
                    System.out.println("Cuanto va a cobrar el empleado");
                    double salario_3 = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("En que departamento trabaja ");
                    System.out.print("("); empresa.mostrarNombreDepartamentos(); System.out.print(")");
                    System.out.println();
                    String departamento_3= sc.nextLine();
                    Departamento d3 = empresa.buscarDepartamentoPorNombre(departamento_3);
                    if (d3 == null ){
                        d3 = new Departamento();
                        System.out.println("No se ha encontrado el departamento");
                    }else{

                        System.out.println("El departamento se ha añadido correctamente");
                    }

                    System.out.println("En que posicion trabaja (Desarrollador/Contador): ");
                    String posicion_3 = sc.nextLine();
                    Posicion p3 = empresa.buscarPosicionPorNombre(posicion_3);
                    if (p3 == null ){
                        p3 = new Posicion();
                        System.out.println("No se ha encontrado la posicion");
                    }else{

                        System.out.println("La posicion se ha añadido correctamente");
                    }

                    empresa.actualizarEmpleado(id_3,salario_3,d3,p3);




                    break;
                case 4:
                    System.out.println("Cual es el nombre del empleado que quieres buscar");
                    String nombre_3 = sc.nextLine();
                    ArrayList <Empleado> empleados2 = empresa.buscarEmpleadoPorNombre(nombre_3) ;
                    if (empleados2.isEmpty()){
                        System.out.println("No se ha encontrado ningun empleado con ese nombre ");
                    }else{
                        for (Empleado empleado : empleados2) {
                            empleado.mostrarEmpleados();
                        }
                    }
                    break;
                case 5:
                    System.out.print("En que departamento trabaja ");
                    System.out.print("("); empresa.mostrarNombreDepartamentos(); System.out.print(")");
                    System.out.println();
                    String departamento_2 = sc.nextLine();
                    Departamento d4 = empresa.buscarDepartamentoPorNombre(departamento_2);
                    if (d4 == null ){
                        System.out.println("No se ha encontrado el departamento");
                        break;
                    }
                    ArrayList <Empleado> empleados3 = empresa.buscarEmpleadoPorDepartamento(d4) ;
                    if (empleados3.isEmpty()){
                        System.out.println("No se ha encontrado ningun empleado que trabaje en ese departamento");
                    }else{
                        int contador = 0;
                            for (Empleado empleado : empleados3) {
                                contador++;
                                System.out.println("\nEmpleado: " + contador);
                                empleado.mostrarEmpleados();
                            }
                    }
                    break;
                case 6:
                        empresa.mostrarEmpleados();
                    break;
                case 7:
                    System.out.println("Que id quieres ponerle al departamento");
                    String id_nuevo_departamento = sc.nextLine();
                    System.out.println("Que nombre quieres ponerle");
                    String nombre_nuevo_departamento = sc.nextLine();
                    empresa.añadirDepartamentos(new Departamento(id_nuevo_departamento,nombre_nuevo_departamento));
                    break;

                case 8:
                    System.out.println("Cual es la id del proyecto que quieres crear");
                    String id_8 = sc.nextLine();
                    System.out.println("Cual es el nombre del proyecto");
                    String proyecto_nombre = sc.nextLine();
                    empresa.añadirProyecto(new Proyecto(id_8,proyecto_nombre));

                    break;
                case 9:

                    empresa.mostrarProyectosEmpresa();
                    System.out.println("Que proyecto quieres asignarle al empleado (nombre): ");
                    String nombre_proyecto1 = sc.nextLine();

                    Proyecto p2 = empresa.buscarProyectosPorNombre (nombre_proyecto1);
                    if (p2 == null){

                        System.out.println("No hay ningun proyecto con ese nombre");
                        break;
                    }else {

                        System.out.println("Proyecto encontrado correctamente");
                    }
                    empresa.mostrarNombreEmpleados();
                    System.out.println("\nA que empleado quieres asignarle el proyecto (nombre): ");
                    String nombre_empleado = sc.nextLine();
                    Empleado e2 = empresa.buscarEmpleadoPorNombre_Objeto (nombre_empleado);
                    if (e2 == null){

                        System.out.println("Ese empleado no existe");
                        break;
                    }else {

                        System.out.println("\nEmpleado encontrado correctamente");

                    }

                    e2.añadirProyectosEmpleado(p2);


                    break;
                case 10:
                    System.out.println("El salario total de la empresa es : " + empresa.calcularSalarioTotalEmpresa());
                    break;
                case 11:
                    empresa.mostrarProyectosEmpresa();
                    break;
                case 12:
                    empresa.mostrarNombreEmpleados();
                    System.out.println("\nDe que empleado quieres ver sus proyectos");
                    String nombre_empleado1 = sc.nextLine();

                    empresa.mostrarProyectosDeEmpleado (nombre_empleado1);


                    break;
                case 13:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opcion no valida. Intentelo de nuevo.");
            }

        } while (opcion != 13);


    }

    private static void mostrarmenu() {
        System.out.println();
        System.out.println("1. Agregar empleado");
        System.out.println("2. Eliminar empleados ");
        System.out.println("3. Actualizar información de un empleado");
        System.out.println("4. Buscar empleado por nombre");
        System.out.println("5. Buscar empleados por departamento");
        System.out.println("6. Mostrar lista de empleados");
        System.out.println("7. Agregar departamento");
        System.out.println("8. Añadir proyectos a la empresa");
        System.out.println("9. Asignar un proyecto a un empleado");
        System.out.println("10. Calcular salario total de todos los empleados de la empresa");
        System.out.println("11. Mostrar proyectos de la empresa");
        System.out.println("12. Mostrar proyectos de un empleado");
        System.out.println("13. Salir");

    }
}
