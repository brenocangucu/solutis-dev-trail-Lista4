public abstract class AnimalAB implements AnimalIF {
    //atributos que são comuns a qualquer animal
    String nome;
    String tipoAnimal;
    String habitat;
    int idade;
    double altura;
    double peso;

    //atributos da interface AnimalIF;
    double qntdComida;
    double caminhoPercorrido;
    double horasDormidas;

    //construtor
    public AnimalAB(String nome, String tipoAnimal, String habitat, int idade, double altura, double peso){
        //inicialização dos atributos de classe
        this.nome  = nome;
        this.tipoAnimal = tipoAnimal;
        this.habitat = habitat;

        //idade, altura e peso >= 0;
        this.idade = (int) numeroValido(idade);
        this.altura = numeroValido(altura);
        this.peso = numeroValido(peso);

        //inicialização dos tributos de interface
        this.qntdComida = 0.0;
        this.caminhoPercorrido = 0.0;
        this.horasDormidas = 0.0;
    }


    //Definição dos métodos implementados da interface
    @Override
    public void comer(double quantidade){
        if(quantidade > 0){
            qntdComida += quantidade;
        }
    }

    @Override
    public void moverse(double distancia){
        if(distancia > 0) {
            caminhoPercorrido += distancia;
        }
    }

    @Override
    public void dormir(double horas){
        if(horas > 0){
            horasDormidas += horas;
        }
    }


    //Metódos set de atributos compartilhados por todos os animais;
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setTipoAnimal(String tipoAnimal){
        this.tipoAnimal = tipoAnimal;
    }

    public void setHabitat(String habitat){
        this.habitat = habitat;
    }

    public void setIdade(int idade){
        this.idade = (int) numeroValido(idade);
    }

    public void setAltura(double altura){
        this.altura = numeroValido(altura);
    }

    public void setPeso(double peso){
        this.peso = numeroValido(peso);
    }


    //Métodos get de atributos compartilhados por todos os animais:
    public String getNome(String nome){
        return this.nome;
    }

    public String getTipoAnimal(){
        return this.tipoAnimal;
    }

    public String getHabitat(){
        return this.habitat;
    }

    public int getIdade(){
        return this.idade;
    }

    public double getAltura(){
        return this.altura;
    }

    public double getPeso(){
        return this.peso;
    }


    //Métodos get de atributos da Interface AnimalIF
    public double getQntdComida(){
        return qntdComida;
    }

    public double getCaminhoPercorrido(){
        return caminhoPercorrido;
    }

    public double getHorasDormidas() {
        return horasDormidas;
    }


    //verificador
    public double numeroValido(double numero){
        if(numero < 0.0){
            return 0.0;
        }

        return numero;
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();

        String altura = this.altura + "m";
        String peso = this.peso + "kg";

        if(this.altura == 0){
            altura = "não especificada";
        }

        if(this.peso == 0){
            peso = "não especificado";
        }


        str.append("Nome: ").append(nome)
                .append("\nTipo Animal: ").append(tipoAnimal)
                .append("\nIdade: ").append(idade).append((" anos"))
                .append("\nAltura: ").append(altura)
                .append("\nPeso: ").append(peso)
                .append("\nHabitat: ").append(habitat)
                .append("\nQuantidade de comida ingerida: ").append(qntdComida).append("kg")
                .append("\nCaminho Percorrido: ").append(caminhoPercorrido).append("m")
                .append("\nHoras Dormidas: ").append(horasDormidas).append("h");

        return str.toString();
    }
}
