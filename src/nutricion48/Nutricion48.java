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
        
        Paciente paciente = new Paciente( "Irasoqui", 33099033, "Falsa 123", 265479 );
    PacienteData pacData = new PacienteData();
    
    pacData.modificarPaciente(paciente);
    }
    
    
}
