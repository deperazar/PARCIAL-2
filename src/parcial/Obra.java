/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

/**
 *
 * @author Estudiante
 */
public class Obra {
    private String nombreobra;
    private String descripcion;
    private String estilo;
    private double valor;
    
    private boolean comprada;
    
    
    
    public Obra(String n,String d, String e, double v){
        this.nombreobra=n;
        this.descripcion=d;
        this.estilo=d;
        this.valor=v;
    }
    
    public String getnomb(){
        return this.nombreobra;
    }
    public String getdesc(){
        return this.descripcion;
    }
    public String getestil(){
        return this.estilo;
    }
    public double getvalor(){
        return this.valor;
    }
    
    
   
}
