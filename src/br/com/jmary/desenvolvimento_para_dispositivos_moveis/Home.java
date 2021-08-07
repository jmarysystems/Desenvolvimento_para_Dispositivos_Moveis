/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jmary.desenvolvimento_para_dispositivos_moveis;

//import unidade_04_desenvolvimento_de_aplicacoes_para_a_internet.Assunto.Assunto_Imagens;
//import unidade_04_desenvolvimento_de_aplicacoes_para_a_internet.Exercicios.Exercicios;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javazoom.Tocar;

/**
 *
 * @author AnaMariana
 */
public class Home extends javax.swing.JPanel {
    private static final long serialVersionUID = 1L;
    
    public JFrame frame;
    
    public Component Sub_Menu_Atual;
    
    public String resposta_Correta = "";
    
    /**
     * Creates new form PnHomeDesigner
     * @param frame2
     */
    public Home( JFrame frame2 ) {         
        initComponents();
        frame = frame2; 
        //frame.setTitle( "JMARYSYSTEMS - " + Bean_Usuario_Logado.LOGIN.toUpperCase() + " - Suporte: 85 9.9139.2441" );
        ((BasicInternalFrameUI)Home_Frame_Interno.getUI()).setNorthPane(null); //retirar o painel superior
        Home_Frame_Interno.setBorder( new EmptyBorder( 0, 0, 0, 0 ) );
         
        new Thread() {   @Override public void run() { try { //Thread.sleep( 1 );
            
            unidade_01 = "unidade_01_desenvolvimento_para_dispositivos_moveis"; 
            unidade_02 = "unidade_02_desenvolvimento_para_dispositivos_moveis";
            unidade_03 = "unidade_03_desenvolvimento_para_dispositivos_moveis";
            unidade_04 = "unidade_04_desenvolvimento_para_dispositivos_moveis";
            ////////////////////////////////////////////////////////////////////
            
            Classe_Assunto_Unidade_01 = 
                unidade_01_desenvolvimento_para_dispositivos_moveis.Assunto.Assunto_Imagens.class;
            Classe_Assunto_Unidade_02 = 
                unidade_02_desenvolvimento_para_dispositivos_moveis.Assunto.Assunto_Imagens.class;
            Classe_Assunto_Unidade_03 = 
                unidade_03_desenvolvimento_para_dispositivos_moveis.Assunto.Assunto_Imagens.class;
            Classe_Assunto_Unidade_04 = 
                unidade_04_desenvolvimento_para_dispositivos_moveis.Assunto.Assunto_Imagens.class;
            
            ////////////////////////////////////////////////////////////////////
            
            Classe_Exercicio_Unidade_01 = 
                unidade_01_desenvolvimento_para_dispositivos_moveis.Exercicios.Exercicios.class;
            Classe_Exercicio_Unidade_02 = 
                unidade_02_desenvolvimento_para_dispositivos_moveis.Exercicios.Exercicios.class;
            Classe_Exercicio_Unidade_03 = 
                unidade_03_desenvolvimento_para_dispositivos_moveis.Exercicios.Exercicios.class;
            Classe_Exercicio_Unidade_04 = 
                unidade_04_desenvolvimento_para_dispositivos_moveis.Exercicios.Exercicios.class;
            
            ////////////////////////////////////////////////////////////////////
            
            nome_do_pacote_endereco_Iterno_Do_Assunto = unidade_01; 
                
            inicio_Assuntos( nome_do_pacote_endereco_Iterno_Do_Assunto, Classe_Assunto_Unidade_01 );
            inicio_Exercicios( nome_do_pacote_endereco_Iterno_Do_Assunto, Classe_Exercicio_Unidade_01 );
            
        } catch( Exception e ){  } } }.start();        
    }
    
    //Alterar antes a declaração do pacote da classe
    String unidade_01 = ""; 
    String unidade_02 = "";
    String unidade_03 = "";
    String unidade_04 = "";
    String nome_do_pacote_endereco_Iterno_Do_Assunto = "";
    Class Classe_Assunto_Unidade_01 = null;
    Class Classe_Assunto_Unidade_02 = null;
    Class Classe_Assunto_Unidade_03 = null;
    Class Classe_Assunto_Unidade_04 = null;
    Class Classe_Exercicio_Unidade_01 = null;
    Class Classe_Exercicio_Unidade_02 = null;
    Class Classe_Exercicio_Unidade_03 = null;
    Class Classe_Exercicio_Unidade_04 = null;
    
    Visualizador_Externo_Assunto AssuntoX;
    private void inicio_Assuntos( String nome_do_pacote_recebido, Class Classe_Das_Imagens_Assunto ) {   
                
        /*new Thread() {   @Override public void run() {*/ try { //Thread.sleep( 1 );
                                    
            int img_Atual = 0;            
            Class Classe_Das_Imagens = Classe_Das_Imagens_Assunto; //Alterar antes a declaração do pacote da classe - Assunto_Imagens
            
            AssuntoX = new Visualizador_Externo_Assunto( tabAssunto, Classe_Das_Imagens, img_Atual, nome_do_pacote_recebido, 0, 0 );
                    
            //tabAssunto.removeTabAt( tabAssunto.getSelectedIndex() );
            tabAssunto.add( "0", AssuntoX );

        } catch( Exception e ){  } //} }.start();
        
        try {
            ////////////////////////////////////////////////////////////////////
            lb_Reiniciar.setVisible(false);
            jPanel4.setVisible(true);
            lbOk.setText( String.valueOf(0) );
            lbNok.setText( String.valueOf(0) );
            ////////////////////////////////////////////////////////////////////
        } catch( Exception e ){  }

    } 
                   
    Home HomeAtual = null;
    Visualizador_Externo_Exercicios ExerciciosX;
    private void inicio_Exercicios( String nome_do_pacote_recebido, Class Classe_Das_Imagens_Exercicios ) {                                      

        HomeAtual = this;
        
        /*new Thread() {   @Override public void run() {*/ try { //Thread.sleep( 1 );
            
            int img_Atual = 0;
            Class Classe_Das_Imagens = Classe_Das_Imagens_Exercicios; //Alterar antes a declaração do pacote da classe - Exercicios
            
            ExerciciosX = new Visualizador_Externo_Exercicios( HomeAtual, tabExercicios, Classe_Das_Imagens, img_Atual, nome_do_pacote_recebido, 0, 0 );
            
            //tabExercicios.removeTabAt( tabAssunto.getSelectedIndex() );
            tabExercicios.add( "0", ExerciciosX );

        } catch( Exception e ){  } //} }.start();
    } 

        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Home_Frame_Interno = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        tabAssunto = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lbOk = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lbNok = new javax.swing.JLabel();
        lbOk1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btResponder1 = new javax.swing.JButton();
        btResponder4 = new javax.swing.JButton();
        btResponder = new javax.swing.JButton();
        btResponder2 = new javax.swing.JButton();
        btResponder3 = new javax.swing.JButton();
        lb_Reiniciar = new javax.swing.JLabel();
        tabExercicios = new javax.swing.JTabbedPane();
        Home_Barra_Menu = new javax.swing.JMenuBar();
        menu_Ajuda = new javax.swing.JMenu();
        menu_Conteudo = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mi_Unidade_01 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mi_Unidade_02 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mi_Unidade_03 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mi_Unidade_04 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();

        Home_Frame_Interno.setBorder(null);
        Home_Frame_Interno.setVisible(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Desenvolvimento para Dispositivos Móveis");

        tabAssunto.setBackground(new java.awt.Color(255, 255, 255));
        tabAssunto.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.addTab("Assunto", tabAssunto);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        lbOk.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbOk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbOk.setText("0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbOk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbOk, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(0, 153, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ACERTOS");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(255, 0, 0));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ERROS");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));

        lbNok.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbNok.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNok.setText("0");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbNok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbNok)
        );

        lbOk1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbOk1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbOk1.setText("Exercícios");

        btResponder1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btResponder1.setText("B");
        btResponder1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btResponder1MousePressed(evt);
            }
        });

        btResponder4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btResponder4.setText("E");
        btResponder4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btResponder4MousePressed(evt);
            }
        });

        btResponder.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btResponder.setText("A");
        btResponder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btResponderMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btResponderMousePressed(evt);
            }
        });

        btResponder2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btResponder2.setText("C");
        btResponder2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btResponder2MousePressed(evt);
            }
        });

        btResponder3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btResponder3.setText("D");
        btResponder3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btResponder3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btResponder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btResponder1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btResponder2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btResponder3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btResponder4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btResponder)
                    .addComponent(btResponder1)
                    .addComponent(btResponder2)
                    .addComponent(btResponder3)
                    .addComponent(btResponder4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lb_Reiniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jmary/desenvolvimento_para_dispositivos_moveis/imagens_internas/mais.png"))); // NOI18N
        lb_Reiniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_Reiniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb_ReiniciarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_Reiniciar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbOk1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbOk1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(lb_Reiniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 4, Short.MAX_VALUE))
        );

        tabExercicios.setBackground(new java.awt.Color(255, 255, 255));
        tabExercicios.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabExercicios, javax.swing.GroupLayout.DEFAULT_SIZE, 1062, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabExercicios)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Exercícios", jPanel1);

        jScrollPane2.setViewportView(jTabbedPane1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
        );

        menu_Ajuda.setText("Ajuda");
        Home_Barra_Menu.add(menu_Ajuda);

        menu_Conteudo.setText("Conteúdo");
        menu_Conteudo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menu_ConteudoMousePressed(evt);
            }
        });
        menu_Conteudo.add(jSeparator1);

        mi_Unidade_01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jmary/desenvolvimento_para_dispositivos_moveis/imagens_internas/mais.png"))); // NOI18N
        mi_Unidade_01.setText("Unidade 01");
        mi_Unidade_01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mi_Unidade_01MousePressed(evt);
            }
        });
        menu_Conteudo.add(mi_Unidade_01);
        menu_Conteudo.add(jSeparator2);

        mi_Unidade_02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jmary/desenvolvimento_para_dispositivos_moveis/imagens_internas/mais.png"))); // NOI18N
        mi_Unidade_02.setText("Unidade 02");
        mi_Unidade_02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mi_Unidade_02MousePressed(evt);
            }
        });
        menu_Conteudo.add(mi_Unidade_02);
        menu_Conteudo.add(jSeparator3);

        mi_Unidade_03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jmary/desenvolvimento_para_dispositivos_moveis/imagens_internas/mais.png"))); // NOI18N
        mi_Unidade_03.setText("Unidade 03");
        mi_Unidade_03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mi_Unidade_03MousePressed(evt);
            }
        });
        menu_Conteudo.add(mi_Unidade_03);
        menu_Conteudo.add(jSeparator4);

        mi_Unidade_04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jmary/desenvolvimento_para_dispositivos_moveis/imagens_internas/mais.png"))); // NOI18N
        mi_Unidade_04.setText("Unidade 04");
        mi_Unidade_04.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mi_Unidade_04MousePressed(evt);
            }
        });
        menu_Conteudo.add(mi_Unidade_04);
        menu_Conteudo.add(jSeparator5);

        Home_Barra_Menu.add(menu_Conteudo);

        Home_Frame_Interno.setJMenuBar(Home_Barra_Menu);

        javax.swing.GroupLayout Home_Frame_InternoLayout = new javax.swing.GroupLayout(Home_Frame_Interno.getContentPane());
        Home_Frame_Interno.getContentPane().setLayout(Home_Frame_InternoLayout);
        Home_Frame_InternoLayout.setHorizontalGroup(
            Home_Frame_InternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Home_Frame_InternoLayout.setVerticalGroup(
            Home_Frame_InternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Home_Frame_InternoLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Home_Frame_Interno, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Home_Frame_Interno)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btResponder1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btResponder1MousePressed
        new Thread() {   @Override public void run() { try { //Thread.sleep( 1 );

            verificar_resposta("B");

        } catch( Exception e ){ } } }.start();
    }//GEN-LAST:event_btResponder1MousePressed

    private void btResponder4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btResponder4MousePressed
        new Thread() {   @Override public void run() { try { //Thread.sleep( 1 );

            verificar_resposta("E");

        } catch( Exception e ){ } } }.start();
    }//GEN-LAST:event_btResponder4MousePressed

    private void btResponderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btResponderMousePressed
        new Thread() {   @Override public void run() { try { //Thread.sleep( 1 );

            verificar_resposta("A");

        } catch( Exception e ){ } } }.start();
    }//GEN-LAST:event_btResponderMousePressed

    private void btResponder2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btResponder2MousePressed
        new Thread() {   @Override public void run() { try { //Thread.sleep( 1 );

            verificar_resposta("C");

        } catch( Exception e ){ } } }.start();
    }//GEN-LAST:event_btResponder2MousePressed

    private void btResponder3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btResponder3MousePressed
        new Thread() {   @Override public void run() { try { //Thread.sleep( 1 );

            verificar_resposta("D");

        } catch( Exception e ){ } } }.start();
    }//GEN-LAST:event_btResponder3MousePressed

    private void lb_ReiniciarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_ReiniciarMousePressed
        ExerciciosX.img_Atual = 0;
        jPanel4.setVisible(true);
        lb_Reiniciar.setVisible(false);
        ExerciciosX.setarImagemExterna(0);
        lbOk.setText( String.valueOf(0) );
        lbNok.setText( String.valueOf(0) );
    }//GEN-LAST:event_lb_ReiniciarMousePressed

    private void btResponderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btResponderMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btResponderMouseExited

    private void menu_ConteudoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_ConteudoMousePressed
        
    }//GEN-LAST:event_menu_ConteudoMousePressed

    private void mi_Unidade_01MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mi_Unidade_01MousePressed
        new Thread() {   @Override public void run() { try { //Thread.sleep( 1 );
           
            if ( Classe_Assunto_Unidade_01 != null ){  
                
                while ( tabAssunto.getTabCount() > 0 ){ tabAssunto.removeTabAt(0); }              
                while ( tabExercicios.getTabCount() > 0 ){ tabExercicios.removeTabAt(0); }  
            
                nome_do_pacote_endereco_Iterno_Do_Assunto = unidade_01;
                
                inicio_Assuntos(   nome_do_pacote_endereco_Iterno_Do_Assunto, Classe_Assunto_Unidade_01 );
                inicio_Exercicios( nome_do_pacote_endereco_Iterno_Do_Assunto, Classe_Exercicio_Unidade_01 );
            }                      
        } catch( Exception e ){  } } }.start();
    }//GEN-LAST:event_mi_Unidade_01MousePressed

    private void mi_Unidade_02MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mi_Unidade_02MousePressed
        new Thread() {   @Override public void run() { try { //Thread.sleep( 1 );
            
            if ( Classe_Assunto_Unidade_02 != null ){  
                
                while ( tabAssunto.getTabCount() > 0 ){ tabAssunto.removeTabAt(0); }               
                while ( tabExercicios.getTabCount() > 0 ){ tabExercicios.removeTabAt(0); }  
            
                nome_do_pacote_endereco_Iterno_Do_Assunto = unidade_02;
                        
                inicio_Assuntos(   nome_do_pacote_endereco_Iterno_Do_Assunto, Classe_Assunto_Unidade_02 );
                inicio_Exercicios( nome_do_pacote_endereco_Iterno_Do_Assunto, Classe_Exercicio_Unidade_02 );
            }                          
        } catch( Exception e ){  } } }.start();
    }//GEN-LAST:event_mi_Unidade_02MousePressed

    private void mi_Unidade_03MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mi_Unidade_03MousePressed
        new Thread() {   @Override public void run() { try { //Thread.sleep( 1 );
            
            if ( Classe_Assunto_Unidade_03 != null ){ 
                
                while ( tabAssunto.getTabCount() > 0 ){ tabAssunto.removeTabAt(0); }                
                while ( tabExercicios.getTabCount() > 0 ){ tabExercicios.removeTabAt(0); }  
            
                nome_do_pacote_endereco_Iterno_Do_Assunto = unidade_03;
                        
                inicio_Assuntos(   nome_do_pacote_endereco_Iterno_Do_Assunto, Classe_Assunto_Unidade_03 );
                inicio_Exercicios( nome_do_pacote_endereco_Iterno_Do_Assunto, Classe_Exercicio_Unidade_03 );
            }                           
        } catch( Exception e ){  } } }.start();
    }//GEN-LAST:event_mi_Unidade_03MousePressed

    private void mi_Unidade_04MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mi_Unidade_04MousePressed
        new Thread() {   @Override public void run() { try { //Thread.sleep( 1 );
            
            if ( Classe_Assunto_Unidade_04 != null ){ 
                
                while ( tabAssunto.getTabCount() > 0 ){ tabAssunto.removeTabAt(0); }                
                while ( tabExercicios.getTabCount() > 0 ){ tabExercicios.removeTabAt(0); }  
            
                nome_do_pacote_endereco_Iterno_Do_Assunto = unidade_04;
                        
                inicio_Assuntos(   nome_do_pacote_endereco_Iterno_Do_Assunto, Classe_Assunto_Unidade_04 );
                inicio_Exercicios( nome_do_pacote_endereco_Iterno_Do_Assunto, Classe_Exercicio_Unidade_04 );
                 
            }            
        } catch( Exception e ){  } } }.start();
    }//GEN-LAST:event_mi_Unidade_04MousePressed
      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Home_Barra_Menu;
    public javax.swing.JInternalFrame Home_Frame_Interno;
    private javax.swing.JButton btResponder;
    private javax.swing.JButton btResponder1;
    private javax.swing.JButton btResponder2;
    private javax.swing.JButton btResponder3;
    private javax.swing.JButton btResponder4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbNok;
    private javax.swing.JLabel lbOk;
    public javax.swing.JLabel lbOk1;
    public javax.swing.JLabel lb_Reiniciar;
    private javax.swing.JMenu menu_Ajuda;
    private javax.swing.JMenu menu_Conteudo;
    private javax.swing.JMenuItem mi_Unidade_01;
    private javax.swing.JMenuItem mi_Unidade_02;
    private javax.swing.JMenuItem mi_Unidade_03;
    private javax.swing.JMenuItem mi_Unidade_04;
    public javax.swing.JTabbedPane tabAssunto;
    public javax.swing.JTabbedPane tabExercicios;
    // End of variables declaration//GEN-END:variables
    
    private void verificar_resposta(String resposta_do_usuario){
        
        /*new Thread() {   @Override public void run() {*/ try { //Thread.sleep( 1 ); 
            
            jPanel4.setVisible(false);
            
            if( resposta_Correta.trim().equalsIgnoreCase( resposta_do_usuario.trim() ) ){
                
                adicionar_Acerto();
                
                //jLabel1.setVisible(true);
                lbOk1.setText( "Resposta Correta: " + resposta_do_usuario + " - Parabéns"  );
                
                new Thread() {   @Override public void run() { try { //Thread.sleep( 1 ); 
                    Tocar.javazoom( "/Sons/acerto.mp3" );
                } catch( Exception e ){ } } }.start();
            }
            else {
                
                adicionar_Erro();
                
                //jLabel1.setVisible(true);
                lbOk1.setText( "Resposta Incorreta: " + resposta_do_usuario + " - A correta é a: " + resposta_Correta );
                                 
                new Thread() {   @Override public void run() { try { //Thread.sleep( 1 ); 
                    Tocar.javazoom( "/Sons/erro.mp3" );
                } catch( Exception e ){ } } }.start();
            }            
            
        } catch( Exception e ){ } //} }.start();
    }
    
    public void adicionar_Acerto(){
        
        new Thread() {   @Override public void run() { try {
            
            int a = Integer.parseInt( lbOk.getText().trim() ) + 1;
            
            lbOk.setText( String.valueOf(a) );
                        
        } catch( Exception e ){ } } }.start();
    }
    
    public void adicionar_Erro(){
        
        new Thread() {   @Override public void run() { try {
            
            int e = Integer.parseInt( lbNok.getText().trim() ) + 1;
            
            lbNok.setText( String.valueOf(e) );
                        
        } catch( Exception e ){ } } }.start();
    }
    
}