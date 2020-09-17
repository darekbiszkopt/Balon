public class Wyraz {
    char [] tablica;
    int indeks;

    public Wyraz(){
        this.tablica = new char[100];
    }
    public void dodajZnak(char znak){
        this.tablica[indeks] = znak;
        this.indeks++;
    }
    public void wyswietl(){
        for (int i = 0; i < this.indeks; i++) {
            System.out.print(this.tablica[i] + " ");
        }
    }
    public int length(){
        return this.indeks;
    }
}
