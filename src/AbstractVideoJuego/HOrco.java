package AbstractVideoJuego;
public class HOrco extends PFaccion implements AFuria{
    public int vidao;
    public int danoo;
    public HOrco(int vidao,int danoo) {
        this.vidao = 200;
        this.danoo = 90;
    }
    @Override
    public void ataca() {
        System.out.println("El ataque hace un daño de "+danoo+" daño");
    }
    @Override
    public void construye() {
        System.out.println("Construye una choza");
    }  
    @Override
    public void vida() {
        System.out.println("vida del orco es: "+vidao);
    }
    @Override
    public void aumentaElDano() {
        danoo += 50;
        System.out.println("Aumenta su daño en: " + danoo);
    }
    @Override
    public String nombre() {
        return " Mogulkan ";      
    }   
}
