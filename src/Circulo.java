import java.awt.*;

public class Circulo {
    private Ponto ponto;
    private int raio;
    private Color cor;

    public Circulo(Ponto ponto, int raio, Color cor) {
        this.ponto = ponto;
        this.raio = raio;
        this.cor = cor;
    }

    public Circulo(int x, int y, int raio, Color cor) {
        this(new Ponto(x,y), raio, cor);
    }

    public Ponto getPonto() {
        return ponto;
    }

    public int getRaio() {
        return raio;
    }

    public Color getCor() {
        return cor;
    }

    public void desenhar(Graphics g) {
        g.setColor(this.cor);
        g.fillOval(this.ponto.getX(),
                this.ponto.getY(),
                this.raio*2,
                this.raio*2);
    }
}
