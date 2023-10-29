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
    FORMULARIO MENU------------------------------------------------------------------------------------------
    
    Se ingresa a la pantalla principal en la cual se encuentra una barra de menu / Se ingresa a la opcion deseada
        Hay una Barra Menu Bar --> Tiene 4 Menus
    
            1ª Menu Paciente --> Tiene 2 Menu Items -->1ª Formulario Paciente
                                                    -->2ª Control de Peso
    
            2ª Menu Dieta    --> Tiene 1 Menu Items -->1ª Formulario Dieta
    
            3ª Menu Comida   --> Tiene 3 Menu Items -->1ª Formulario Tipo de Comida 
                                                    -->2ª Formulario Tipo de Dieta
                                                    -->3ª Formulario Alimentacion
    
            4ª Menu Exit --> SALE DEL PROGRAMA
    
    FORMULARIO PACIENTE----------------------------------------------------------------------------------------
    
    En este formulario se cargan todos los datos del paciente--> Donde se puede
                     *Agregar paciente 
                     *Modificar paciente
                     *Eliminar paciente
    Se ingresa al formulario --> MODIFICAR/ ELIMINAR / LIMPIAR -->Botones deshabilitados
    Se ingresa DNI --> se habilitan  botones  LIMPIAR/ELIMINAR / 
                     Si el DNI no esta ingresado se habilita limpiar
                     Si el DNI esta ingresado se habilita Limpiar y Eliminar
                
                BUSCAR --> Llena todos los datos / se habilita Boton MODIFACAR si se ingresa algun caracter 
                REGISTRAR --> ingresa DNI --> BUSCAR si no esta en la base emite un cartel informando.Solo se habilita el BOTON-->LIMPIAR
                                                     Si el DNI esta en la base de datos --> BUSCAR --> se muestranlos datos.
                                                     Si esta el DNI y presiono registrar informa que ya esta cargado el DNI.
                                   Se ingresan los datos se verifican que sean los permitidos o muestra carteles de error
                                   crea el idpaciente automaticamente alcargarlo en la base de datos
                MODIFICAR --> guarda la modificacion en la bd, emite cartel se guardo y luego limpia los campos
                LIMPIAR --> Borra todos los campos en la tabla
                ELIMINAR --> cambia elestado del paciente a desactivado/ muestra cartel y limpia los campos de la tabla
                SALIR --> nos saca de la vista
    
    FORMULARIO DIETA---------------------------------------------------------------------------------------------
    
     En este formulario carga la dieta del paciente
                            --> Donde se puede 
                                --> calcular el peso sugerido
                                --> calcula el IMC
                                --> Sugiere tipo de dieta
                    *Agregar dieta 
                    *Modificar dieta
                    *Eliminar dieta
    Se ingresa al formulario--> MODIFICAR/ELIMINAR/SALIR  botenes habilitados
    Se ingresa DNI --> carga el idpaciente / el sexo  del paciente cargado se habilita boton agregar
                BUSCAR--> deshabilita si no tiene dieta cargada
                         hablitado si tienedieta cargada
                Calcular Peso --> agrego pesoI y altura .Datos mal ingresados --> cartel de error
                                                         Datos bien ingresados--> cartel abisando estado paciente
                                                         calcula  pesoF/ imc/ dieta sugerida
                AGREGAR --> si paciente no existe /luego calculo de peso --> si tiene fechaF -->SE AGREGA / limpia campos
                                                                             si no tiene fechaF --> cartel de error
                MODIFICAR--> Modifico altura o pesoI --> Boton--> Calcular peso -->acepto / cartel de cambio exitoso
                            / se borran los campos del formulario
                ELIMINAR --> Elimina dieta de la tabla
                SALIR--> Se sale de la vista
    
    FORMULARIO TIPO COMIDA-----------------------------------------------------------------------------------------
    
    En este formulario se selecciona una comida de la tabla y se --> Elimina
                          selecciona una comida de la tabla y en cualquier jTexField se cambia los datos y se --> Modifica 
                          Al ingresar el nombre de una comida que no esta en la tabla se habilita el boton y se -->Agrrega 
                          Al ingresar las calorias en el sector Calorias,te muestra todas las comidas con menos calorias a las ingresadas
    Se ingresa al formulario--> LIMPIAR/ SALIR --> Botones habilitados
    Se ingresa en el sector comida en el nombre --> si habilita el--> Boton  Agregar 
    
                AGREGAR-->Si nombre no esta repetido /se agrega con exito/ se borran los campos
                          Si esta repetido se deshabilita el boton agregar
                MODIFICAR--> Se selecciona de la tabla un alimento --> habilita boton --> MODIFICAR/ELIMINAR
                            Modifico todos los campos o el campo deseado--> guarda modificacion 
                            / borra los campos/deshabilita MODIFICAR/ELIMINAR
                LIMPIAR --> Borra todos los campos en la tabla/ borra calorias del sector de la tabla calorias
                ELIMINAR --> cambia elestado de TipoComida a desactivado/ muestra cartel y limpia los campos de la tabla
                SALIR --> nos saca de la vista
    
    En el sector del formulario Calorias --> se ingresa cant de calorias y el la tabla se muestran los alimentos
    de menos calorias que las ingresadas
    
    
    FORMULARIO PESO PACIENTE----------------------------------------------------------------------------------------
    
    Se ingresa al formulario--> LIMPIAR/ SALIR --> Botones habilitados
    Se ingresa el peso que se tiene como meta y se muestra el listado de pacientes que no llegaron a la meta 
    
                LIMPIAR --> Borra todos los campos en la tabla
                SALIR --> nos saca de la vista
    
    FORMULARIO TIPO DIETA------------------------------------------------------------------------------------------
    
    Se ingresa al formulario--> AGREGAR/ELIMINAR/ SALIR --> Botones habilitados
    Se ingresa el DNI del paciente y si se habilita 
                BUSCAR -->si el DNI tiene dieta se habilita el boton Buscar
                          si el DNI no tiene dieta entonces no se habilita el boton Buscar
                AGREGAR-->Se selecciona de la tabla de alimentos y si no se encuentra cargado se carga 
                          
                ELIMINAR --> cambia elestado de TipoComida a desactivado/ muestra cartel y limpia los campos de la tabla
                SALIR --> nos saca de la vista
    
    
    FORMULARIO COMIDA DIETA
       
    
    */ 
}
