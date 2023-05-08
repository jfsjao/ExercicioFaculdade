
package testeian;

public class Retangulo {
    
    private double area;
    private double perimetro;
    private double altura;
    private double comprimento;
    
    public Retangulo(){
        
        this.comprimento = comprimento;
        this.altura = altura;
        
    }
    
    public double calcArea(){
        
        area = comprimento * altura;
        
        return area;
    }
    
    public double calcPerimetro(){
        
        perimetro = (comprimento*2) + (altura*2);       
        
        return perimetro;
    }
    
    public double getComprimento(){
        
        return comprimento;
        
    }
    
    public void setComprimento(double comprimento){
        
        this.comprimento = comprimento;
        
    }
    
    public double getAltura(){
        
        return altura;
        
    }
    
    public void setAltura(double altura){
        
        this.altura = altura;
        
    }
    
    public double getArea(){
        
        return area;
        
    }
    
    public void setArea(double area){
        
        this.area = area;
        
    }
    
    public double getPerimetro(){
        
        return perimetro;
        
    }
    
    public double setPerimetro(double perimetro){
     
        this.perimetro = perimetro;
        return perimetro;
    }    
    
    
 
}
