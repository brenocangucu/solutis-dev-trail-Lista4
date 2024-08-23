//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro("Dogão da massa", "Cachorro", "casa", 10, -1.0, -1.0, -4);
        Leao leo = new Leao("Simba", "Mamífero", "selva", 5,  -1.5, -50, -4);
        System.out.println(dog);
        System.out.println();
        System.out.println(leo);

        System.out.println();
        Pombo pombo = new Pombo("Richarlison", "Pombo", "Tottenham", -10, -1.5, -50, -2, -5 , -5.5);
        pombo.setAltura(-50);
        pombo.voar(-50);
        pombo.dormir(-50);
        pombo.comer(-4);
        System.out.println(pombo);

        System.out.println();

        Peixe peixe = new Peixe("Tubarao", "Animalia", "Profundezas do oceano", 10, 25, 100);
        peixe.nadar(-5000);
        peixe.comer(-100000);
        peixe.dormir(-1);
        System.out.println(peixe);
    }
}