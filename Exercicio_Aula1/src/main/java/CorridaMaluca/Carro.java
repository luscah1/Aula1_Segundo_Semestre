package CorridaMaluca;
public class Carro {
    private String nomeCarro, modelo, potencia, motor, nomePiloto;
    private int ano, vitorias, derrotas, empates;
    
    public String getNomeCarro() {
        return nomeCarro;
    }

    public void setNomeCarro(String nomeCarro) {
        this.nomeCarro = nomeCarro;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPotencia() {
        return potencia;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getNomePiloto() {
        return nomePiloto;
    }

    public void setNomePiloto(String nomePiloto) {
        this.nomePiloto = nomePiloto;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    
    public void apresentar(){
        System.out.println("====== Apresentando o carro --> " + this.getNomeCarro() + "======");
        System.out.println("Modelo da máquina: " + this.modelo);
        System.out.println("Com a potencia de " + this.potencia + "cavalos");
        System.out.println("Conduzido pelo(a) piloto(a): " + this.nomePiloto);
        System.out.println("Vitórias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
        System.out.println("=====================================");    
    }

    public void ganharRace(){
        System.out.println("====== Resultado da grande corrida maluca!!! ======");
        System.out.println("Venceu o carro: " + this.getNomeCarro());
        System.out.println("Com o(a) piloto(a): " + this.getNomePiloto());
    }
    public void perderRace(){
        
    }
    public void empatarRace(){
        
    }

    
    public String status(){
        return  "Carro: " + this.getNomeCarro() + "\nModelo: "+ this.getModelo() +
                "\nPotência: "+ this.getPotencia() + "\nMotor: "+ this.getMotor() +
                "\nNome do piloto: "+ this.getNomePiloto() + "\nAno do carro: "+ this.getAno();
    }
    
}