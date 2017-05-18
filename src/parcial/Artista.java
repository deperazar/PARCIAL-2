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
public class Artista extends Usuario{
    
    private ArrayList<Obra> obras;
    private String distinciones;
    private String curriculum;
    
    public Artista(String d, String c,String n, String a){
        super(n,a);
        this.curriculum=c;
        this.distinciones=d;
        
        this.obras=new ArrayList();
    }
    
    public void agregarobras(Obra e){
        
        this.obras.add(e);
    }
    
    public ArrayList obrasartista(){
        return this.obras;
    }
    
    public int numerodeobras(){
        return this.obras.size();
    }

    public boolean registrarse() {
        return true;
    }
    
    
    
}
