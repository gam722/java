public class Car {
       //Estos fields o atributos represnetan el estado (state) del objeto
       private final String brand;
       private final int gears;
       private final String transmission;
       private final String hp;
    
       //CONSTRUCTORES inicializan las referenciasde los fields
       public Car(String aBrand, int aGear, String aTr, String aHp){
           this.brand = aBrand;
           this.gears = aGear;
           this.transmission = aTr;
           this.hp = aHp;     
       }
    
    // Y el comportamiento se muestra a taraves de metodos
    
    public String stop(){
        return "Frenando...";
    }
    public String accelerate(){
        return "Acelerando...";
    }
    public String showstate(){
        return "Marca: " + brand + " Velocidades: " + gears + " HP: " + hp;
    }
}