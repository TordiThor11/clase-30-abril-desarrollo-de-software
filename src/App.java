public class App {
    // Esta es la clase principal en la que corre el programa y suelen instanciarse
    // las clases.
    // Puede llamarse Main.java o App.java
    // despues de la clase tiene un main con la firma: public static void
    // main(String[] args){}
    public static void main(String[] args) throws Exception {
        // Se crea una variable llamada persona1 de tipo Persona. Luego se le asigna el
        // objeto creado con el constructor Persona(String nombre, int edad, int altura)
        Persona persona1 = new Persona("Pepito", 20, 180);
        // Persona persona2 = new Persona("Juan", 15); //Altura = -1

        System.out.println("La altura de " + persona1.getNombre() + " es: " + persona1.getAltura());
        persona1.crecer(10);
        System.out.println("La altura de " + persona1.getNombre() + " es: " + persona1.getAltura());

        // Se animan a crear un metodo que pregunte si la persona puede subirse a un
        // juego de circo?
        // Tiendo que tener entre 170cm y 200cm para poder subirse.
    }

}
