package integrador;

import java.util.ArrayList;
import java.util.Arrays;

public class Integrador {

    public static void main(String[] args) {
        
        Practica practica = new Practica();
        
        System.out.println( (int) Math.log10(1000)+1);
        
        //Generar las variables necesarias para probar
        ArrayList<String> medias = new ArrayList(Arrays.asList(new String[]{"R", "E", "T", "A", "P", "S", "G", "H"}));

        System.out.println(practica.mediasAmigas(medias));
        //System.out.println(practica.numeroCapicua(-123454321));
        //System.out.println(practica.prisioneroDulce(455,1585,500));
    }
}
