package cat.boscdelacoma.parc;

public class Dinosaure {
    private int edat;
    private double altura;
    private int pes;
    private String nom;

    public Dinosaure(int edat, double altura, int pes, String nom) {
        this.edat = edat;
        this.altura = altura;
        this.pes = pes;
        this.nom = nom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getPes() {
        return pes;
    }

    public void setPes(int pes) {
        this.pes = pes;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
