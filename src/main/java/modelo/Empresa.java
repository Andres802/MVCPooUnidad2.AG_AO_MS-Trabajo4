/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package modelo;

/**
 *
 * @author ochoa
 */
public class Empresa {

    private String productoCreado;
    private String creadorEmpresa;
    private String nombreEmpresa;
    private int yearCreado;
    private Empleado nombreEmpleado;
    private int numCodigo;


    public Empresa(String productoCreado, String creadorEmpresa, String nombreEmpresa, int yearCreado, Empleado nombreEmpleado, int numCodigo) {
        this.productoCreado = productoCreado;
        this.creadorEmpresa = creadorEmpresa;
        this.nombreEmpresa = nombreEmpresa;
        this.yearCreado = yearCreado;
        this.nombreEmpleado = nombreEmpleado;
        this.numCodigo = numCodigo;
     
    }
    

    public String getProductoCreado() {
        return productoCreado;
    }

    public void setProductoCreado(String productoCreado) {
        this.productoCreado = productoCreado;
    }

    public String getCreadorEmpresa() {
        return creadorEmpresa;
    }

    public void setCreadorEmpresa(String creadorEmpresa) {
        this.creadorEmpresa = creadorEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public int getYearCreado() {
        return yearCreado;
    }

    public void setYearCreado(int yearCreado) {
        this.yearCreado = yearCreado;
    }

    public Empleado getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(Empleado nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public int getNumCodigo() {
        return numCodigo;
    }

    public void setNumCodigo(int numCodigo) {
        this.numCodigo = numCodigo;
    }
    
    
    @Override
    public String toString() {
        return "Empresa{" + "Producto Creado=" + productoCreado + ", Creador de la Empresa=" + creadorEmpresa + ", Nombre de la Empresa=" + nombreEmpresa + ", Year Creado=" + yearCreado + ", Nombre del Empleado=" + nombreEmpleado.getNombre() + " num Codigo=" + numCodigo+ '}';
    }
    
    

}
