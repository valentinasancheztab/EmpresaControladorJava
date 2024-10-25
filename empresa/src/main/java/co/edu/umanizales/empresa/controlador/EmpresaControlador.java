package co.edu.umanizales.empresa.controlador;

import co.edu.umanizales.empresa.modelos.*;
import co.edu.umanizales.empresa.servicios.EmpresaServicio;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresa")
public class EmpresaControlador {
    // Clase pública EmpresaControlador que actúa como controlador de la lógica de negocio para la gestión de empleados.
    private final EmpresaServicio empresaService = new EmpresaServicio();
    // Instancia de la clase EmpresaServicio que proporciona métodos para manejar operaciones relacionadas con empleados.

    @PostMapping("/empleadoTiempoCompleto")
    //ResponseEntity:es una herramienta útil en Spring para construir respuestas, personalizasas facilitando el manejo
    public ResponseEntity<String> agregarEmpleadoTiempoCompleto(
          @RequestBody EmpleadoTiempoCompleto empleadoTiempoCompleto) {
        // Método que agrega un nuevo empleado a tiempo completo a través de la solicitud
        //EmpleadoTiempoCompleto empleado = new EmpleadoTiempoCompleto(nombre, edad, departamento, anioContratacion, salarioAnual);
        // empleadoTiempoCompleto es deserializado automáticamente desde el cuerpo de la solicitud (JSON).
        empresaService.agregarEmpleado(empleadoTiempoCompleto);
        // Llama al método agregarEmpleado del servicio para añadir el empleado a tiempo completo.
        // ResponseEntity.ok: es una forma conveniente de construir respuestas HTTP exitosas en aplicaciones Spring, facilitando el manejo de datos y el retorno de estados de respuesta adecuados al cliente.
        return ResponseEntity.ok("Empleado a tiempo completo añadido");
        // Retorna una respuesta HTTP 200 OK con un mensaje de éxito.
    }

    // Indica que este método responderá a solicitudes HTTP POST en la ruta "/empleadoPorHoras"
    @PostMapping("/empleadoPorHoras")

    public ResponseEntity<String> agregarEmpleadoPorHoras(
            @RequestBody EmpleadoPorHoras empleadoPorHoras) {
        // Método que agrega un nuevo empleado por horas a través de parámetros de solicitud.
        // Crea una nueva instancia de EmpleadoPorHoras utilizando los parámetros de la solicitud.
        empresaService.agregarEmpleado(empleadoPorHoras);
        // Llama al método agregarEmpleado del servicio para añadir el empleado por horas.
        return ResponseEntity.ok("Empleado por horas añadido");
        // Retorna una respuesta HTTP 200 OK con un mensaje de éxito.

    }

    @GetMapping("/empleadosPorDepartamento")
    // Indica que este método responderá a solicitudes HTTP GET en la ruta
    public ResponseEntity<List<Empleado>> consultarEmpleadosPorDepartamento( String departamento) {
        // Método que consulta y retorna una lista de empleados por departamento.
        List<Empleado> empleados = empresaService.consultarEmpleadosPorDepartamento(departamento);
// Llama al método consultarEmpleadosPorDepartamento del servicio para obtener la lista de empleados.
        return ResponseEntity.ok(empleados);
        // Retorna una respuesta
    }


    @GetMapping("/salariosMensuales")
    public ResponseEntity<List<Double>> consultarSalariosMensuales() {  // Método que consulta y retorna una lista de salarios mensuales.
        List<Double> salarios = empresaService.consultarSalariosMensuales();  // Llama al método consultarSalariosMensuales del servicio para obtener la lista de salarios.
        return ResponseEntity.ok(salarios);
        // Retorna una respuesta
    }


    @GetMapping("/empleadoMasAntiguo")
    // Indica que este método responderá a solicitudes  en la ruta
    public ResponseEntity<Empleado> consultarEmpleadoMasAntiguo() {
        // Método que consulta y retorna el empleado más antiguo registrado.
        Empleado empleadoMasAntiguo = empresaService.consultarEmpleadoMasAntiguo(); // Llama al método consultarEmpleadoMasAntiguo del servicio para obtener el empleado más antiguo.
        return ResponseEntity.ok(empleadoMasAntiguo);
        // // Retorna una respuesta
    }


    @GetMapping("/empleadosPorTipo")
    // Indica que este método responderá a solicitudes HTTP GET en la ruta
    public ResponseEntity<List<Empleado>> consultarEmpleadosPorTipo(@RequestParam String tipoEmpleado) { // Método que consulta y retorna una lista de empleados según el tipo.
        List<Empleado> empleadosPorTipo = empresaService.consultarEmpleadosPorTipo(tipoEmpleado);  // Llama al método consultarEmpleadosPorTipo del servicio para obtener la lista de empleados de un tipo específico.
        return ResponseEntity.ok(empleadosPorTipo); // Retorna una respuesta
    }
}
