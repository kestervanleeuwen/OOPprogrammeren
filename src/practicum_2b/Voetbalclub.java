package practicum_2b;

public class Voetbalclub {
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;
    private String naam;

    public Voetbalclub(String nm) {
        this.naam = nm;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }

    public int aantalGespeeld() {
        return aantalGelijk + aantalGewonnen + aantalVerloren;
    }

    public int aantalPunten() {
        return (aantalGewonnen * 3) + aantalGelijk;
    }

    public String toString() {
        return naam + "  " + aantalPunten();

    }
}
