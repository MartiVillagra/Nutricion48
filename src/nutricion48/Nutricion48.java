/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutricion48;

import Data.Conexion;
import Data.PacienteData;
import Entidades.Paciente;
import java.sql.Connection;

/**
 *
 * @author Nova
 */
public class Nutricion48 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection con = Conexion.conectar();
    
    //--------------------- cargar paciente-------------------------------
    
        Paciente pacienteC = new Paciente( "Irasoqui", 33099033, "Falsa 123", 265479, true );
        PacienteData pacData= new PacienteData();
//        pacData.altaPaciente(pacienteC);
    //--------------------------modificar paciente----------------------    
   
        Paciente pacienteM = new Paciente( 2, "Garcia Cristian", 29777123, "Falsa 123", 45554387, true );
        //PacienteData pacData = new PacienteData();
//        pacData.modificarPaciente(pacienteM);
    
    //----------------------eliminar paciente-----------------------

        // PacienteData pacData = new PacienteData();
//        pacData.bajaPaciente(33099033);
        //Listar Pacientes que  no llegaron a tal peso
        for (Paciente paciente : pacData.listarPacientesQueNoLegaron(90)) {
            System.out.println("idPaciente: "+paciente.getIdPaciente());
            System.out.println("Nombre: "+paciente.getNombre());
            System.out.println("Dni: "+paciente.getDni());
            System.out.println("Domicilio: "+paciente.getDomicilio());
            System.out.println("Telefono: "+paciente.getTelefono());
            System.out.println("Estado: "+paciente.isEstado());
            System.out.println("-------------------------------");
        }
    }
    
    
}
