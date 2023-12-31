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
    String sql = "INSERT INTO paciente (nombre, dni, domicilio, telefono, estado, sexo) VALUES (?,?,?,?,?,?)";
    
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, paciente.getNombre()); 
            ps.setInt(2, paciente.getDni());
            ps.setString(3, paciente.getDomicilio());
            ps.setString(4, paciente.getTelefono());
            ps.setBoolean(5,paciente.isEstado());
            ps.setString(6, paciente.getSexo());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                paciente.setIdPaciente(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Paciente guardado");
            }
            ps.close();
        } catch (SQLException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo guardar el paciente");
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
            JOptionPane.showMessageDialog(null, "El paciente se eliminó correctamente");
            } else {
            JOptionPane.showMessageDialog(null, "Paciente no encontrado");
            }
            } catch (SQLException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo dar de baja al paciente"+ ex);
        }
    }
    
    //MODIFICAR PACIENTE:
    
    public void modificarPaciente(Paciente paciente){
    String sql = "UPDATE paciente SET nombre = ?, dni = ?, domicilio = ?, telefono = ?, sexo=? WHERE idPaciente = ? and estado =1 ";
    
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, paciente.getNombre());
            ps.setInt(2, paciente.getDni());
            ps.setString(3, paciente.getDomicilio());
            ps.setString(4, paciente.getTelefono());
            ps.setString(5, paciente.getSexo());
            ps.setInt(6, paciente.getIdPaciente());
            int exito = ps.executeUpdate();
            
            if(exito == 1){
            JOptionPane.showMessageDialog(null, "Paciente modificado con éxito");
            } else {
            JOptionPane.showMessageDialog(null, "Paciente no encontrado");
            }
            
        } catch (SQLException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "No se ha podido modificar el paciente");
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
            paciente.setTelefono(rs.getString("telefono"));
            paciente.setEstado(rs.getBoolean("estado"));
            paciente.setSexo(rs.getString("sexo"));
            pacientes.add(paciente);
            }
            ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error" + ex);
        }
        return pacientes;
    }
    
    //BUSCAR PACIENTE X ID
    
    public Paciente buscarPacientexId(int id){
        String sql =" SELECT nombre, domicilio, telefono, dni, sexo FROM paciente WHERE estado=1 and idPaciente=?" ;
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
            paciente.setTelefono(rs.getString("telefono"));
            paciente.setDni(rs.getInt("dni"));
            paciente.setSexo(rs.getString("sexo"));
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
        String sql =" SELECT idPaciente, nombre, domicilio, telefono, sexo FROM paciente WHERE estado=1 and dni=?" ;
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
            paciente.setTelefono(rs.getString("telefono"));
            paciente.setSexo(rs.getString("sexo"));
            paciente.setDni(dni);
            //paciente.setEstado(rs.getBoolean("estado"));
            }
            ps.close();    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la lista de pacientes");
        }
        return paciente;
    }
}
