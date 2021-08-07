
package br.com.jmary.desenvolvimento_para_dispositivos_moveis;

import br.com.jmary.desenvolvimento_para_dispositivos_moveis.imagens_internas.Imagens_Internas;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JRootPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import java.io.IOException;

public class HomeJApplet extends JApplet {
    static JFrame frame;

    Home Home;
      
    @Override
    public void init() {

        Home = new Home( frame );
        
        add( Home ); //  BorderLayout.CENTER
        
        /*
        Home.adicionar_Menu(new Menu_1_JM_Home( Home ).Barra_Menu );
        Home.adicionar_SubMenu(new Submenu_1_JM_Home( Home ) );
        Home.adicionar_Tela_De_Trabalho( "Login no Sistema", new Login_Do_Sistema(Home) );
        */
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
                } catch (Exception e) {}
                
                frame = new JFrame( "JMARYSYSTEMS - Suporte: 85 9.8193.1133", null );                
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JApplet applet = new HomeJApplet();
        applet.init();
                
        frame.setContentPane( applet.getContentPane() );
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setIconImage(null);
                
        iconeDoPrograma( frame );
        telaCheia ( frame );

        applet.start();
            }
        });
    }
    
    public static void iniciarJFrame(){
        main(new String [2]);
    }
    
    private static void telaCheia( JFrame frame ) {
        try{ frame.setUndecorated(true);                                    } catch( Exception e ){}
        try{ frame.getRootPane().setWindowDecorationStyle(JRootPane.FRAME); } catch( Exception e ){}
        try{ frame.setExtendedState(JFrame.MAXIMIZED_BOTH);                 } catch( Exception e ){}
    }
    
    /* Início Setando O Ícone do Programa  */
    private static void iconeDoPrograma( JFrame frame ) {     
        try{ 
            //BufferedImage bufImg = ImageIO.read(Imagens_Internas.class.getResource("jmol.png") );  
            BufferedImage bufImg = ImageIO.read(Imagens_Internas.class.getResource("jm_icon.png") );  
                        
            frame.setIconImage( bufImg ); //bi
        }catch( IOException e ){}      
    }
    /* Fim Setando O Ícone do Programa  */

}
