package ar.unrn.tp0;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

//modelo no anemico
public class Tiempo {
    private LocalDateTime tiempo;

    public Tiempo() {
        this.tiempo = LocalDateTime.now();
    }

    public String formatoLargo(){
        return tiempo.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
    }

    public String formatoCorto(){
        return tiempo.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

}
