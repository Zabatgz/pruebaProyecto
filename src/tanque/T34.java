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
public class T34 extends Tanque{

    public T34(int id, boolean vivo, int municion, Tanque destruidoPor) {
        super(id, vivo, municion, destruidoPor);
    }

    @Override
    public String toString() {
        return "T34{" + super.toString()+ '}';
    }

    
    
    
    @Override
    public void disparar(Tanque enemigo) {
        int d = Generador.generarNumeroIntAlAzarEntreMinYMax(1, 3);
        if (d==1)
        {
            enemigo.setVivo(false);
            enemigo.setDestruidoPor(this);
        }
        
        if(d==2)
        {
                System.out.println("Falle disparo");
        }
        if (d==3)
        {
                System.out.println("Fallo Mecanismo");
        }
        this.setMunicion(this.getMunicion()-1);
    }
    
    
}
