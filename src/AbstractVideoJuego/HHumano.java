package AbstractVideoJuego;
public class HHumano extends PFaccion implements AArmadura{
    public int vidah;
    public int danoh;
    public HHumano(int vidah,int danoh) {
        this.vidah = 100;
        this.danoh = 40;
    }
    @Override
    public void ataca() {
        System.out.println("Inflinge "+danoh+" de daño al enemigo ");
    }
    @Override
    public void construye() {
        System.out.println("Construye una estructura");
    }   
    @Override
    public void vida() {
        System.out.println("vida del soldado es: "+vidah);
    }
    @Override
    public void protege() {
        vidah += vidah / 2;
        System.out.println((vidah / 2) + "La Vida del soldado ahora es: " + vidah);
    }
    @Override
    public String nombre() {
        return " Arthas ";
    }  
}
