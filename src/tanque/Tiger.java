/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tanque;

/**
 *
 * @author Usuario-120
 */
public class Tiger extends Tanque{
    boolean tieneAireCondicionado;

    public Tiger() {
    }


    public Tiger(boolean tieneAireCondicionado, int id, boolean vivo, int municion, Tanque destruidoPor) {
        super(id, vivo, municion, destruidoPor);
        this.tieneAireCondicionado = tieneAireCondicionado;
    }

    public boolean isTieneAireCondicionado() {
        return tieneAireCondicionado;
    }

    public void setTieneAireCondicionado(boolean tieneAireCondicionado) {
        this.tieneAireCondicionado = tieneAireCondicionado;
    }

    @Override
    public String toString() {
        return "Tiger{" + "tieneAireCondicionado=" + tieneAireCondicionado + super.toString()+'}';
    }

    @Override
    public void disparar(Tanque enemigo) {
       if (Generador.generarBooleanAlAzar())
       {
           enemigo.setVivo(false);
           enemigo.setDestruidoPor(this);
       }
       else
       {
          //SP
       }
       this.setMunicion(this.getMunicion()-1);
    }
    
    
    
    
    
}
