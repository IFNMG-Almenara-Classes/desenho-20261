import javax.swing.*;
import java.awt.*;

public class Desenho extends JFrame {
    public Desenho() {
        this.setTitle("Meu Desenho");
        this.setSize(300, 300);
        this.setVisible(true);
    }

    public void paint(Graphics g) {
        new Circulo(new Ponto(100, 100), 50, Color.RED)
                .desenhar(g);

        new Circulo(new Ponto(50, 100), 30, Color.GREEN)
                .desenhar(g);

        new Retangulo(new Ponto(30, 150), 50, 100, Color.BLUE)
                .desenhar(g);
    }
}
