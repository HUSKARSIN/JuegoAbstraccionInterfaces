package AbstractVideoJuego;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {   
        Scanner scanner = new Scanner(System.in);
        HNoMuerto muerto = new HNoMuerto(75,30);
        HOrco orco = new HOrco(200,90);
        HHumano humano = new HHumano(100,40);
        System.out.println("Elige una Raza: ");
        System.out.println("1. No Muerto");
        System.out.println("2. Orco");
        System.out.println("3. Humano");
        System.out.println("4. Salir");
        int opcion = scanner.nextInt();
        //int optionZerg = scanner.nextInt();
        //Primer option1 permite elegir las razas
        switch (opcion) {
            // NoMuerto
            case 1:
            int opcionNM = 0;
            while (opcionNM != 6) {
            System.out.println("Elegiste a los 'No Muertos'");
            System.out.println("1. Atacar");
            System.out.println("2. Construir");
            System.out.println("3. Roba vida");
            System.out.println("4. Ver vida");
            System.out.println("5. nombre");
            System.out.println("6. Salir: ");
            opcionNM = scanner.nextInt(); 
            switch(opcionNM){                      
                case 1:
                    muerto.ataca();
                    break;
                case 2:
                    muerto.construye();
                    break;
                case 3:
                    muerto.robaVida();
                    break;
                case 4:
                    muerto.vida();
                    break;
                case 5:
                    System.out.println(muerto.nombre());
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;    
            }
        }
        break;
        // Orco
        case 2:
            int opcionO = 0;
            while (opcionO != 6) {
            System.out.println("Elegiste a los 'Orcos'");
            System.out.println("1. Atacar");
            System.out.println("2. Construir");
            System.out.println("3. Aumentar el daño");
            System.out.println("4. Ver vida");
            System.out.println("5. nombre");
            System.out.println("6. Salir: ");
            
            opcionO = scanner.nextInt();
            
            switch(opcionO){                      
                case 1:
                    orco.ataca();
                    break;
                case 2:
                    orco.construye();
                    break;
                case 3:
                    orco.aumentaElDano();
                    break;
                case 4:
                    orco.vida();
                    break;
                case 5:
                    System.out.println(orco.nombre());
                    break;
                    
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }
        break;
        // HUMANO
        case 3:
            int opcionH = 0;
            while (opcionH != 6) {
            System.out.println("Elegiste a los 'Humanos'");
            System.out.println("1. Atacar");
            System.out.println("2. Construir");
            System.out.println("3. Usa su escudo");
            System.out.println("4. Ver vida");
            System.out.println("5. nombre");
            System.out.println("6. Salir: ");
            opcionH = scanner.nextInt();
            switch(opcionH){                      
                case 1:
                    humano.ataca();
                    break;
                case 2:
                    humano.construye();
                    break;
                case 3:
                    humano.protege();
                    break;
                case 4:
                    humano.vida();
                    break;
                case 5:
                    System.out.println(humano.nombre());
                    break;    
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }
        break;
        }
        scanner.close();   
    }
}
