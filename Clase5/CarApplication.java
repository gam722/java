public class CarApplication {

        public static void main (String[] args){
        
        Car car1 = new Car("Ford", 5 , "Manual", "180");
            System.out.println(car1.showstate());
            System.out.println(car1.accelerate());
            
        Car car2 = new Car("Nissan", 6, "Automatico", "120");
            System.out.println(car2.showstate());
            
        SmallCar mini1 = new SmallCar(2);
        System.out.println(mini1.showstate());
        System.out.println(mini1.seatsNumber());
        }
        
        
}