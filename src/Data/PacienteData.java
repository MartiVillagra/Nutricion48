/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Entidades.Paciente;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author A Tirador Laser
 */
public class PacienteData {
    
    
    private Connection con = null; 
    
    public PacienteData(){
     con=Conexion.conectar();
    }
    //DAR ALTA A UN PACIENTE.
    public void altaPaciente(Paciente paciente){
    String sql = "INSERT INTO paciente (nombre, dni, domicilio, telefono) VALUES (?,?,?,?)";
    
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, paciente.getNombre()); 
            ps.setInt(2, paciente.getDni());
            ps.setString(3, paciente.getNombre());
            ps.setInt(4, paciente.getTelefono());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                paciente.setIdPaciente(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Paciente guardado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la Table Paciente" +ex);
        }
    
    
    }
    
    // BORRAR UN PACIENTE.
    public void bajaPaciente(int dni){
        
        String sql = "DELETE FROM paciente WHERE dni = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            int num = ps.executeUpdate();
            
            if (num == 1){
            JOptionPane.showMessageDialog(null, "El paciente se eliminó corréctamente");
            } else {
            JOptionPane.showMessageDialog(null, "Paciente no encontrado");
            }
            } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "No se ha podido eliminar al paciente"+ ex);
        }
    
        
    }
    //MODIFICAR PACIENTE:
    
    public void modificarPaciente(Paciente paciente){
    String sql = "UPDATE paciente SET nombre = ?, dni = ?, domicilio = ?, telefono = ? WHERE idPaciente = ? ";
    
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, paciente.getNombre());
            ps.setInt(2, paciente.getDni());
            ps.setString(3, paciente.getDomicilio());
            ps.setInt(4, paciente.getTelefono());
            ps.setInt(5, paciente.getIdPaciente());
            int exito = ps.executeUpdate();
            
            if(exito == 1){
            JOptionPane.showMessageDialog(null, "Paciente modificado con éxito");
            } else {
            JOptionPane.showMessageDialog(null, "Paciente no encontrado");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se ha podido modificar el paciente"+ ex);
        }
    
    
    }
}
