package desenho;

import java.awt.*;

public class Circulo extends Forma {
    private int raio;

    public Circulo(Ponto ponto, int raio, Color cor) {
        super(ponto, cor);
        this.raio = raio;
    }

    public Circulo(int x, int y, int raio, Color cor) {
        this(new Ponto(x,y), raio, cor);
    }

    public int getRaio() {
        return raio;
    }

    public void desenhar(Graphics g) {
        g.setColor(this.getCor());
        g.fillOval(this.getPonto().getX(),
                this.getPonto().getY(),
                this.raio*2,
                this.raio*2);
    }

    public void mover(int dx, int dy) {
        System.out.println("O círculo foi movido!");
        this.getPonto().mover(dx, dy);
    }
}
