/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.EmpleadoControlador;
import java.time.LocalDate;
import java.time.Month;
import modelo.*;
import servicio.EmpleadoServiceImpl;

/**
 *
 * @author ochoa
 */
public class Principal {
    public static void main(String[] args) {
        
        System.out.println("-------------------- EMPRESAS Y SUS EMPLEADOS --------------------");
        
        var baseDato = new EmpleadoServiceImpl();
        var empleado = new Empleado("Andres",LocalDate.of(2002, 8, 12),"0302592704",180,1,160);
        var empresa = new Empresa("Bebidas Gaseosas","Jhon Wilson","Coca Cola",1888,empleado,1);
        
        
        System.out.println(empresa);
        System.out.println(empleado);
        
        
        System.out.println("-------------------- DATOS DEL PRIMER EMPLEADO Y SU PAGO --------------------");
        var empleadoControl = new EmpleadoControlador();
        var data = new String[8];

        data[0] = "10";
        data[1] = "0301234556";
        data[2] = "600";
        data[3] = "Andres O";
        data[4] = "1987";
        data[5] = "06";
        data[6] = "22";
        data[7] = "182";
        
        System.out.println("El primer empleado que recibe el sueldo de "  + empleadoControl.crear(data));
        System.out.println("Al empleado le devuelve el sueldo de " + empleadoControl.devuelveSueldo(data));
        System.out.println(empleadoControl.listar());
        
        System.out.println("-------------------- DATOS DEL SEGUNDO EMPLEADO Y SU PAGO --------------------");
        var empleadoControl1 = new EmpleadoControlador();
        var data1 = new String[8];

        data1[0] = "20";
        data1[1] = "032433922";
        data1[2] = "700";
        data1[3] = "Paul S";
        data1[4] = "1666";
        data1[5] = "07";
        data1[6] = "30";
        data1[7] = "160";
        
        System.out.println( "El segundo empleado que recibe el sueldo de "  + empleadoControl1.crear(data1));
        System.out.println("Al empleado le devuelve el sueldo de " + empleadoControl1.devuelveSueldo(data1));
        System.out.println(empleadoControl1.listar());
        
        System.out.println("-------------------- DATOS DEL TERCERO EMPLEADO Y SU PAGO --------------------");
        var empleadoControl2 = new EmpleadoControlador();
        var data2 = new String[8];

        data2[0] = "30";
        data2[1] = "03589358";
        data2[2] = "900";
        data2[3] = "Carlos G";
        data2[4] = "1988";
        data2[5] = "10";
        data2[6] = "13";
        data2[7] = "110";
        
        System.out.println("El tercer empleado que recibe el sueldo de "  + empleadoControl2.crear(data2));
        System.out.println("Al empleado le devuelve el sueldo de " + empleadoControl2.devuelveSueldo(data2));
        System.out.println(empleadoControl2.listar());
        
    }
}
