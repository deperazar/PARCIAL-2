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
public class Comprador extends Usuario{
    
    private Webgallery galery;
    

    public Comprador(String n, String a,Webgallery w){
        super(n, a);
        this.galery=w;
    }

    @Override
    public boolean registrarse() {
        return true;
    }
    
    public void vercolection(){
        galery.vercoleccion();
    }
    
    
    public void comprar(){
       galery.vercoleccion();
    }
    
    
}
