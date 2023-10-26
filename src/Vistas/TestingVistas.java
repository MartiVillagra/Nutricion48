/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas;

/**
 *
 * @author lobop
 */
public class TestingVistas {
   /*
    FORMULARIO PACIENTE
    
    Se ingresa al formulario --> MODIFICAR/ ELIMINAR / LIMPIAR -->Botones deshabilitados
    Se ingresa DNI --> se habilitan  botones  LIMPIAR/ELIMINAR / 
                     Si el DNI no esta ingresado se habilita limpiar
                     Si el DNI esta ingresado se habilita Limpiar y Eliminar
                
                BUSCAR --> Llena todos los datos / se habilita Boton MODIFACAR si se ingresa algun caracter 
                MODIFICAR --> guarda la modificacion en la bd, emite cartel se guardo y luego limpia los campos
                REGISTRAR --> ingresa DNI --> BUSCAR si no esta en la base emite un cartel informando 
                                   solo se habilita el BOTON-->LIMPIAR
                                   Se ingresan los datos se verifican que sean los permitidos o muestra carteles de error
                                   crea el idpaciente automaticamente alcargarlo en la base de datos
                LIMPIAR --> Borra todos los campos en la tabla
                ELIMINAR --> cambia elestado del paciente a desactivado/ muestra cartel y limpia los campos de la tabla
                SALIR --> nos saca de la vista
    
    FORMULARIO DIETA
    
    Se ingresa al formulario--> MODIFICAR/ELIMINAR/SALIR  botenes habilitados
    Se ingresa DNI --> carga el idpaciente / el sexo  del paciente cargado se habilita boton agregar
                BUSCAR--> deshabilita si no tiene dieta cargada
                         hablitado si tienedieta cargada
                Calcular Peso --> agrego pesoI y altura .Datos mal ingresados --> cartel de error
                                                         Datos bien ingresados--> cartel abisando estado paciente
                                                         calcula  pesoF/ imc/ dieta sugerida
                AGREGAR --> si paciente no existe /luego calculo de peso --> si tiene fechaF -->SE AGREGA / limpia campos
                                                                             si no tiene fechaF --> cartel de error
                MODIFICAR--> Modifico altura o pesoI --> Boton--> Calcular peso -->acepto / cartel de cambio exitoso/ se borran los campos del formulario
                ELIMINAR --> Elimina dieta de la tabla
                SALIR--> Se sale de la vista
    
    FORMULARIO TIPO COMIDA
    
    Se ingresa al formulario--> LIMPIAR/ SALLIR --> Botones habilitados
    Se ingresa en el sector comida en el nombre --> si habilita el--> Boton  Agregar 
    
                AGREGAR-->Si nombre no esta repetido /se agrega con exito/ se borran los campos
                          Si esta repetido se deshabilita el boton agregar
                MODIFICAR--> Se selecciona de la tabla un alimento --> habilita boton --> MODIFICAR/ELIMINAR
                            Modifico todos los campos o el campo deseado--> guarda modificacion/ borra los campos/deshabilita MODIFICAR/ELIMINAR
                LIMPIAR --> Borra todos los campos en la tabla/ borra calorias del sector de la tabla calorias
                ELIMINAR --> cambia elestado de TipoComida a desactivado/ muestra cartel y limpia los campos de la tabla
                SALIR --> nos saca de la vista
    
    En el sector del formulario Calorias --> se ingresa cant de calorias y el la tabla se muestran los alimentos de menos calorias que las ingresadas
    
    
    FORMULARIO PESO PACIENTE
    FORMULARIO TIPO DIETA
    FORMULARIO COMIDA DIETA
    FORMULARIO MENU
    
    
    
    
    
    
    
    */ 
}
