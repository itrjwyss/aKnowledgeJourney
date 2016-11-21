public class EjecutaMain {

    public static void main(String[] args){
        /*
         * Instanciamos la clase Casa
         * Utiliamos el constructor que NO recibe parámetros
         */
        Casa casaSinParametros = new Casa();

        //imprimir los valores de cada atributo
        System.out.println("* Atributos Constructor sin Parámetros *");
        System.out.println("Habitantes: " + casaSinParametros.habitantes);
        System.out.println("Mascotas: " + casaSinParametros.mascotas);
        System.out.println("Cuartos: " + casaSinParametros.cuartos);
        System.out.println("Paredes: " + casaSinParametros.colorParedes);
        System.out.println("Puertas: " + casaSinParametros.colorPuertas);
        System.out.println();

        /*
         * Instanciamos la clase Casa
         * Utiliamos el constructor que SI recibe parámetros
         */
        Casa casaConParametros = new Casa(5, 2, 3, "Celeste", "Blanco");

        //imprimir los valores de cada atributo
        System.out.println("* Atributos Constructor con Parámetros *");
        System.out.println("Habitantes: " + casaConParametros.habitantes);
        System.out.println("Mascotas: " + casaConParametros.mascotas);
        System.out.println("Cuartos: " + casaConParametros.cuartos);
        System.out.println("Paredes: " + casaConParametros.colorParedes);
        System.out.println("Puertas: " + casaConParametros.colorPuertas);
        System.out.println();
    }

}
