public class Balon {
    double pojemnoscBalona;
    double udzwigBalona;
    public Balon(){
        this.pojemnoscBalona = (Math.random() * ((0.009 - 0.005) + 1)) + 0.005;
    }
    public void podajUdzwig(){ this.udzwigBalona = (this.pojemnoscBalona*6)/0.007;
    System.out.println(udzwigBalona);
    }
}
