package Sons;

import java.io.IOException;
import java.io.InputStream;
import javazoom.Tocar;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class Som {
    
    private String music = "Sons/Erros/sound7.mp3";
    
    public boolean tocarSonBoo = false;
    public void tocar( final int son ) {  
        new Thread() {
            @Override
                public void run() { 
                    while ( tocarSonBoo == false ) { 
                        tocarSonBoo = true;  
                        try { 
                                                    
                            MouseEncima( son ); 
                        
                        } catch(Exception e) {}
                    }
                    tocarSonBoo = false;
                }
         }.start();  
    }
    
    public boolean tocarSonjogo = false;
    public void jogo( final String sonjogo ) {  
        try {                           
                        
                           music = "/Sons/jogo/" + sonjogo; 
                           Tocar.javazoom(music);
                        
                        } catch(Exception e) {}
          
    }
    
    public void MouseEncima( int son ) throws java.io.IOException {  
                
        switch ( son ) {         
            case 51: 
                
                try{ 
                    //System.out.println("Certo: "+Som.class.getResource("MouseEncima.wav").toURI().toURL().toString() );
                    music = "/Sons/MouseEncima.wav"; play(); 
                }catch(Exception e){
                    try {
                        //System.out.println("Erro: "+Som.class.getResource("MouseEncima.wav").toURI().toURL().toString() );
                    } catch (Exception ex) {}
                } 
                break;  
                
            case 52: music = "/Sons/whatsapp001.mp3"; Tocar.javazoom(music); break;    
            
            case 101: music = "/Sons/Acertos/sound1.mp3"; Tocar.javazoom(music); break;
            case 102: music = "/Sons/Acertos/sound2.mp3"; Tocar.javazoom(music); break;
            case 103: music = "/Sons/Acertos/sound3.mp3"; Tocar.javazoom(music); break;
            case 104: music = "/Sons/Acertos/sound4.mp3"; Tocar.javazoom(music); break; 
            case 105: music = "/Sons/Acertos/sound5.mp3"; Tocar.javazoom(music); break; 
            case 106: music = "/Sons/Acertos/sound6.mp3"; Tocar.javazoom(music); break;
            case 107: music = "/Sons/Acertos/sound7.mp3"; Tocar.javazoom(music); break;
            case 108: music = "/Sons/Acertos/sound8.mp3"; Tocar.javazoom(music); break;
            case 109: music = "/Sons/Acertos/sound9.mp3"; Tocar.javazoom(music); break; 
            case 110: music = "/Sons/Acertos/sound10.mp3"; Tocar.javazoom(music); break;
            case 111: music = "/Sons/Acertos/sound11.mp3"; Tocar.javazoom(music); break;
            case 112: music = "/Sons/Acertos/sound12.mp3"; Tocar.javazoom(music); break;
            case 113: music = "/Sons/Acertos/sound13.mp3"; Tocar.javazoom(music); break;
            case 114: music = "/Sons/Acertos/sound14.mp3"; Tocar.javazoom(music); break; 
            case 115: music = "/Sons/Acertos/sound15.mp3"; Tocar.javazoom(music); break; 
            case 116: music = "/Sons/Acertos/sound16.mp3"; Tocar.javazoom(music); break;
            case 117: music = "/Sons/Acertos/sound17.mp3"; Tocar.javazoom(music); break;
            case 118: music = "/Sons/Acertos/sound18.mp3"; Tocar.javazoom(music); break;
            case 119: music = "/Sons/Acertos/sound19.mp3"; Tocar.javazoom(music); break; 
            case 120: music = "/Sons/Acertos/sound20.mp3"; Tocar.javazoom(music); break;
            case 121: music = "/Sons/Acertos/sound21.mp3"; Tocar.javazoom(music); break;
            case 122: music = "/Sons/Acertos/sound22.mp3"; Tocar.javazoom(music); break;
            case 123: music = "/Sons/Acertos/sound23.mp3"; Tocar.javazoom(music); break;
            case 124: music = "/Sons/Acertos/sound24.mp3"; Tocar.javazoom(music); break; 
            case 125: music = "/Sons/Acertos/sound25.mp3"; Tocar.javazoom(music); break; 
            case 126: music = "/Sons/Acertos/sound26.mp3"; Tocar.javazoom(music); break;
            case 127: music = "/Sons/Acertos/sound27.mp3"; Tocar.javazoom(music); break;
            case 128: music = "/Sons/Acertos/sound28.mp3"; Tocar.javazoom(music); break;
            case 129: music = "/Sons/Acertos/sound29.mp3"; Tocar.javazoom(music); break; 
            case 130: music = "/Sons/Acertos/sound30.mp3"; Tocar.javazoom(music); break;
            case 131: music = "/Sons/Acertos/sound31.mp3"; Tocar.javazoom(music); break;
            case 132: music = "/Sons/Acertos/sound32.mp3"; Tocar.javazoom(music); break;
            case 133: music = "/Sons/Acertos/sound33.mp3"; Tocar.javazoom(music); break;
            case 134: music = "/Sons/Acertos/sound34.mp3"; Tocar.javazoom(music); break; 
            case 135: music = "/Sons/Acertos/sound35.mp3"; Tocar.javazoom(music); break; 
            case 136: music = "/Sons/Acertos/sound36.mp3"; Tocar.javazoom(music); break;
            case 137: music = "/Sons/Acertos/sound37.mp3"; Tocar.javazoom(music); break;
            case 138: music = "/Sons/Acertos/sound38.mp3"; Tocar.javazoom(music); break;
            case 139: music = "/Sons/Acertos/sound39.mp3"; Tocar.javazoom(music); break; 
            case 140: music = "/Sons/Acertos/sound40.mp3"; Tocar.javazoom(music); break; 
            case 141: music = "/Sons/Acertos/sound41.mp3"; Tocar.javazoom(music); break;
            case 142: music = "/Sons/Acertos/sound42.mp3"; Tocar.javazoom(music); break;
            case 143: music = "/Sons/Acertos/sound43.mp3"; Tocar.javazoom(music); break;
            case 144: music = "/Sons/Acertos/sound44.mp3"; Tocar.javazoom(music); break; 
            case 145: music = "/Sons/Acertos/sound45.mp3"; Tocar.javazoom(music); break; 
            case 146: music = "/Sons/Acertos/sound46.mp3"; Tocar.javazoom(music); break;
            case 147: music = "/Sons/Acertos/sound47.mp3"; Tocar.javazoom(music); break;
            case 148: music = "/Sons/Acertos/sound48.mp3"; Tocar.javazoom(music); break;
            case 149: music = "/Sons/Acertos/sound49.mp3"; Tocar.javazoom(music); break; 
            case 150: music = "/Sons/Acertos/sound50.mp3"; Tocar.javazoom(music); break;
            case 151: music = "/Sons/Acertos/sound51.mp3"; Tocar.javazoom(music); break;
            case 152: music = "/Sons/Acertos/sound52.mp3"; Tocar.javazoom(music); break;
            case 153: music = "/Sons/Acertos/sound53.mp3"; Tocar.javazoom(music); break;
            case 154: music = "/Sons/Acertos/sound54.mp3"; Tocar.javazoom(music); break; 
            case 155: music = "/Sons/Acertos/sound55.mp3"; Tocar.javazoom(music); break; 
            case 156: music = "/Sons/Acertos/sound56.mp3"; Tocar.javazoom(music); break;
            case 157: music = "/Sons/Acertos/sound57.mp3"; Tocar.javazoom(music); break;
            case 158: music = "/Sons/Acertos/sound58.mp3"; Tocar.javazoom(music); break;
            case 159: music = "/Sons/Acertos/sound59.mp3"; Tocar.javazoom(music); break; 
            case 160: music = "/Sons/Acertos/sound60.mp3"; Tocar.javazoom(music); break;
            case 161: music = "/Sons/Acertos/sound61.mp3"; Tocar.javazoom(music); break;
            case 162: music = "/Sons/Acertos/sound62.mp3"; Tocar.javazoom(music); break;
            case 163: music = "/Sons/Acertos/sound63.mp3"; Tocar.javazoom(music); break;
            case 164: music = "/Sons/Acertos/sound64.mp3"; Tocar.javazoom(music); break; 
            case 165: music = "/Sons/Acertos/sound65.mp3"; Tocar.javazoom(music); break; 
            case 166: music = "/Sons/Acertos/sound66.mp3"; Tocar.javazoom(music); break;
            case 167: music = "/Sons/Acertos/sound67.mp3"; Tocar.javazoom(music); break;
            case 168: music = "/Sons/Acertos/sound68.mp3"; Tocar.javazoom(music); break;
            case 169: music = "/Sons/Acertos/sound69.mp3"; Tocar.javazoom(music); break; 
            case 170: music = "/Sons/Acertos/sound70.mp3"; Tocar.javazoom(music); break;
            case 171: music = "/Sons/Acertos/sound71.mp3"; Tocar.javazoom(music); break;
            case 172: music = "/Sons/Acertos/sound72.mp3"; Tocar.javazoom(music); break;
            case 173: music = "/Sons/Acertos/sound73.mp3"; Tocar.javazoom(music); break;
            case 174: music = "/Sons/Acertos/sound74.mp3"; Tocar.javazoom(music); break; 
            case 175: music = "/Sons/Acertos/sound75.mp3"; Tocar.javazoom(music); break; 
            case 176: music = "/Sons/Acertos/sound76.mp3"; Tocar.javazoom(music); break;
            case 177: music = "/Sons/Acertos/sound77.mp3"; Tocar.javazoom(music); break;
            case 178: music = "/Sons/Acertos/sound78.mp3"; Tocar.javazoom(music); break;
            case 179: music = "/Sons/Acertos/sound79.mp3"; Tocar.javazoom(music); break; 
            case 180: music = "/Sons/Acertos/sound80.mp3"; Tocar.javazoom(music); break; 
            case 181: music = "/Sons/Acertos/sound81.mp3"; Tocar.javazoom(music); break;
            case 182: music = "/Sons/Acertos/sound82.mp3"; Tocar.javazoom(music); break;
            case 183: music = "/Sons/Acertos/sound83.mp3"; Tocar.javazoom(music); break;
            case 184: music = "/Sons/Acertos/sound84.mp3"; Tocar.javazoom(music); break; 
            case 185: music = "/Sons/Acertos/sound85.mp3"; Tocar.javazoom(music); break; 
            case 186: music = "/Sons/Acertos/sound86.mp3"; Tocar.javazoom(music); break;
            case 187: music = "/Sons/Acertos/sound87.mp3"; Tocar.javazoom(music); break;
            case 188: music = "/Sons/Acertos/sound88.mp3"; Tocar.javazoom(music); break;
            case 189: music = "/Sons/Acertos/sound89.mp3"; Tocar.javazoom(music); break; 
            case 190: music = "/Sons/Acertos/sound90.mp3"; Tocar.javazoom(music); break;
            case 191: music = "/Sons/Acertos/sound91.mp3"; Tocar.javazoom(music); break;
            case 192: music = "/Sons/Acertos/sound92.mp3"; Tocar.javazoom(music); break;
            case 193: music = "/Sons/Acertos/sound93.mp3"; Tocar.javazoom(music); break;
            case 194: music = "/Sons/Acertos/sound94.mp3"; Tocar.javazoom(music); break; 
            case 195: music = "/Sons/Acertos/sound95.mp3"; Tocar.javazoom(music); break; 
            case 196: music = "/Sons/Acertos/sound96.mp3"; Tocar.javazoom(music); break;
            case 197: music = "/Sons/Acertos/sound97.mp3"; Tocar.javazoom(music); break;
            case 198: music = "/Sons/Acertos/sound98.mp3"; Tocar.javazoom(music); break;
            case 199: music = "/Sons/Acertos/sound99.mp3"; Tocar.javazoom(music); break; 
            case 200: music = "/Sons/Acertos/sound100.mp3"; Tocar.javazoom(music); break;    
                
            case 201: music = "/Sons/Erros/sound1.mp3"; Tocar.javazoom(music); break;
            case 202: music = "/Sons/Erros/sound2.mp3"; Tocar.javazoom(music); break;
            case 203: music = "/Sons/Erros/sound3.mp3"; Tocar.javazoom(music); break;
            case 204: music = "/Sons/Erros/sound4.mp3"; Tocar.javazoom(music); break; 
            case 205: music = "/Sons/Erros/sound5.mp3"; Tocar.javazoom(music); break; 
            case 206: music = "/Sons/Erros/sound6.mp3"; Tocar.javazoom(music); break;
            case 207: music = "/Sons/Erros/sound7.mp3"; Tocar.javazoom(music); break;
            case 208: music = "/Sons/Erros/sound8.mp3"; Tocar.javazoom(music); break;
            case 209: music = "/Sons/Erros/sound9.mp3"; Tocar.javazoom(music); break; 
            case 210: music = "/Sons/Erros/sound10.mp3"; Tocar.javazoom(music); break;
            case 211: music = "/Sons/Erros/sound11.mp3"; Tocar.javazoom(music); break;
            case 212: music = "/Sons/Erros/sound12.mp3"; Tocar.javazoom(music); break;
            case 213: music = "/Sons/Erros/sound13.mp3"; Tocar.javazoom(music); break;
            case 214: music = "/Sons/Erros/sound14.mp3"; Tocar.javazoom(music); break; 
            case 215: music = "/Sons/Erros/sound15.mp3"; Tocar.javazoom(music); break; 
            case 216: music = "/Sons/Erros/sound16.mp3"; Tocar.javazoom(music); break;
            case 217: music = "/Sons/Erros/sound17.mp3"; Tocar.javazoom(music); break;
            case 218: music = "/Sons/Erros/sound18.mp3"; Tocar.javazoom(music); break;
            case 219: music = "/Sons/Erros/sound19.mp3"; Tocar.javazoom(music); break; 
            case 220: music = "/Sons/Erros/sound20.mp3"; Tocar.javazoom(music); break;
            case 221: music = "/Sons/Erros/sound21.mp3"; Tocar.javazoom(music); break;
            case 222: music = "/Sons/Erros/sound22.mp3"; Tocar.javazoom(music); break;
            case 223: music = "/Sons/Erros/sound23.mp3"; Tocar.javazoom(music); break;
            case 224: music = "/Sons/Erros/sound24.mp3"; Tocar.javazoom(music); break; 
            case 225: music = "/Sons/Erros/sound25.mp3"; Tocar.javazoom(music); break; 
            case 226: music = "/Sons/Erros/sound26.mp3"; Tocar.javazoom(music); break;
            case 227: music = "/Sons/Erros/sound27.mp3"; Tocar.javazoom(music); break;
            case 228: music = "/Sons/Erros/sound28.mp3"; Tocar.javazoom(music); break;
            case 229: music = "/Sons/Erros/sound29.mp3"; Tocar.javazoom(music); break; 
            case 230: music = "/Sons/Erros/sound30.mp3"; Tocar.javazoom(music); break;
            case 231: music = "/Sons/Erros/sound31.mp3"; Tocar.javazoom(music); break;
            case 232: music = "/Sons/Erros/sound32.mp3"; Tocar.javazoom(music); break;
            case 233: music = "/Sons/Erros/sound33.mp3"; Tocar.javazoom(music); break;
            case 234: music = "/Sons/Erros/sound34.mp3"; Tocar.javazoom(music); break; 
            case 235: music = "/Sons/Erros/sound35.mp3"; Tocar.javazoom(music); break; 
            case 236: music = "/Sons/Erros/sound36.mp3"; Tocar.javazoom(music); break;
            case 237: music = "/Sons/Erros/sound37.mp3"; Tocar.javazoom(music); break;
            case 238: music = "/Sons/Erros/sound38.mp3"; Tocar.javazoom(music); break;
            case 239: music = "/Sons/Erros/sound39.mp3"; Tocar.javazoom(music); break; 
            case 240: music = "/Sons/Erros/sound40.mp3"; Tocar.javazoom(music); break; 
            case 241: music = "/Sons/Erros/sound41.mp3"; Tocar.javazoom(music); break;
            case 242: music = "/Sons/Erros/sound42.mp3"; Tocar.javazoom(music); break;
            case 243: music = "/Sons/Erros/sound43.mp3"; Tocar.javazoom(music); break;
            case 244: music = "/Sons/Erros/sound44.mp3"; Tocar.javazoom(music); break; 
            case 245: music = "/Sons/Erros/sound45.mp3"; Tocar.javazoom(music); break; 
            case 246: music = "/Sons/Erros/sound46.mp3"; Tocar.javazoom(music); break;
            case 247: music = "/Sons/Erros/sound47.mp3"; Tocar.javazoom(music); break;
            case 248: music = "/Sons/Erros/sound48.mp3"; Tocar.javazoom(music); break;
            case 249: music = "/Sons/Erros/sound49.mp3"; Tocar.javazoom(music); break; 
            case 250: music = "/Sons/Erros/sound50.mp3"; Tocar.javazoom(music); break;
            case 251: music = "/Sons/Erros/sound51.mp3"; Tocar.javazoom(music); break;
            case 252: music = "/Sons/Erros/sound52.mp3"; Tocar.javazoom(music); break;
            case 253: music = "/Sons/Erros/sound53.mp3"; Tocar.javazoom(music); break;
            case 254: music = "/Sons/Erros/sound54.mp3"; Tocar.javazoom(music); break; 
            case 255: music = "/Sons/Erros/sound55.mp3"; Tocar.javazoom(music); break; 
            case 256: music = "/Sons/Erros/sound56.mp3"; Tocar.javazoom(music); break;
            case 257: music = "/Sons/Erros/sound57.mp3"; Tocar.javazoom(music); break;
            case 258: music = "/Sons/Erros/sound58.mp3"; Tocar.javazoom(music); break;
            case 259: music = "/Sons/Erros/sound59.mp3"; Tocar.javazoom(music); break; 
            case 260: music = "/Sons/Erros/sound60.mp3"; Tocar.javazoom(music); break;
            case 261: music = "/Sons/Erros/sound61.mp3"; Tocar.javazoom(music); break;
            case 262: music = "/Sons/Erros/sound62.mp3"; Tocar.javazoom(music); break;
            case 263: music = "/Sons/Erros/sound63.mp3"; Tocar.javazoom(music); break;
            case 264: music = "/Sons/Erros/sound64.mp3"; Tocar.javazoom(music); break; 
            case 265: music = "/Sons/Erros/sound65.mp3"; Tocar.javazoom(music); break; 
            case 266: music = "/Sons/Erros/sound66.mp3"; Tocar.javazoom(music); break;
            case 267: music = "/Sons/Erros/sound67.mp3"; Tocar.javazoom(music); break;
            case 268: music = "/Sons/Erros/sound68.mp3"; Tocar.javazoom(music); break;
            case 269: music = "/Sons/Erros/sound69.mp3"; Tocar.javazoom(music); break; 
            case 270: music = "/Sons/Erros/sound70.mp3"; Tocar.javazoom(music); break;
            case 271: music = "/Sons/Erros/sound71.mp3"; Tocar.javazoom(music); break;
            case 272: music = "/Sons/Erros/sound72.mp3"; Tocar.javazoom(music); break;
            case 273: music = "/Sons/Erros/sound73.mp3"; Tocar.javazoom(music); break;
            case 274: music = "/Sons/Erros/sound74.mp3"; Tocar.javazoom(music); break; 
            case 275: music = "/Sons/Erros/sound75.mp3"; Tocar.javazoom(music); break; 
            case 276: music = "/Sons/Erros/sound76.mp3"; Tocar.javazoom(music); break;
            case 277: music = "/Sons/Erros/sound77.mp3"; Tocar.javazoom(music); break;
            case 278: music = "/Sons/Erros/sound78.mp3"; Tocar.javazoom(music); break;
            case 279: music = "/Sons/Erros/sound79.mp3"; Tocar.javazoom(music); break; 
            case 280: music = "/Sons/Erros/sound80.mp3"; Tocar.javazoom(music); break; 
            case 281: music = "/Sons/Erros/sound81.mp3"; Tocar.javazoom(music); break;
            case 282: music = "/Sons/Erros/sound82.mp3"; Tocar.javazoom(music); break;
            case 283: music = "/Sons/Erros/sound83.mp3"; Tocar.javazoom(music); break;
            case 284: music = "/Sons/Erros/sound84.mp3"; Tocar.javazoom(music); break; 
            case 285: music = "/Sons/Erros/sound85.mp3"; Tocar.javazoom(music); break; 
            case 286: music = "/Sons/Erros/sound86.mp3"; Tocar.javazoom(music); break;
            case 287: music = "/Sons/Erros/sound87.mp3"; Tocar.javazoom(music); break;
            case 288: music = "/Sons/Erros/sound88.mp3"; Tocar.javazoom(music); break;
            case 289: music = "/Sons/Erros/sound89.mp3"; Tocar.javazoom(music); break; 
            case 290: music = "/Sons/Erros/sound90.mp3"; Tocar.javazoom(music); break;
            case 291: music = "/Sons/Erros/sound91.mp3"; Tocar.javazoom(music); break;
            case 292: music = "/Sons/Erros/sound92.mp3"; Tocar.javazoom(music); break;
            case 293: music = "/Sons/Erros/sound93.mp3"; Tocar.javazoom(music); break;
            case 294: music = "/Sons/Erros/sound94.mp3"; Tocar.javazoom(music); break; 
            case 295: music = "/Sons/Erros/sound95.mp3"; Tocar.javazoom(music); break; 
            case 296: music = "/Sons/Erros/sound96.mp3"; Tocar.javazoom(music); break;
            case 297: music = "/Sons/Erros/sound97.mp3"; Tocar.javazoom(music); break;
            case 298: music = "/Sons/Erros/sound98.mp3"; Tocar.javazoom(music); break;
            case 299: music = "/Sons/Erros/sound99.mp3"; Tocar.javazoom(music); break; 
            case 300: music = "/Sons/Erros/sound100.mp3"; Tocar.javazoom(music); break;     
        }              
    }

    public void play() {
        try {
            InputStream in = Som.class.getResourceAsStream( music );
            AudioStream as = new AudioStream(in);
            AudioPlayer.player.start(as); 

        } catch (IOException e) { }  
    }
        
    public static void main(String[] args) throws Exception { 
        Som s = new Som();
        for( int i = 101; i <= 200; i++ ){
            s.MouseEncima( i );
            System.out.println( "Tocando: " + i );
        }
    } 
    
}