package boletin10.pkg02;

import javax.swing.JOptionPane;

public class JuegoRandom {
    int valorA;
    
    public JuegoRandom(){
        valorA = (int) (Math.random()*51);
    }
    /**
     * Descripcion Metodo del juego
     * 
     */
    public void xogo(){
        int contador = 0;
        int dato = -1;
        JOptionPane.showMessageDialog(null, "Esta a xogar contra o ordenador, adiviñe o numero xenerado aleatoriamente entre 0 e 50");
        while(dato != valorA){
            dato = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un valor"));
            int diferencia = (dato-valorA);
            if(diferencia<0){
                diferencia = (-1*diferencia);
            }
            
            if(diferencia>20){
                JOptionPane.showMessageDialog(null, "O numero está moi lonxe, volva a intentalo");
                contador++;
            }else{
                if(diferencia>=10){
                    JOptionPane.showMessageDialog(null, "O numero está lonxe, volva a intentalo");
                    contador++;
                }else{
                    if(diferencia>5){
                        JOptionPane.showMessageDialog(null, "O numero está preto, volva a intentalo");
                        contador++;
                    }else{
                        if(diferencia<=5 && diferencia>0){
                            JOptionPane.showMessageDialog(null, "O numero está moi preto, volva a intentalo");
                            contador++;
                        }else{
                            contador++;
                            JOptionPane.showMessageDialog(null, "Felicidades!! atopaches o numero a buscar en " + contador + " intentos");
                        }
                    }
                }
            }
        }
    }
}
