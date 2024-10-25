package co.edu.umanizales.empresa.modelos;

public class EmpleadoTiempoCompleto extends Empleado {
    // Clase pública EmpleadoPorHoras que hereda de la clase Empleado
    private double salarioAnual; // Atributo privado que almacena el salario anual del empleado a tiempo completo

    // Constructor que permite inicializar un objeto de tipo EmpleadoTiempoCompleto
    public EmpleadoTiempoCompleto(String nombre, int edad, String departamento, int anioContratacion, double salarioAnual) {
        super(nombre, edad, departamento, anioContratacion); // Llama al constructor de la clase padre (Empleado) para inicializar los atributos heredados
        this.salarioAnual = salarioAnual; // Asigna el valor del parámetro salarioAnual al atributo privado salarioAnual
    }
    // Método público que calcula y retorna el salario mensual del empleado
    public double calcularSalarioMensual() {
        return salarioAnual / 12; // Divide el salario anual entre 12 para obtener el salario mensual
    }

    // Método sobrescrito que proporciona una representación en forma de cadena del objeto
    @Override
    public String toString() {
        return super.toString() + ", Salario mensual=" + calcularSalarioMensual();
        // Llama al método toString() de la clase padre y añade el salario mensual calculado
    }
}