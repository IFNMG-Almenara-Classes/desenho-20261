package desenho;

import javax.swing.*;
import java.awt.*;

public class Desenho extends JFrame {

    private Circulo circulo;
    private Retangulo retangulo;

    private Forma[] formas;

    public Desenho() {
        this.setTitle("Meu desenho.Desenho");
        this.setSize(700, 700);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        formas = new Forma[4];

        formas[0] = new Circulo(new Ponto(100, 100), 50, Color.RED);
        formas[1] = new Retangulo(new Ponto(170, 170), 100, 50, Color.BLUE);
        formas[2] = new Quadrado(new Ponto(270, 50), 100,  Color.MAGENTA);
        formas[3] = new Retangulo(new Ponto(20, 370), 100, 50, Color.BLACK);


    }

    public void paint(Graphics g) {
        super.paint(g);
        for(Forma f: formas){
            f.desenhar(g);
        }
    }
}
