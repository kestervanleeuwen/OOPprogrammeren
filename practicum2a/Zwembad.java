package practicum2a;

public class Zwembad {
    private double breedte;
    private double lengte;
    private double diepte;

    public Zwembad(double breedte, double lengte, double diepte) {
        this.breedte = breedte;
        this.lengte = lengte;
        this.diepte = diepte;
    }

    public Zwembad() {

    }

    public void setBreedte(double breedte) {
        this.breedte = breedte;
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public void setDiepte(double diepte) {
        this.diepte = diepte;
    }

    public double getBreedte() {
        return this.breedte;
    }

    public double getLengte() {
        return this.lengte;
    }

    public double getDiepte() {
        return this.diepte;
    }

    public double inhoud() {
        return this.breedte * this.lengte * this.diepte;
    }

    public String toString() {
        return "Dit zwembad is " + this.breedte + " meter breed, " + this.lengte + " meter lang, en " + this.diepte + " meter diep";
    }
}
