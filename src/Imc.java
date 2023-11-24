/*******************************************
 * Completez le programme a partir d'ici.
 *******************************************/
class Patient{
    private double hauteur;
    private double  masse;
    public void init(double h, double m){
        if(h>0 && m>0){
            hauteur=h;
            masse=m;
        }
        else {
            hauteur=0;
            masse=0;
        }
    }
    public void afficher(){
        System.out.printf("Patient : %.1f kg pour %.1f  m",masse,hauteur);
    }
    public double poids(){
        return this.masse;
    }
    public double taille(){
        return this.hauteur;
    }
    public double imc(){
        if (hauteur==0) return 0;
        return this.masse/Math.pow(this.hauteur, 2);
    }

}

/*******************************************
 * Ne rien modifier apres cette ligne.
 *******************************************/
class Imc {
    public static void main(String[] args) {

        Patient quidam = new Patient();
        quidam.init(74.5, 1.75);
        quidam.afficher();
        System.out.println("IMC : " + quidam.imc());
        quidam.init( -2.0, 4.5);
        quidam.afficher();
    }
}