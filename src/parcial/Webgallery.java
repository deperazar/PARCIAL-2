/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Webgallery {
    
    private ArrayList<Usuario> users;
    private ArrayList<Obra> coleccionobras;
    
    
    public Webgallery(){
        this.users=new ArrayList<>();
        this.coleccionobras=new ArrayList<>();
    }
    
    public String vercoleccion(){
        String a="";
        for(Obra obra:coleccionobras){
            a=obra.getnomb()+obra.getdesc()+obra.getestil()+obra.getvalor()+a+"\n";
        }
        return a;
    }
    
    public void addobras(){
        for(Usuario user: users){
            if(user:)
        }
        
    }
    
    public ArrayList obrasarte(){
        return this.coleccionobras;
    }
    
    public void adduser(Usuario u){
        this.users.add(u);
        for(Usuario n: users){
            if(n instanceof Artista){
                Artista a=(Artista)n;
                for(Obra o:n.obrasartista()){
                    
                }
            }
        }
    }
    
}
