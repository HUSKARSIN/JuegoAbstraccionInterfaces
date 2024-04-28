package AbstractVideoJuego;
public class HNoMuerto extends PFaccion implements ACome{
    public int vidan;
    public int danon;
    public HNoMuerto(int vidan,int danon) {
        this.vidan=75;
        this.danon = 30;
    }
    @Override
    public void ataca() {
        System.out.println("Realiza un ataque de "+danon+" daño");
    }
    @Override
    public void construye() {
        System.out.println("Invoca una estructura");
    }   
    @Override
    public void vida() {
        System.out.println("Vida del creep es:" + vidan);
    }
    @Override
    public void robaVida() {
        vidan += danon;
        System.out.println("Roba " + danon + " vida al enemigo. Vida del creep es: " + vidan);
    }
    @Override
    public String nombre() {
        return " Lich ";
    }
}
