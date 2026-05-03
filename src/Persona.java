public class Persona {

    // Atributos, en "private" para que sean visibles solo dentro de la clase.
    // Esto respeta la encapsulacion.
    // Imposibilitando acceder a ellos dentro del main y obligando a ser accedido
    // solo y unicamente por el objeto.
    private String nombre;
    private int edad;
    private int altura;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = -1; // Si tiene -1 significa que no tiene altura asignada.
    }

    // Constuctor con sobrecarga de parametros.
    /*
     * Recuerden que se invoca al constructor corresponiente dependiendo de la
     * CANTIDAD y el TIPO de los parametros pasados en la invocación, el orden
     * importa.
     */
    public Persona(String nombre, int edad, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    // Metodos. Recuerden que los metodos son funciones dentro de una clase.
    // Si el metodo no retorna nada, se le pone "void".
    public void crecer(int altura) { // en cm
        this.altura += altura;
    }

    // Estos son los Getters, sirven para recuperar informacion del objeto.
    // Recuerden que es mala practica agregar getters innecesarios.
    // Guarda con el IDE VSCode que los quiere crear constantemente.
    public int getAltura() {
        return this.altura;
    }

    public String getNombre() {
        return this.nombre;
    }

    // Este es un setter, sirve para modificar informacion del objeto.
    // Igual que los getters, es mala practica agregar setters innecesarios.
    public void setAltura(int altura) {
        this.altura = altura;
    }

}
