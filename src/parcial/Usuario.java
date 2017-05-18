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
public abstract class Usuario {
    protected String nombre;
    protected String apellido;
    
    public Usuario(String n, String a){
        this.apellido=a;
        this.nombre=n;
    }
    
    public abstract boolean registrarse();
}
