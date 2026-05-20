public abstract class Characters {
    // Attributi comuni a tutti i personaggi
    protected int x, y;
    protected int larghezza, altezza;
    protected int velocita;
    protected int salute;

    // Costruttore per inizializzare le variabili comuni
    public Characters(int x, int y, int larghezza, int altezza, int velocita, int salute) {
        this.x = x;
        this.y = y;
        this.larghezza = larghezza;
        this.altezza = altezza;
        this.velocita = velocita;
        this.salute = salute;
    }

    // Metodo comune: subire danno
    public void subisciDanno(int danno) {
        this.salute -= danno;
        if (this.salute < 0) this.salute = 0;
    }

    // Metodi astratti: OGNI personaggio si muove e si disegna in modo diverso,
    // quindi costringiamo le classi figlie a definire QUESTI metodi.
    public abstract void aggiorna();
    public abstract void disegna(java.awt.Graphics g); // o la libreria del prof
    
    // Getter utili per le collisioni (Hitbox)
    public java.awt.Rectangle getBounds() {
        return new java.awt.Rectangle(x, y, larghezza, altezza);
    }
}



