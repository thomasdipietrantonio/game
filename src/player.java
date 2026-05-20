public class player extends Character {
    private boolean inAria = false;
    private int velocitaVerticale = 0;
    private final int GRAVITA = 1;

    public player(int x, int y) {
        // Passa i dati al costruttore del padre (Character)
        // Es: larghezza 50, altezza 50, velocita 5, salute 100
        super(x, y, 50, 50, 5, 100); 
    }

    @Override
    public void aggiorna() {
        // Qui gestite i movimenti con i tasti e la gravità
        // Esempio gravità base:
        if (inAria) {
            y += velocitaVerticale;
            velocitaVerticale += GRAVITA;
            // Se tocca il pavimento, resetta (es. a y = 400)
            if (y >= 400) {
                y = 400;
                inAria = false;
            }
        }
    }

    @Override
    public void disegna(java.awt.Graphics g) {
        g.setColor(java.awt.Color.BLUE); // Giocatore blu
        g.fillRect(x, y, larghezza, altezza);
    }
    
    public void salta() {
        if (!inAria) {
            velocitaVerticale = -15; // Spinta verso l'alto
            inAria = true;
        }
    }
}
