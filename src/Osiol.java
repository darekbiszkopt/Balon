public class Osiol {
    private double masa;
    private  Balon [] tab = new Balon [1000];
    int indeks;
    double iloscHelu;
    public void dodajBalon(Balon balon){
        this.tab[this.indeks] = balon;
        this.indeks++;
    }
    public boolean czyLata(){
        for (int i = 0; i < this.tab.length; i++) {
            this.iloscHelu += this.tab[i].pojemnoscBalona;
        }
        double udzwigHelu = (this.iloscHelu*6)/0.007;
        if(udzwigHelu >= this.masa*1000){
            System.out.println("Ja latam!!!");
            return true;
        }
        return false;
    }
}
