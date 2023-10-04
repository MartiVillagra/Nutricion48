/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Entidades.DietaComida;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author A Tirador Laser
 */
public class DietaComidaData {
      private Connection con = null; 
    
    public DietaComidaData() {
     con=Conexion.conectar();
    }

     //dar de alta una dieta comida 
    public void altaDieta(DietaComida dietacomida){
    String sql = "INSERT INTO dietacomida(idComida,idDieta) VALUES (?,?) ";
    
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
          ps.setInt(1,dietacomida.getComida().getIdComida());
          ps.setInt(2, dietacomida.getDieta().getIdDieta());
          
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                dietacomida.setIdDietaComida(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "dieta agregada");
            }
            ps.close();
        } catch (SQLException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Algo salió mal" +ex);
        }
    
    
    }

    
//    //------------- BORRAR DIETACOMIDA-------------------------------------
    public void bajaDietaComida(int id ){
        
        String sql = "DELETE FROM dietacomida WHERE id=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int num = ps.executeUpdate();
            
            if (num ==1){
            JOptionPane.showMessageDialog(null, "El paciente se eliminó corréctamente");
            } 
            ps.close();
            } catch (SQLException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Algo salio mal"+ ex);
        }
    
    }   
}
//    //MODIFICAR PACIENTE:
//    
//    public void modificarPaciente(Paciente paciente){
//    String sql = "UPDATE paciente SET nombre = ?, dni = ?, domicilio = ?, telefono = ? WHERE idPaciente = ? and estado =1 ";
//    
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setString(1, paciente.getNombre());
//            ps.setInt(2, paciente.getDni());
//            ps.setString(3, paciente.getDomicilio());
//            ps.setInt(4, paciente.getTelefono());
//            ps.setInt(5, paciente.getIdPaciente());
//            int exito = ps.executeUpdate();
//            
//            if(exito == 1){
//            JOptionPane.showMessageDialog(null, "Paciente modificado con éxito");
//            } else {
//            JOptionPane.showMessageDialog(null, "Paciente no encontrado");
//            }
//            
//        } catch (SQLException | NumberFormatException ex) {
//            JOptionPane.showMessageDialog(null, "No se ha podido modificar el paciente"+ ex);
//        }
//    }
//    
//}
