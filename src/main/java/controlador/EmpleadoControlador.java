/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.time.LocalDate;
import java.util.List;
import modelo.Empleado;
import modelo.Empresa;
import servicio.EmpleadoServiceImpl;

/**
 *
 * @author ochoa
 */
public class EmpleadoControlador {

    private final EmpleadoServiceImpl empleadoServi;

    public EmpleadoControlador() {
        this.empleadoServi = new EmpleadoServiceImpl();
    }

    public String crear(String[] data) {
        var retorno = "";
        var codigo = Integer.valueOf(data[0]).intValue();
        var sueldo = Integer.valueOf(data[2]).intValue();
        var cedula = data[1];
        var nombre = data[3];
        var year = Integer.valueOf(data[4]).intValue();
        var mes = Integer.valueOf(data[5]).intValue();
        var dia = Integer.valueOf(data[6]).intValue();
        var horasTrabajadas = Integer.valueOf(data[7]).intValue();

        var sueldoEmpresa = new Empleado(nombre, LocalDate.of(year, mes, dia), cedula, horasTrabajadas, codigo, sueldo);
        this.empleadoServi.crear(sueldoEmpresa);
        
        System.out.println("El sueldo que pagan al mes es: " + sueldo);
        
        if (160 == horasTrabajadas) {
            retorno += "su pago es su sueldo normal";
        } else if (horasTrabajadas > 160 && horasTrabajadas < 166) {
            var r = (0.5) * sueldo;
            var c = sueldo + r;
            retorno += " su sueldo de horas extras es: " + c;
        } else if (horasTrabajadas > 166 && horasTrabajadas < 170) {
            var r1 = sueldo * (0.10);
            var c1 = sueldo + r1;
            retorno += " su sueldo de horas extras es: " + c1;
        } else if (horasTrabajadas > 171 && horasTrabajadas < 200) {
            var r2 = sueldo * (0.20);
            var c2 = sueldo + r2;
            retorno += " su sueldo de horas extras es: " + c2;
        } else {
            retorno += "----- no tienes las horas completadas -------";
        }
        return retorno;
    }

    public double devuelveSueldo(String[] data){
         var sueldo = Integer.valueOf(data[2]).intValue();
        return sueldo - (sueldo*0.01);
    }
    
    public List<Empleado> listar() {

        return this.empleadoServi.listar();

    }

}
