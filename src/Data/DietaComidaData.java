/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Entidades.Comida;
import Entidades.Dieta;
import Entidades.DietaComida;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author A Tirador Laser
 */
public class DietaComidaData {
      private Connection con = null; 
      private DietaData dieData;
      private ComidaData comData;
      private DietaComidaData dieCoData;
      
    public DietaComidaData() {
     con=Conexion.conectar();
     dieData = new DietaData();
     comData = new ComidaData();
    }

    // CARGAR UNA DIETA-COMIDA
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
                JOptionPane.showMessageDialog(null, "Comida agregada");
            }
            ps.close();
        } catch (SQLException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo agregar la dieta");
        }
    
    
    }

    // ELIMINAR UNA DIETA-COMIDA
    public void bajaDietaComida(int id ){
        
        String sql = "DELETE FROM dietacomida WHERE idDietaComida=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int num = ps.executeUpdate();
            
            if (num ==1){
            JOptionPane.showMessageDialog(null, "La dieta se eliminó correctamente");
            } 
            ps.close();
            } catch (SQLException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "No se ha podido dar de baja a la dieta"+ ex);
        }
    
    }   

    // MODIFICAR UNA DIETA-COMIDA 
    public void ModificarDietaComida(DietaComida dietacomida){
    String sql = "UPDATE dietacomida SET idComida=?, idDieta=? WHERE idDietaComida=? ";
    
        try {
            PreparedStatement ps = con.prepareStatement(sql);
         
           ps.setInt(1, dietacomida.getComida().getIdComida());
           ps.setInt(2, dietacomida.getDieta().getIdDieta());
           ps.setInt(3, dietacomida.getIdDietaComida());
            int exito = ps.executeUpdate();
            
            if(exito == 1){
            JOptionPane.showMessageDialog(null, "Dieta modificada con éxito");
            } 
            ps.close();
        } catch (SQLException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "No se ha podido modificar la dieta");
        }
    }
    
    // LISTAR DIETA-COMIDA  POR NOMBRE
    public ArrayList<DietaComida> listarDietasxNombre(String nombre){
        String sql="SELECT idDietaComida, diCo.idDieta,diCo.idComida, di.nombre as dieta, co.nombre as alimento, co.cantCalorias FROM dietaComida diCo JOIN dieta di, comida co "
                + "WHERE di.idDieta=diCo.idDieta AND co.idComida=diCo.idComida AND di.nombre=? AND co.estado=1";
        ArrayList <DietaComida> dietas =new ArrayList();
          try {
              PreparedStatement ps=con.prepareStatement(sql);
              ps.setString(1, nombre);
              ResultSet rs=ps.executeQuery();
              while(rs.next()){ 
                  DietaComida dietaComida = new DietaComida();
                  dietaComida.setIdDietaComida(rs.getInt("idDietaComida"));
                  Dieta dieta = dieData.buscarDietaxId(rs.getInt("idDieta"));
                  Comida comida = comData.buscarComidaxId(rs.getInt("idComida"));
                  
                  dieta.setNombre(rs.getString("dieta"));
                  comida.setNombre(rs.getString("alimento"));
                  comida.setCantCalorias(rs.getInt("cantCalorias"));
                  dietaComida.setComida(comida);
                  dietaComida.setDieta(dieta);
                  
                  dietas.add(dietaComida);
              }
              ps.close();
          } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Error");
          }
          return dietas;
    }
    
    public void eliminarDietaComidaxDieta(int idDieta){
        String sql = "DELETE FROM dietacomida WHERE idDieta=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idDieta);
            
            int num = ps.executeUpdate();
            
            if (num ==1){
            JOptionPane.showMessageDialog(null, "La dieta se eliminó correctamente");
            } 
            ps.close();
            } catch (SQLException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar la dieta");
        }
    }
    
    public ArrayList<Comida>listarComidasPorDieta(int idDieta){
        String sql = "SELECT co.* FROM comida co, dietaComida diCo, dieta di "
                + "WHERE co.idComida=diCo.idComida AND diCo.idDieta=di.idDieta AND di.idDieta=?";
        ArrayList <Comida> comidas =new ArrayList();
          try {
              PreparedStatement ps = con.prepareStatement(sql);
              ps.setInt(1, idDieta);
              ResultSet rs=ps.executeQuery();
              while(rs.next()){ 
                  DietaComida dietaComida = new DietaComida();
                  Comida comida = comData.buscarComidaxId(rs.getInt("idComida"));
                  comida.setNombre(rs.getString("nombre"));
                  comida.setDetalle(rs.getString("detalle"));
                  comida.setCantCalorias(rs.getInt("cantCalorias"));
                  dietaComida.setComida(comida);
                  comidas.add(dietaComida.getComida());
              }
          } catch (SQLException ex) {
              Logger.getLogger(DietaComidaData.class.getName()).log(Level.SEVERE, null, ex);
          }
          return comidas;
    }
     
    public void eliminarComidaxIdcomida(int idComida){
        String sql = "DELETE FROM dietaComida WHERE idComida=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idComida);
            
            int num = ps.executeUpdate();
            
            
            ps.close();
            } catch (SQLException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar la comida");
        }
    }
    
   
}
