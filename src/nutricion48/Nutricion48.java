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
        System.out.println("Hola mundo");
    
    //--------------------- cargar paciente-------------------------------
    
        Paciente pacienteC = new Paciente( "Irasoqui", 33099033, "Falsa 123", 265479 );
        PacienteData pacData= new PacienteData();
        pacData.altaPaciente(pacienteC);
    //--------------------------modificar paciente----------------------    
   
        Paciente pacienteM = new Paciente( "Garcia Cristian", 29777123, "Falsa 123", 45554387 );
        //PacienteData pacData = new PacienteData();
        pacData.modificarPaciente(pacienteM);
    
    //----------------------eliminar paciente-----------------------

        // PacienteData pacData = new PacienteData();
        pacData.bajaPaciente(0);
        
    }
    
    
}
