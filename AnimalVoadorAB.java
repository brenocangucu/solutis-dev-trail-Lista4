public abstract class AnimalVoadorAB extends AnimalAB{
    //atributos específicos para animais aéreos
    int quantidadeDePatas;
    int quantidadeDeAsas;
    double envergaduraAsa;

    //construtor específico para animais que voam;
    public AnimalVoadorAB(String nome, String tipoAnimal, String habitat, int idade, double altura, double peso, int quantidadeDeAsas, int quantidadeDePatas, double envergaduraAsa){
        super(nome, tipoAnimal, habitat, idade, altura, peso);
        this.quantidadeDePatas = (int) numeroValido(quantidadeDePatas);
        this.quantidadeDeAsas = (int) numeroValido(quantidadeDeAsas);
        this.envergaduraAsa = numeroValido(envergaduraAsa);
    }


    //método específico para animais aéreos
    public void voar(double distancia){
        moverse(distancia);
    }


    //métodos set de atributos específicos dos animais aéreos
    public void setQuantidadeDePatas(int quantidadeDePatas){
        if(quantidadeDePatas > 0){
            this.quantidadeDePatas = quantidadeDePatas;
        }
    }

    public void setQuantidadeDeAsas(int quantidadeDeAsas){
        if(quantidadeDeAsas > 0){
            this.quantidadeDeAsas = quantidadeDeAsas;
        }
    }

    public void setEnvergaduraAsa(double envergadura){
        if(envergadura > 0) {
            this.envergaduraAsa = envergadura;
        }
    }

    //métodos get de atributos específicos dos animais aéreos
    public int getQuantidadeDePatas() {
        return quantidadeDePatas;
    }

    public int getQuantidadeDeAsas() {
        return quantidadeDeAsas;
    }

    public double getEnvergaduraAsa() {
        return envergaduraAsa;
    }


    @Override
    public String toString(){
        StringBuilder str = new StringBuilder(super.toString());

        String patas = String.valueOf(quantidadeDePatas);
        String asas = String.valueOf(quantidadeDeAsas);
        String envergadura = envergaduraAsa + "m";

        if(quantidadeDePatas == 0){
            patas = "não especificado";
        }

        if(quantidadeDeAsas == 0){
            asas = "não especificado";
        }

        if(envergaduraAsa == 0){
            envergadura = "não especificada";
        }

        str.append("\nNº de patas: ").append(patas)
                .append("\nNº de Asas: ").append(asas)
                .append("\nEnvergadura: ").append(envergadura);

        return str.toString();
    }
}
