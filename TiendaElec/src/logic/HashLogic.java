package logic;

import java.util.ArrayList;

public class HashLogic {
    
    ArrayList<HashLogic> objetos = new ArrayList();
    public int id;
    public String nombre;
    public String color;
    public int cantidad;
    public int indice = -1;
    
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
        objetos.add(new HashLogic(id,nombre,color,cantidad));
    }
    
    //Metodos que leen los atributos y retornan el dato
    public int leerId(int i){
        HashLogic leeId = (HashLogic) objetos.get(i);
        return leeId.getId();
    }
    
    public String leerNombre(int i){
        HashLogic leeNombre = (HashLogic) objetos.get(i);
        return leeNombre.getNombre();
    }
    
    public String leerColor(int i){
        HashLogic leeColor = (HashLogic) objetos.get(i);
        return leeColor.getColor();
    }
    
    public int leerCantidad(int i){
        HashLogic leeCantidad = (HashLogic) objetos.get(i);
        return leeCantidad.getCantidad();
    }
    
    //Metodo que actualiza info
    public void actualizaDatos(int indice, int id, String nombre, String color, int cantidad){
        HashLogic actualiza = (HashLogic) objetos.get(indice);
        actualiza.setId(id);
        actualiza.setNombre(nombre);
        actualiza.setColor(color);
        actualiza.setCantidad(cantidad);
    }
    
    //Retorna posicion
    public int posicion(int id){
        for(int i=0;i<objetos.size();i++){
            HashLogic posicion = (HashLogic) objetos.get(i);
            
            if(posicion.getId() == id){
                indice = objetos.indexOf(posicion);
            }
            else{
                //return -1;
            }
        }
        return indice;
    }
    
    //Elimina objeto
    public void eliminar(int id){
        for(int i=0;i<objetos.size();i++){
            HashLogic posicion = (HashLogic) objetos.get(i);
            
            if(posicion.getId() == id){
                indice = objetos.indexOf(posicion);
                objetos.remove(indice);
            }
            else{
                System.out.println("No se encontro obj");
            }
        }
    }
    
    public ArrayList<HashLogic> getObjetos() {
        return objetos;
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
