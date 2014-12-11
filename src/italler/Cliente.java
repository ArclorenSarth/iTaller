/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package italler;

import java.util.ArrayList;






/**
 *
 * @author ArclorenSarth
 */
public class Cliente {
    private String Nombre = "-NA-";
    private String DNI = "-NA-";
    private String Dir = "-NA-";
    private String Tlf = "-NA-";
    private String Mvl  = "-NA-";
    private String Mail = "-NA-";
    private String Obs = "-NA-";
    private ArrayList<String> Coches;
   
    //CREADORA
    public Cliente (String nom, String dni, String dir, String tlf, 
                    String mvl, String mail, String obs){
        Coches = new ArrayList();
        Nombre = nom;
        DNI = dni;
        Dir = dir;
        Tlf = tlf;
        Mvl = mvl;
        Mail = mail;
        Obs = obs;
    }
    
    
    //ANADIR Y QUITAR COCHES
    public void addCoche(String mat){
        Coches.add(mat);
    }
    
    public boolean removeCoche(String mat){
        return Coches.remove(mat);
    }
    
    
    //SETTERS
    public void setNombre(String nom){
        Nombre = nom;
    }
    
    public void setDNI(String dni){
        DNI = dni;
    }
    
    public void setDir(String dir){
        Dir = dir;
    }
    
    public void setTlf(String tlf){
        Tlf = tlf;
    }
    
    public void setMvl(String mvl){
        Mvl = mvl;
    }
    
    public void setMail(String mail){
        Mail = mail;
    }
    
    public void setObs(String obs){
        Obs = obs;
    }
    
    //GETTERS
    public String getNombre(){
        return Nombre;
    }
    
    public String getDNI(){
        return DNI;
    }
    
    public String getDir(){
        return Dir;
    }
    
    public String getTlf(){
        return Tlf;
    }
    
    public String getMvl(){
        return Mvl;
    }
    
    public String getMail(){
        return Mail;
    }
    
    public String getObs(){
        return Obs;
    }
    
    public ArrayList<String> getCoches(){
        return Coches;
    }
    
    
    //DATA SAVE
    public String saveCLiente(){
        String save;
        save = Nombre +"\t"+ DNI +"\t"+ Tlf +"\t"+Mvl +"\t"+ 
               Mail +"\t"+ Dir;
        return save;
    }
    
}
