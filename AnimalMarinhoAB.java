public abstract class AnimalMarinhoAB extends AnimalAB{
    public AnimalMarinhoAB(String nome,  String tipoAnimal, String habitat, int idade, double altura, double peso) {
        super(nome, tipoAnimal, habitat, idade, altura, peso);
    }

    //metódo específico para animais marinhos
    public void nadar(double distancia){
        moverse(distancia);
    }
}
