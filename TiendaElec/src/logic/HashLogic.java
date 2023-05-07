package logic;

import java.util.ArrayList;
import java.util.Hashtable;

public class HashLogic {
    
    Hashtable<Integer, HashLogic> objetos = new Hashtable<>();
    
    public int id;
    public String nombre;
    public String color;
    public int cantidad;
    
    public HashLogic(){
    }
    
    public HashLogic(int id, String nombre, String color, int cantidad){
        this.id = id;
        this.nombre = nombre;
        this.color = color; //modificar para que se lean dependiendo de los parametros desde la interfaz G
        this.cantidad = cantidad;
    }
    
    //Metodos
    public void crear(int id, String nombre, String color, int cantidad ){
        objetos.put(id, new HashLogic(id,nombre,color,cantidad));
    }
    
    //Metodos que leen los atributos y retornan el dato
    public int leerId(int clave){
        HashLogic leeId = (HashLogic) objetos.get(clave);
        return leeId.getId();
    }
    
    public String leerNombre(int clave){
        HashLogic leeNombre = (HashLogic) objetos.get(clave);
        return leeNombre.getNombre();
    }
    
    public String leerColor(int clave){
        HashLogic leeColor = (HashLogic) objetos.get(clave);
        return leeColor.getColor();
    }
    
    public int leerCantidad(int clave){
        HashLogic leeCantidad = (HashLogic) objetos.get(clave);
        return leeCantidad.getCantidad();
    }
    
    //Metodo que actualiza info
    public void actualizaDatos(int identificadorConsulta, int id, String nombre, String color, int cantidad){
        HashLogic actualiza = (HashLogic) objetos.get(identificadorConsulta);
        actualiza.setId(id);
        actualiza.setNombre(nombre);
        actualiza.setColor(color);
        actualiza.setCantidad(cantidad);
    }
    
    //Elimina objeto
    public void eliminaObj(int clave){
        HashLogic delObj = (HashLogic) objetos.get(clave);
        delObj.setId(0);
        delObj.setNombre("0");
        delObj.setColor("0");
        delObj.setCantidad(0);
    }
    
    //Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    //Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
