public class Usuario{
       String name;
       int edad;
       //String color;
    
        
    public String voto()    {
        return "El usuario se llama: " + name
        + " y puede votar su edad es " + edad + " es mayor de edad"  ;
    }
    
    public String novoto() {
        return "El usuario se llama: " + name
        + " y no puede votar su edad es " + edad + " es menor de edad"  ;
    }
    
 
    public static void main(String []args){
        
        Usuario votante =new Usuario ();
        votante.name = args[0];
        votante.edad = Integer.parseInt(args[1]);
           
        if (votante.edad >= 18 ) {
        System.out.println(votante.voto());
           } else {
             System.out.println(votante.novoto ());
           }
        //System.out.println(votante.voto());
        
    }
    
    
}
