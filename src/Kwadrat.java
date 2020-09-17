public class Kwadrat {
    private double bok;
    public Kwadrat(double bok){
        this.bok = bok;
    }
    public void show(){
        System.out.println("Pole "+ this.bok*this.bok);
        System.out.println("Sześcian "+ this.bok*this.bok*this.bok);
    }
}
