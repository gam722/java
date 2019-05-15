
public class Cat{
       String name;
       String color;
    
    public String talk () {
        return "miau";
    }
    
    public String datos()    {
        return "El gato se llama: " + name
        + " y esde color: " + color;
    }
    
    public void eat(String food){
           System.out.println("el gato va a comer: " + food);
}
    
    public static void main(String []args){
        Cat rayo = new Cat();
        rayo.name = args[0];
        rayo.color = args [1];
        //Cat.name= "firulais"
        //Cat.colour="negro"    
       
        System.out.println(rayo.talk());
        System.out.println(rayo.datos());
        rayo.eat ("Pescado");
    }
}
