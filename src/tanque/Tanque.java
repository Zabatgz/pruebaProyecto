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
public abstract class Tanque implements iDisparable{
    protected int id;
    protected boolean vivo;
    protected int municion;
    protected Tanque destruidoPor;

    public Tanque() {
    }

    public Tanque(int id, boolean vivo, int municion, Tanque destruidoPor) {
        this.id = id;
        this.vivo = vivo;
        this.municion = municion;
        this.destruidoPor = destruidoPor;
    }

    public Tanque getDestruidoPor() {
        return destruidoPor;
    }

    public void setDestruidoPor(Tanque destruidoPor) {
        this.destruidoPor = destruidoPor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public int getMunicion() {
        return municion;
    }

    public void setMunicion(int municion) {
        this.municion = municion;
    }

    @Override
    public String toString() {
        return "Tanque{" + "id=" + id + ", vivo=" + vivo + ", municion=" + municion + ", destruidoPor=" + destruidoPor + '}';
    }
    
    
    
}
