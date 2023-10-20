
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Entidades.Dieta;
import Entidades.Paciente;
import java.sql.Connection;
import java.sql.Date;
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
public class DietaData {

    private Connection con = null; 
    
    public DietaData(){
     con=Conexion.conectar();
    }
    
    // AGREGAR UNA DIETA  
    public void altaDieta(Dieta dieta){
    String sql = "INSERT INTO dieta (nombre,idPaciente,fechaInicial,pesoInicial ,pesoFinal,fechaFinal,altura, imc) "
            + "VALUES (?,?,?,?,?,?,?,?)";
    
    PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,dieta.getNombre());
            ps.setInt(2, dieta.getIdPaciente());
            ps.setDate(3, Date.valueOf(dieta.getFechaInicial()));
            ps.setDouble(4, dieta.getPesoInicial());
            ps.setDouble(5, dieta.getPesoFinal());
            ps.setDate(6, Date.valueOf(dieta.getFechaFinal()));
            ps.setDouble(7, dieta.getAltura());
            ps.setDouble(8, dieta.getImc());
        ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()){
                dieta.setIdDieta(rs.getInt(1));
                JOptionPane.showMessageDialog(null, " La dieta se agrego correctamente ");
            }
            ps.close();        
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla comida");
            }
    }
     
   // MODIFICAR UNA DIETA  
    public void modificarDieta(Dieta dieta){
            String sql= " UPDATE dieta SET nombre =?, idPaciente =?, fechaInicial=?,pesoInicial=? "
                    + ",pesoFinal=?,fechaFinal=?, altura=?, imc=? WHERE idDieta=? ";
            
        try {
            PreparedStatement ps = con.prepareStatement(sql); 
            ps.setString(1,dieta.getNombre());
            ps.setInt(2, dieta.getIdPaciente());
            ps.setDate(3, Date.valueOf(dieta.getFechaInicial()));
            ps.setDouble(4, dieta.getPesoInicial());
            ps.setDouble(5, dieta.getPesoFinal());
            ps.setDate(6, Date.valueOf(dieta.getFechaFinal()));
            ps.setDouble(7, dieta.getAltura());
            ps.setDouble(8, dieta.getImc());
            ps.setInt(9, dieta.getIdDieta());
            
            int espera=ps.executeUpdate();
            if (espera==1){
                
                JOptionPane.showMessageDialog(null, " Modificacion exitosa");
            }
            ps.close();
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error en la modificacion");
            }  
    }
    
    // ELIMINAR UNA DIETA    
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
    
    // BUSCAR DIETA POR ID    
    public Dieta buscarDietaxId(int id){
        String sql =" SELECT * from dieta WHERE idDieta=?" ;
        Dieta dieta = null;
  
        try {
        PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
            dieta = new Dieta();
            dieta.setIdDieta(id);
            dieta.setIdPaciente(rs.getInt("idPaciente"));
            dieta.setNombre(rs.getString("nombre"));
            dieta.setFechaInicial(rs.getDate("fechaInicial").toLocalDate());
            dieta.setPesoInicial(rs.getDouble("pesoInicial"));
            dieta.setPesoFinal(rs.getDouble("pesoFinal"));
            dieta.setFechaFinal(rs.getDate("fechaFinal").toLocalDate());
            dieta.setAltura(rs.getDouble("altura"));
//            dieta.setSexo(rs.getString("sexo"));
            dieta.setImc(rs.getDouble("imc"));
            } else {
            JOptionPane.showMessageDialog(null, "Dieta no encontrada.");
            }
            ps.close();    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la lista de dieta");
        }
        return dieta;
    }
    
    // BUSCAR DIETA POR PACIENTE
    public Dieta buscarDietaPorPaciente(int id){
        String sql =" SELECT * from dieta WHERE idPaciente=?" ;
        Dieta dieta = null;
  
        try {
        PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
            dieta = new Dieta();
            
            dieta.setIdPaciente(id);
            dieta.setIdDieta(rs.getInt("idDieta"));
            dieta.setNombre(rs.getString("nombre"));
            dieta.setFechaInicial(rs.getDate("fechaInicial").toLocalDate());
            dieta.setPesoInicial(rs.getDouble("pesoInicial"));
            dieta.setPesoFinal(rs.getDouble("pesoFinal"));
            dieta.setFechaFinal(rs.getDate("fechaFinal").toLocalDate());
            dieta.setAltura(rs.getDouble("altura"));
          //  dieta.setSexo(rs.getString("sexo"));
            dieta.setImc(rs.getDouble("imc"));
            } 
            
            ps.close();    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la lista de dieta");
        }
        return dieta;
    }
    
    
//    public  ArrayList <Dieta> listarDieta(String nombre){
//        String sql="SELECT di.*, pa.nombre as nom, pa.dni, pa.domicilio, pa.telefono "
//                + "FROM dieta di JOIN paciente pa ON di.idPaciente = pa.idPaciente WHERE estado= 1 AND di.nombre=?";
//        ArrayList dietas =new ArrayList();
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setString(1, nombre);
//            ResultSet rs=ps.executeQuery();
//            while(rs.next()){
//                Dieta diet =new Dieta();
//                Paciente paci = new Paciente();
//                diet.setIdDieta(rs.getInt("idDieta"));
//                diet.setNombre(rs.getString("nombre"));
//                diet.setIdPaciente(rs.getInt("idPaciente"));
//                diet.setFechaInicial(rs.getDate("fechaInicial").toLocalDate());
//                diet.setPesoInicial(rs.getDouble("pesoInicial"));
//                diet.setPesoInicial(rs.getDouble("pesoFinalal"));
//                diet.setFechaInicial(rs.getDate("fechaFinalal").toLocalDate());
//            }
//                    
//        } catch (SQLException ex) {
//            Logger.getLogger(DietaData.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return dietas ;
//    }

}
