/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package italler;

/**
 *
 * @author ArclorenSarth
 */
public class Coche {
    private String Matricula = "-NA-";
    private String Marca = "-NA-";
    private String Modelo = "-NA-";
    private String numKm = "-NA-";
    private String numBastidor = "-NA-";
    private String Propietario = "-NA-";
    
    
    //CREADORA
    public Coche(String mat, String mar, String mod, 
                 String km, String nbas, String prop){
        Matricula = mat;
        Marca = mar;
        Modelo = mod;
        numKm = km;
        numBastidor = nbas;
        Propietario = prop;
    }
    
    //DAR PROPIETARIO 
    public void setPropietario(String prop){
        Propietario = prop;
    }
    
    //SETTERS
    public void setMatricula(String mat){
        Matricula = mat;
    }    
    
    public void setMarca(String mar){
        Marca = mar;
    }
    
    public void setModelo(String mod){
        Modelo = mod;
    }
    
    public void setNumKm(String km){
        numKm = km;
    }
    
    public void setNumBast(String nbas){
        numBastidor = nbas;
    }
    
    
    //GETTERS
    public String getMatricula(){
        return Matricula;
    }    
    
    public String getMarca(){
        return Marca;
    }
    
    public String getModelo(){
        return Modelo;
    }
    
    public String getNumKm(){
        return numKm;
    }
    
    public String getNumBast(){
        return numBastidor;
    }
    
    public String getPropietario(){
        return Propietario;
    }  

    String saveCoche() {
        String save;
        save = Matricula +"\t"+ Marca +"\t"+ Modelo +"\t"+ numKm +"\t"+ 
               numBastidor +"\t"+ Propietario;
        return save;
    }
    
}
