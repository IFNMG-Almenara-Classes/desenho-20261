import java.awt.*;

public class Retangulo {
    private Ponto ponto;
    private int altura;
    private int largura;
    private Color cor;

    public Retangulo(Ponto ponto, int altura, int largura, Color cor) {
        this.ponto = ponto;
        this.altura = altura;
        this.largura = largura;
        this.cor = cor;
    }

    public void desenhar(Graphics g) {
        g.setColor(this.cor);
        g.fillRect(this.ponto.getX(),
                this.ponto.getY(),
                this.largura,
                this.altura);
    }
}
