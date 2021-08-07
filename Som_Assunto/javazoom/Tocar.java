/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javazoom;

import Sons.Som;
import java.io.InputStream;

/**
 *
 * @author Mariana
 */
public class Tocar {
    
    public Tocar( String link ) {
    
    }
    
    public static void javazoom(String url) { System.out.println(url);
        try{  
            InputStream in = Som.class.getResourceAsStream( url );
            javazoom.jl.player.Player p = new javazoom.jl.player.Player(in);  
              
            p.play(); 
        }catch( Exception e){  
            /*
            JOptionPane.showMessageDialog( null,"Problema ao Tentar Executar o Son; \n" +
                    "Motivo: " + e.getMessage() ,"JMarySystems - Problemas Na Saída do Son", JOptionPane.ERROR_MESSAGE); 
            */
            System.out.println( "Problema ao Tentar Executar o Son; \n"+
                    "Motivo: " + e.getMessage() );
        }
    }
    
}

    
    
    

