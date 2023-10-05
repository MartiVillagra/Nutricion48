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
        
        String sql = "DELETE FROM dietacomida WHERE idDietaComida=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int num = ps.executeUpdate();
            
            if (num ==1){
            JOptionPane.showMessageDialog(null, "La dieta se eliminó corréctamente");
            } 
            ps.close();
            } catch (SQLException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Algo salio mal"+ ex);
        }
    
    }   

    //--------------------------MODIFICAR DIETA COMIDA------------------------------------
    
    public void ModificarDietaComida(DietaComida dietacomida){
    String sql = "UPDATE dietacomida SET idComida=?, idDieta=? WHERE idDietaComida=? ";
    
        try {
            PreparedStatement ps = con.prepareStatement(sql);
         
           ps.setInt(1, dietacomida.getComida().getIdComida());
           ps.setInt(2, dietacomida.getDieta().getIdDieta());
           ps.setInt(3, dietacomida.getIdDietaComida());
            int exito = ps.executeUpdate();
            
            if(exito == 1){
            JOptionPane.showMessageDialog(null, "dieta modificado con éxito");
            } 
            ps.close();
        } catch (SQLException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "No se ha podido modificar el paciente"+ ex);
        }
    }
    
}
