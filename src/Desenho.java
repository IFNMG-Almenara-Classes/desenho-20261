import javax.swing.*;
import java.awt.*;

public class Desenho extends JFrame {

    private Circulo circulo;
    private Retangulo retangulo;

    public Desenho() {
        this.setTitle("Meu Desenho");
        this.setSize(700, 700);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.circulo = new Circulo(new Ponto(100, 100), 50, Color.RED);
        this.retangulo = new Retangulo(new Ponto(170, 170), 100, 50, Color.BLUE);
    }

    public void paint(Graphics g) {
        super.paint(g);
        circulo.desenhar(g);
        retangulo.desenhar(g);
    }
}
