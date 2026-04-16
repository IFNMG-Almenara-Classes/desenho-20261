package desenho;

import java.awt.*;

public class Retangulo extends Forma {
    private int altura;
    private int largura;

    public Retangulo(Ponto ponto, int altura, int largura, Color cor) {
        super(ponto, cor);
        this.altura = altura;
        this.largura = largura;
    }

    public void desenhar(Graphics g) {
        g.setColor(this.getCor());
        g.fillRect(this.getPonto().getX(),
                this.getPonto().getY(),
                this.largura,
                this.altura);
    }
}
