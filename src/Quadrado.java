import java.awt.*;

public class Quadrado extends Forma {
    private int lado;

    public Quadrado(Ponto ponto, int lado, Color cor) {
        super(ponto, cor);
        this.lado = lado;
    }

    public void desenhar(Graphics g) {
        g.setColor(this.getCor());
        g.fillRect(this.getPonto().getX(),
                this.getPonto().getY(),
                this.lado,
                this.lado);
    }
}
