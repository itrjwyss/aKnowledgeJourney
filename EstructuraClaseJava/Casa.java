/*
 * Definición de la clase 'Casa'
 * Tendrá 5 atributos
 * Tendrá 5 métodos para obtener el valor (estado) de cada atributos
 * Tendrá 2 métodos para modificar el valor de los atributos de colores
 */
public class Casa {

    //atributos
    int habitantes;
    int mascotas;
    int cuartos;
    String colorParedes;
    String colorPuertas;

    //constructor sin parámetros
    public Casa() {
        habitantes = 0;
        mascotas = 0;
        cuartos = 0;
        colorParedes = "Sin Definir";
        colorPuertas = "Sin Definir";
    }

    //constructor con parámetros
    public Casa(int valorHabitantes, int valorMascotas, int valorCuartos,
                String valorParedes, String valorPuertas){
        habitantes = valorHabitantes;
        mascotas = valorMascotas;
        cuartos = valorCuartos;
        colorParedes = valorParedes;
        colorPuertas = valorPuertas;
    }

    //métodos
    public int cuantosHabitantes(){
        return habitantes;
    }

    public int cuantasMascotas(){
        return mascotas;
    }

    public int cuantoCuartos(){
        return cuartos;
    }

    public void modificarParedes(String nuevoColor){
        colorParedes = nuevoColor;
    }

    public String obtenerColorParedes(){
        return colorParedes;
    }

    public void modificarPuertas(String nuevoColor){
        colorPuertas = nuevoColor;
    }

    public String obtenerColorPuertas(){
        return colorPuertas;
    }

} 