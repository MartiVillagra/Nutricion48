/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Data.Conexion;
import Entidades.Comida;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author A Tirador Laser
 */
public class ComidaData {

    private Connection con = null; 
    
    public ComidaData(){
     con=Conexion.conectar();
    }
    
    //----------------------- Dar de alta una comida----------------------------------
    
    public void altaComida(Comida comida){
    String sql = "INSERT INTO comida (nombre, detalle, cantCalorias,tipoComida) VALUES (?,?,?,?)";
    
    PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
                ps.setString(1,comida.getNombre());
                ps.setString(2, comida.getDetalle());
                ps.setInt(3, comida.getCantCalorias());
                ps.setBoolean(4, true);
                ps.setString(5, comida.getTipoComida());
                
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()){
                comida.setIdComida(rs.getInt(1));
                JOptionPane.showMessageDialog(null, " se ingreso correctamente el menu");
            }
            ps.close();        
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla comida");
            }
    }

    // --------------------Modificar una comida --------------
    
    public void modificarComida(Comida comida){
            String sql= " UPDATE comida SET nombre =?, detalle =?, cantCalorias=?,tipoComida=?"
                    + " WHERE idComida=? and estado =1 ";
            
        try {
            PreparedStatement ps = con.prepareStatement(sql); 
            ps.setString(1,comida.getNombre());
            ps.setString(2,comida.getDetalle());
            ps.setInt(3, comida.getCantCalorias());
            ps.setInt(4,comida.getIdComida());
            ps.setString(5,comida.getTipoComida());
            
            int espera=ps.executeUpdate();
            if (espera==1){
                
                JOptionPane.showMessageDialog(null, " Mosdificacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "Comida no encontrada");
            }
            ps.close();
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error en la modificacion");
            }  
    }
    //-----------------------Eliminar una comida -------------------------
    
    
    public void eliminarComida (int id){
        String sql= "UPDATE comida SET estado = 0  where idComida =? and estado =1";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            
            ps.setInt(1,id);
            int espera=ps.executeUpdate();
            
            if ( espera ==1){
                JOptionPane.showMessageDialog(null, " Comida eliminada");
            } else {
                JOptionPane.showMessageDialog(null, "Comida no encontrada");
            }
            ps.close();
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al eliminar la comida");
        }  
    }
    //------------------------- Lista de comidas -----------------------
    
    public ArrayList <Comida> listaDeComidasxCalorias(int cantCalorias){
        String sql =" SELECT  * from comida WHERE  cantCalorias < ? AND  estado=1" ;
        ArrayList <Comida> comidas =new ArrayList();
  
        try {
        PreparedStatement ps = con.prepareStatement(sql); 
             ps.setInt(1, cantCalorias);
         ResultSet rs = ps.executeQuery();
            while (rs.next()){
               
                Comida comida= new Comida();
                comida.setIdComida(rs.getInt("idComida"));
                comida.setNombre(rs.getString("nombre"));
                comida.setDetalle(rs.getString("detalle"));
                comida.setCantCalorias(rs.getInt("cantCalorias"));
                comida.setEstado(true);
                comida.setTipoComida(rs.getString("tipoComida"));
            comidas.add(comida);
            }
         ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la lista de comidas");
        }
        return comidas;
    }
    public Comida buscarComidaxId(int id){
        String sql =" SELECT * from comida WHERE estado=1 and idComida=?" ;
        Comida comida = null;
  
        try {
        PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
            comida = new Comida();
            comida.setIdComida(id);
            comida.setNombre(rs.getString("nombre"));
            comida.setDetalle(rs.getString("detalle"));
            comida.setCantCalorias(rs.getInt("cantCalorias"));
            comida.setEstado(rs.getBoolean("estado"));
            comida.setTipoComida(rs.getString("tipoComida"));
            } else {
            JOptionPane.showMessageDialog(null, "Comida no encontrada.");
            }
            ps.close();    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la lista de comidas");
        }
        return comida;
    }
    
}


