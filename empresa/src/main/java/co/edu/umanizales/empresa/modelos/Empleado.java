package co.edu.umanizales.empresa.modelos;

// Definición de la clase Empleado
public class Empleado {
    private String nombre; // Atributo privado que almacena el nombre del empleado
    private int edad; // Atributo privado que almacena la edad del empleado
    private String departamento; // Atributo privado que almacena el departamento del empleado
    private int anioContratacion;// Atributo privado que almacena el año de contratación del empleado

    //this es una referencia a la instancia actual de una clase, utilizada para diferenciar, acceder, pasar la instancia o llamar a otros constructores, mejorando así la claridad del código.
    //Constructor que permite inicializar el objeto empleado
    public Empleado(String nombre, int edad, String departamento, int anioContratacion) {
        // Constructor que recibe parámetros para inicializar los atributos del objeto
        this.nombre = nombre;// Asigna el valor del parámetro nombre al atributo privado nombre
        this.edad = edad;  // Asigna el valor del parámetro edad al atributo privado edad
        this.departamento = departamento;  // Asigna el valor del parámetro departamento al atributo privado departamento
        this.anioContratacion = anioContratacion; // Asigna el valor del parámetro anioContratacion al atributo privado anioContratacion
    }


    public String getNombre() {
        // Método público que retorna el nombre del empleado
        return nombre;
    }

    public int getEdad() {
        // Método público que retorna la edad del empleado
        return edad;
    }

    public String getDepartamento() {
        // Método público que retorna el departamento del empleado
        return departamento;
    }

    public int getAnioContratacion() {
        // Método público que retorna el año de contratación del empleado
        return anioContratacion;
    }


    public int calcularAntiguedad() {
        // Método público que calcula y retorna la antigüedad del empleado
        return 2024 - anioContratacion;  // Calcula la antigüedad restando el año de contratación al año actual (2024)
    }

    @Override
    public String toString() {
        // Método sobreescrito que retorna una representación en forma de cadena del objeto
        return "Empleado{" +
                "nombre='" + nombre + '\'' + // Incluye el nombre del empleado
                ", edad=" + edad + /// Incluye la edad del empleado
                ", departamento='" + departamento + '\'' +   // Incluye el departamento del empleado
                ", antigüedad=" + calcularAntiguedad() +   // Incluye la antigüedad del empleado
                '}';
        }
    }