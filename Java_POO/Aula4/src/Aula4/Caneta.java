package Aula4;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    private boolean tampada;

    public Caneta(String modelo, String cor, float ponta ){
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;

    }
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }
    public void destampar(){
        this.tampada = false;
    }

    public void tampar(){
        this.tampada = true;
    }
    public void status(){
        System.out.println("SOBRE A CANETA");
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Ponta: "+ this.ponta);
        System.out.println("Cor:"+ this.cor);
        System.out.println("Tampada"+this.tampada);
    }
}
