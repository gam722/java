//Hereda los metodos y atrubutos publicos de la clase padre y pueden tener mas caracteristicas
public class SmallCar extends Car{
    private final int seats;
    
    //CONSTRUCTOR
    public SmallCar(int paramSeats)
    {
        super ("Renault", 5, "Manula", "100");
        this.seats =paramSeats;
    }
    public String seatsNumber(){
        return ("Este auto tiene espacio para dos personas: " + seats);
    }
}