package integrador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practica {

    /**
     * El programa debera tomar un numero x y determinar si es capicua o no
     * **Contemplar que el num que llega puede ser null,en caso de que sea null,
     * retornar false, en caso que sea capicua retornar true.
     *
     * @param num
     * @return esPalindromo
     */
    public Boolean numeroCapicua(Integer num) {
        
       try{
            int auxiliar;
            int copia = num;
            int inverso=0;
            if(num>-9 && num<9){
                return true;
            }else{
                if(num < 0){
                    num*=-1;
                    copia*=-1;
                }
                while(num!=0){
                    auxiliar= num%10;
                    inverso =inverso*10 + auxiliar;
                    num/=10;
                }
                System.out.println(copia);
                System.out.println(inverso);
                return copia == inverso;
            }
       }catch(NullPointerException e){
           return false;
       }
    }

    /**
     * Estamos en caramelolandia, donde estan los peores ladrones de dulces. Una
     * vez al mes, se sienta una n cantidad de ladrones en ronda, contemplando
     * al primer ladron que se sienta, como el ladron 0. A los ladrones se le
     * repartira una m cantidad de caramelos contemplando que se comenzaran a
     * repartir los caramelos desde el primer ladron (inicio). El ultimo
     * caramelo en repartirse estara podrido, determinar a que ladron, segun su
     * posicion en la ronda le tocara.
     *
     * @param inicio
     * @param cantidadCaramelos
     * @param cantidadLadrones
     * @return ladronQueLeTocoElCarameloPodrido
     */
    public int prisioneroDulce(int inicio, int cantidadCaramelos, int cantidadLadrones) {
        int podrido=inicio-1;
        while(cantidadCaramelos>0){
            podrido++;
            if(podrido >= cantidadLadrones){
                podrido=0;
            }
            cantidadCaramelos--;
        }
        cantidadCaramelos--;
        return podrido;
    }

    /**
     * En un universo paralelo, donde los habitantes son medias, existe un
     * crucero de medias donde se sube una lista de medias. Esta lista de
     * tripulantes del crucero es una Collection de letras, lo que se debera
     * hacer, es filtrar la lista de medias que se suben al crucero y retornar
     * una lista que contenga los grupos de medias que si tenian amigas. Esta
     * lista final de medias amigas se mostraran ordenadas de menor a mayor. A
     * continuacion un ejemplo:
     *
     * List de medias que llegan : A,B,A,B,C,A,F,Z,C,H **F,Z,H no tienen amigas
     * :(. List que se deberia retornar : A,B,C
     *
     *
     * @param pasajeros
     * @return mediasAmigas
     */
    public List<String> mediasAmigas(List<String> pasajeros) {
        ArrayList <String>memoria = new ArrayList();
        ArrayList <String>parejas = new ArrayList();
        for (String pasajero : pasajeros) {
            if(!memoria.contains(pasajero)){
                memoria.add(pasajero);
            }else  if(!parejas.contains(pasajero)){
                parejas.add(pasajero);
            }
        }
        Collections.sort(parejas);
        
        return parejas;
    }
}
