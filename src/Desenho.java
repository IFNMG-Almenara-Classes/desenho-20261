import javax.swing.*;
import java.awt.*;

public class Desenho extends JFrame {

    private Circulo circulo;

    public Desenho() {
        this.setTitle("Meu Desenho");
        this.setSize(700, 700);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.circulo = new Circulo(new Ponto(100, 100), 50, Color.RED);

        new Thread(() -> {
            while (true) {
                mover();
                repaint();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }).start();
    }

    private void mover(){
        this.circulo.mover(10,0);
        if(this.circulo.getPonto().getX() > this.getWidth()){
            this.circulo.mover(-this.getWidth(),0);
        }
    }
    public void paint(Graphics g) {
        super.paint(g);
        circulo.desenhar(g);
    }
}
