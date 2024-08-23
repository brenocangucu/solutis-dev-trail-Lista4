public abstract class AnimalTerrestreAB extends AnimalAB {
    //atributo específicos para animais terrestres
    int quantidadeDePatas;


    //construtor para Animais Terrestres
    public AnimalTerrestreAB(String nome,  String tipoAnimal, String habitat, int idade, double altura, double peso, int quantidadeDePatas) {
        super(nome, tipoAnimal, habitat, idade, altura, peso);
        this.quantidadeDePatas = (int) numeroValido(quantidadeDePatas);
    }

    //métodos set dos atributos específicos para animais terrestres
    public void setQuantidadeDePatas(int quantidadeDePatas){
        if(quantidadeDePatas > 0){
            this.quantidadeDePatas = quantidadeDePatas;
        }
    }

    //métodos get dos atributos específicos para animais terrestres
    public int getQuantidadeDePatas() {
        return quantidadeDePatas;
    }

    @Override
    public String toString(){
        return super.toString() + "\nNº de patas: " + quantidadeDePatas;
    }
}
