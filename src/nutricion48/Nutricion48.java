/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutricion48;

import Data.ComidaData;
import Data.Conexion;
import Data.DietaComidaData;
import Data.DietaData;
import Data.PacienteData;
import Entidades.Comida;
import Entidades.Dieta;
import Entidades.DietaComida;
import Entidades.Paciente;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

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
        
        
//********PACIENTE    
//--------------------- CARGAR PACIENTE ----------------------------------------
    
//        Paciente pacienteC = new Paciente( "Gomez , Juan", 22000333, "Falsa 123", 265479, true );
//        PacienteData pacData= new PacienteData();
//        pacData.altaPaciente(pacienteC);
        
//--------------------- MODIFICAR PACIENTE -------------------------------------   
   
//        Paciente pacienteM = new Paciente( 1, "Garcia Cristian", 29777123, "Falsa 123", 45554387, true );
//        PacienteData pacData = new PacienteData();
//        pacData.modificarPaciente(pacienteM);
    
//---------------------- ELIMINAR PACIENTE -------------------------------------
//
//        PacienteData pacData = new PacienteData();
//        pacData.bajaPaciente(29777123);

//--------------------- LISTAR PACIENTES QUE NO LLEGARON AL PESO ---------------
//
//        PacienteData pacData = new PacienteData();
//        pacData.bajaPaciente(33099033);
//        for (Paciente paciente : pacData.listarPacientesQueNoLegaron(90)) {
//            System.out.println("idPaciente: "+paciente.getIdPaciente());
//            System.out.println("Nombre: "+paciente.getNombre());
//            System.out.println("Dni: "+paciente.getDni());
//            System.out.println("Domicilio: "+paciente.getDomicilio());
//            System.out.println("Telefono: "+paciente.getTelefono());
//            System.out.println("Estado: "+paciente.isEstado());
//            System.out.println("-------------------------------");
//        }

//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$

//********COMIDA
//------------------------- CARGAR COMIDA --------------------------------------
  
//        Comida comi = new Comida("PIZZA", "cuatro quesos por porcion ", 285, true);
//        ComidaData comData= new ComidaData();
//        comData.altaComida(comi);

//------------------------- MODIFICAR COMIDA -----------------------------------    
   
//        Comida comi = new Comida(3,"pomelo", "chico,. rosado", 80, true,"DESAYUNO");
//        ComidaData comData= new ComidaData();
//        comData.modificarComida(comi);
//    
//------------------------- ELIMINAR COMIDA ------------------------------------
//
//        ComidaData comData = new ComidaData();
//        comData.eliminarComida(3);
//    
//------------------ BUSCAR COMIDA POR NOMBRE ----------------------------------

//        ComidaData comData= new ComidaData();
//        Comida comi= comData.buscarComidaxNombre("tomate");
//        System.out.println(comi.toString());

//----------------- BUSCAR COMIDA POR ID --------------------------------------

//          ComidaData comidaData = new ComidaData();
//          System.out.println(comidaData.buscarComidaxId(1).toString());

//------------------  LISTAR COMIDA POR CALORIAS -------------------------------
//
//        Comida com1 =new Comida();
//        ComidaData comidata =new ComidaData();
//        for (Comida comi : comidata.listaDeComidasxCalorias(200)) {
//            System.out.println(comi);
//          }

//----------------- LISTAR TODAS LAS COMIDAS -----------------------------------
          
//        ComidaData comidata =new ComidaData();
//      
//         for (Comida com : comidata.listarTodasComidas()) {
//            System.out.println(com);
//            System.out.println("-----------------------------------");
//         }
//----------------- Nuevo codigo TOSTRING B) -----------------------------------
 
//        Comida comi =new Comida(5,"ARROZ","con papas",500,true);
//        System.out.println(comi.toString());

//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$

//******* DIETA
//--------------------- CARGAR DIETA .------------------------------------------
//      Dieta(int idDieta, String nombre, int idPaciente, LocalDate fechaInicial, double pesoInicial, double pesoFinal, LocalDate fechaFinal) {
//      Dieta die= new Dieta( "mediterranea", 1, LocalDate.of(2023, Month.MAY, 23) , 100,70, LocalDate.of(2023, Month.NOVEMBER, 13));
//      DietaData dietaData=new  DietaData();
//      dietaData.altaDieta(die);

//---------------------- MODIFICAR DIETA ---------------------------------------    
//   
//            Dieta die= new Dieta(1, "proteica", 1, LocalDate.of(2023, Month.MAY, 23) , 100,70, LocalDate.of(2023, Month.NOVEMBER, 13));
//            DietaData dietaData=new  DietaData();
//            dietaData.modificarDieta(die);
//    
//---------------------- ELIMINAR DIETA ----------------------------------------
//
//            DietaData dietaData=new  DietaData();
//            dietaData.eliminarDieta(1);
//    
//---------------------- DIETA POR ID ------------------------------------------

//          DietaData dietaData = new DietaData();
//          System.out.println(dietaData.buscarDietaxId(12).toString());

//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$

//******** DIETA-COMIDA
//---------------------- CARGAR UNA DIETA-COMIDA -------------------------------

//       Comida comi =new Comida(1,"ARROZ","con papas",500,true);
//       Dieta diet =new Dieta(2,"CARBON ",1,LocalDate.of(2023, Month.MARCH, 15),50,75,LocalDate.of(2023, Month.AUGUST, 2));
//       DietaComida num1 =new DietaComida(comi,diet);
//       DietaComidaData dicomida = new DietaComidaData();
//    
//       dicomida.altaDieta(num1);

 //--------------------- MODIFICAR DIETA-COMIDA --------------------------------
 
//      DietaComidaData dietacomi =new DietaComidaData();   
//      Comida comi =new Comida(5,"ARROZ","con papas",500,true);
//      Dieta dieta = new Dieta(10, "cal",1,LocalDate.of(2023, Month.MARCH, 15),50,75,LocalDate.of(2023, Month.AUGUST, 2), 20.4, 150);
//      DietaComida dieta1 =new DietaComida(4,comi,diet);
//      dietacomi.ModificarDietaComida(dieta1);

//----------------------- ELIMINAR UNA DIETA-COMIDA ----------------------------
    
//      DietaComida comi = new DietaComida();
//      DietaComidaData dietacomi =new DietaComidaData();
//      dietacomi.bajaDietaComida(2);

// ----------------------- LISTAR DIETA-COMIDA SEGUN EL NOMBRE -----------------

//     DietaComidaData dieCoData=new DietaComidaData();
//     for (DietaComida dietaCo : dieCoData.listarDietasxNombre("proteica")) {
//       System.out.println("idDietaComida: "+dietaCo.getIdDietaComida());
//       System.out.println("Dieta: "+dietaCo.getDieta().getNombre());
//       System.out.println("Alimento: "+dietaCo.getComida().getNombre());
//       System.out.println("Calorias: "+dietaCo.getComida().getCantCalorias()+" Cal");
//       System.out.println("-----------------------------------------");
//     }
//----------------------Eliminar dietaComida por el id de una Dieta
//       DietaComidaData dietaComidaData = new DietaComidaData();
//       dietaComidaData.eliminarDietaComidaxDieta(10);

//        DietaComidaData dietaComidaData = new DietaComidaData();
//        System.out.println(dietaComidaData.listarComidasPorDieta(16));
       
    }   
}

