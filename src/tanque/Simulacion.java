/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tanque;

import java.util.ArrayList;

/**
 *
 * @author Usuario-120
 */
public class Simulacion {
    ArrayList<Tiger> atiger = new ArrayList();
    ArrayList<T34> at34 = new ArrayList();
    
    public void casoUsoCrearTanques()
    {
        int cantTanques = Generador.generarNumeroIntAlAzarEntreMinYMax(5, 10);
        
        for (int i = 0; i <= cantTanques; i++){
            
            boolean cualTanque = Generador.generarBooleanAlAzar();
            
            int id = i;
            boolean vivo = true;
            int municion = Generador.generarNumeroIntAlAzarEntreMinYMax(1, 2);
            Tanque destruidoPor = null;
            
            
            if (cualTanque==true)
            {
                
                
                boolean aire = Generador.generarBooleanAlAzar();
                
                
              Tiger t = new Tiger(aire, id, vivo, municion, destruidoPor);
              this.atiger.add(t);
            }
            else
            {
              T34 t2 = new T34(id, vivo, municion, destruidoPor);
              this.at34.add(t2);
            }
        }
    }
    
    public void casoUsoSimular()
    {
        
        for (int i = 0; i < this.atiger.size(); i++) {
            
            Tiger ti = (atiger.get(i));
            
            if(ti.isVivo())
            {
                for (int j = 0; j < this.at34.size(); j++) {
                    T34 t34 = this.at34.get(j);
                    
                    if (t34.isVivo())
                    {
                        if (ti.getMunicion()>0)
                        {
                            ti.disparar(t34);
                        }
                    
                    }
                    
                }
            }
        }
        
    //tiger
    
        for (int i = 0; i < this.at34.size(); i++) {
            
            T34 t34 = at34.get(i);
            
            if(t34.isVivo())
            {
                for (int j = 0; j < this.atiger.size(); j++) {
                    Tiger ti = this.atiger.get(j);
                    
                    if (ti.isVivo())
                    {
                        if (t34.getMunicion()>0)
                        {
                            t34.disparar(ti);
                        }
                    
                    }
                    
                }
            }
        }
    
    }
    public void casoUsoImprimirTanques()
    {
        for (int i = 0; i < this.atiger.size(); i++) {
            System.out.println(this.atiger.get(i));
        }
        for (int j = 0; j < this.at34.size(); j++) {
            System.out.println(this.at34.get(j));
        }
    }
    
    public void casoUsoResumenTiger()
    {
        int vivo = 0;
        int muerto = 0;
        for (int i = 0; i < this.atiger.size(); i++) {
            if (this.atiger.get(i).isVivo())
            {
                vivo++;
            }
            else
            {
                muerto++;
            }
        }
        System.out.println("vivos"+ vivo + "muertos" + muerto);
    }
    
    public void casoUsoResumenT34()
    {
        {
        int vivo = 0;
        int muerto = 0;
        for (int i = 0; i < this.at34.size(); i++) {
            if (this.at34.get(i).isVivo())
            {
                vivo++;
            }
            else
            {
                muerto++;
            }
        }
        System.out.println("vivos"+ vivo + "muertos" + muerto);
        }
            

}
     public void simular()
    {
        this.casoUsoCrearTanques();
        this.casoUsoSimular();
        this.casoUsoImprimirTanques();
        this.casoUsoResumenT34();
        this.casoUsoResumenTiger();
    }
}
