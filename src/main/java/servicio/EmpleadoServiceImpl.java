/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Empleado;

/**
 *
 * @author ochoa
 */
public class EmpleadoServiceImpl implements EmpleadoService {

    private List<Empleado> empleadoList;

    public EmpleadoServiceImpl() {

        this.empleadoList = new ArrayList<>();

    }

    @Override
    public void crear(Empleado empleado) {

        this.empleadoList.add(empleado);

    }

    @Override
    public void modificar(int codigo, Empleado empleadoModificado) {

        var indice = 0;
        this.empleadoList.set(indice, empleadoModificado);

    }

    @Override
    public void eliminar(int codigo) {

        var indice = 0;
        for (var empleado : this.empleadoList) {
            if (empleado.getCodigoEmpleado() == codigo) {
                this.empleadoList.remove(indice);
                break;
            } else {
                indice++;
            }

        }

    }

    @Override
    public List<Empleado> listar() {

        return this.empleadoList;

    }

}
