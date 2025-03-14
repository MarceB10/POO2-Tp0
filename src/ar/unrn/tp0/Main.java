package ar.unrn.tp0;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        //Modelo Anemico
        TiempoAnemico tiempoAnemico= new TiempoAnemico();

        System.out.println("/////////MODELO ANEMICO/////////");
        System.out.println(tiempoAnemico.getTiempo().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println(tiempoAnemico.getTiempo().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        //Modelo no Anemico
        Tiempo tiempo = new Tiempo();

        System.out.println("/////////MODELO NO ANEMICO/////////");
        System.out.println(tiempo.formatoCorto());
        System.out.println(tiempo.formatoLargo());


    }
}