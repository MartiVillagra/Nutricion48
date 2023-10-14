/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Entidades.Dieta;
import Entidades.Paciente;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
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
    String sql = "INSERT INTO paciente (nombre, dni, domicilio, telefono, estado) VALUES (?,?,?,?,?)";
    
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, paciente.getNombre()); 
            ps.setInt(2, paciente.getDni());
            ps.setString(3, paciente.getDomicilio());
            ps.setInt(4, paciente.getTelefono());
            ps.setBoolean(5,paciente.isEstado());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                paciente.setIdPaciente(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Paciente guardado");
            }
            ps.close();
        } catch (SQLException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Algo salió mal" +ex);
        }   
    }
    
    // BORRAR UN PACIENTE.
    
    public void bajaPaciente(int dni){
        
        String sql = "UPDATE paciente SET estado = 0 WHERE dni = ? and estado =1";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            int num = ps.executeUpdate();
            
            if (num == 1){
            JOptionPane.showMessageDialog(null, "El paciente se eliminó corréctamente");
            } else {
            JOptionPane.showMessageDialog(null, "Paciente no encontrado");
            }
            } catch (SQLException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Algo salio mal"+ ex);
        }
    }
    
    //MODIFICAR PACIENTE:
    
    public void modificarPaciente(Paciente paciente){
    String sql = "UPDATE paciente SET nombre = ?, dni = ?, domicilio = ?, telefono = ? WHERE idPaciente = ? and estado =1 ";
    
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
            
        } catch (SQLException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "No se ha podido modificar el paciente"+ ex);
        }
    }
    
    // LISTA PACIENTES QUE NO LLEGARON AL PESO
    
    public ArrayList<Paciente> listarPacientesQueNoLegaron(double peso){
        String sql = "SELECT pa.* FROM paciente pa JOIN dieta di "
                + "WHERE pesoFinal != ? AND pa.idPaciente=di.idPaciente";
        ArrayList <Paciente> pacientes = new ArrayList();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, peso);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            Paciente paciente = new Paciente();
            paciente.setIdPaciente(rs.getInt("idPaciente"));
            paciente.setNombre(rs.getString("nombre"));
            paciente.setDni(rs.getInt("dni"));
            paciente.setDomicilio(rs.getString("domicilio"));
            paciente.setTelefono(rs.getInt("telefono"));
            paciente.setEstado(rs.getBoolean("estado"));
            pacientes.add(paciente);
            }
            ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "ERROR" + ex);
        }
        return pacientes;
    }
    
    //BUSCAR PACIENTE X ID
    
    public Paciente buscarPacientexId(int id){
        String sql =" SELECT nombre, domicilio, telefono, dni FROM paciente WHERE estado=1 and idPaciente=?" ;
        Paciente paciente = null;
  
        try {
        PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
            paciente = new Paciente();
            paciente.setIdPaciente(id);
            paciente.setNombre(rs.getString("nombre"));
            paciente.setDomicilio(rs.getString("domicilio"));
            paciente.setTelefono(rs.getInt("telefono"));
            paciente.setDni(rs.getInt("dni"));
            //paciente.setEstado(rs.getBoolean("estado"));
            } 
            ps.close();    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la lista de pacientes");
        }
        return paciente;
    }
    
    //BUSCAR PACIENTE X DNI
    
    public Paciente buscarPacientexDNI(int dni){
        String sql =" SELECT idPaciente, nombre, domicilio, telefono FROM paciente WHERE estado=1 and dni=?" ;
        Paciente paciente = null;
  
        try {
        PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
            paciente = new Paciente();
            paciente.setIdPaciente(rs.getInt("idPaciente"));
            paciente.setNombre(rs.getString("nombre"));
            paciente.setDomicilio(rs.getString("domicilio"));
            paciente.setTelefono(rs.getInt("telefono"));
            paciente.setDni(dni);
            //paciente.setEstado(rs.getBoolean("estado"));
            } else { JOptionPane.showMessageDialog(null, "Paciente no encontrado");}
            ps.close();    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la lista de pacientes");
        }
        return paciente;
    }
}
