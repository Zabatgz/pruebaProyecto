/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tanque;
   import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author Usuario-120
 */
public class Generador {
  
 public static int generarNumeroIntAlAzarEntreMinYMax(int min, int max)
{
 return ThreadLocalRandom.current().nextInt(min, max);
}

public static boolean generarBooleanAlAzar()
{
 return generarNumeroIntAlAzarEntreMinYMax(0,10000)<5000;
} 

    
}
