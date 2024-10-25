package co.edu.umanizales.empresa.modelos;

public class EmpleadoPorHoras extends Empleado {
    // Clase pública EmpleadoPorHoras que hereda de la clase Empleado
    private double tarifaHora; // Atributo privado que almacena la tarifa por hora del empleado
    private int horasTrabajadas; // Atributo privado que almacena las horas trabajadas por el empleado

    // Constructor que permite inicializar un objeto de tipo EmpleadoPorHoras
    //super: se utiliza para llamar al constructor de la clase padre, invocar métodos sobrescritos de la clase padre y acceder a atributos de la clase padre en caso de ambigüedad, facilitando así la herencia y la reutilización de código.
    //this:se utiliza para referirse a la instancia actual de la clase y mejorar la claridad del código.
    public EmpleadoPorHoras(String nombre, int edad, String departamento, int anioContratacion, double tarifaHora, int horasTrabajadas) {
        super(nombre, edad, departamento, anioContratacion); // Llama al constructor de la clase padre (Empleado)
        this.tarifaHora = tarifaHora; // Asigna el valor del parámetro tarifaHora al atributo privado tarifaHora
        this.horasTrabajadas = horasTrabajadas; // Asigna el valor del parámetro horasTrabajadas al atributo privado horasTrabajadas
    }
    // Método público que calcula el salario mensual del empleado
    public double calcularSalarioMensual() {
        return tarifaHora * horasTrabajadas; // Retorna el producto de tarifaHora y horasTrabajadas
    }
    // Método sobrescrito que proporciona una representación en forma de cadena del objeto
    @Override
    public String toString() {
        //super.toString
        return super.toString() + ", Salario por horas=" + calcularSalarioMensual();
        // Llama al método toString() de la clase padre y añade el salario mensual
    }
}