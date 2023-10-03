/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Entidades.Dieta;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author A Tirador Laser
 */
public class DietaData {

    private Connection con = null; 
    
    public DietaData(){
     con=Conexion.conectar();
    }
    
    //----------------------- Dar de alta una Dieta ----------------------------------
    
    public void altaDieta(Dieta dieta){
    String sql = "INSERT INTO dieta (nombre,idPaciente,fechaInicial,pesoInicial ,pesoFinal,fechaFinal) "
            + "VALUES (?,?,?,?,?,?)";
    
    PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,dieta.getNombre());
            ps.setInt(2, dieta.getIdPaciente());
            ps.setDate(3, Date.valueOf(dieta.getFechaInicial()));
            ps.setDouble(4, dieta.getPesoInicial());
            ps.setDouble(5, dieta.getPesoFinal());
            ps.setDate(6, Date.valueOf(dieta.getFechaFinal()));
        ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()){
                dieta.setIdDieta(rs.getInt(1));
                JOptionPane.showMessageDialog(null, " se ingreso correctamente el menu");
            }
            ps.close();        
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla comida");
            }
    }
    
    
   // --------------------Modificar una Dieta --------------
    
    public void modificarDieta(Dieta dieta){
            String sql= " UPDATE dieta SET nombre =?, idPaciente =?, fechaInicial=?,pesoInicial=? "
                    + ",pesoFinal=?,fechaFinal=? WHERE idDieta=? ";
            
        try {
            PreparedStatement ps = con.prepareStatement(sql); 
            ps.setString(1,dieta.getNombre());
            ps.setInt(2, dieta.getIdPaciente());
            ps.setDate(3, Date.valueOf(dieta.getFechaInicial()));
            ps.setDouble(4, dieta.getPesoInicial());
            ps.setDouble(5, dieta.getPesoFinal());
            ps.setDate(6, Date.valueOf(dieta.getFechaFinal()));
            ps.setInt(7, dieta.getIdDieta());
            
            int espera=ps.executeUpdate();
            if (espera==1){
                
                JOptionPane.showMessageDialog(null, " Modificacion exitosa");
            }
            ps.close();
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error en la modificacion");
            }  
    }
    //-----------------------Eliminar una comida -------------------------
    
    
    public void eliminarDieta (int id){
        
            String sql= "DELETE FROM dieta WHERE  idDieta=?";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            
            ps.setInt(1,id);
            int espera=ps.executeUpdate();
            
            if ( espera ==1){
                JOptionPane.showMessageDialog(null, " Dieta eliminada");
            } 
            ps.close();
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al eliminar la dieta");
        }  
    }

}
