import java.awt.*;

public class Forma {
    private Ponto ponto;
    private Color cor;

    public Forma(Ponto ponto, Color cor) {
        this.ponto = ponto;
        this.cor = cor;
    }

    public void mover(int dx, int dy) {
        this.ponto.mover(dx, dy);
    }
    public Ponto getPonto() { return ponto; }
    public Color getCor() { return cor; }
}
