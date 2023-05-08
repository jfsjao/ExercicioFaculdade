package exreforço;

public class FabricaCaneta {
    String marca;
    String modelo;
    String cor;
    int tamanho;
    boolean tampada=true;

    public FabricaCaneta(String marca, String modelo, String cor, int tamanho) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "FabricaCaneta{" + "marca=" + marca + ", modelo=" + modelo + ", cor=" + cor + ", tamanho=" + tamanho + ", tampada=" + tampada + '}';
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getMarca(){
        return this.marca;     
    }
    
    void verificarTampa(){
        if(tampada){
            System.out.println("A caneta esta tampada");
        }else{
            System.out.println("Caneta destampada");
        }
        
    }
    void verificarTinta(){
        if(tamanho<30){
            System.out.println("caneta com pouca tinta!");                    
        }else{
            System.out.println("Nao e necessario comprar outra!");
        }
    }
}
