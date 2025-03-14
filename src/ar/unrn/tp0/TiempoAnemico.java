package ar.unrn.tp0;

import java.time.LocalDateTime;

//modelo anemico
public class TiempoAnemico {
    private LocalDateTime fechaHora;

    public TiempoAnemico() {
        this.fechaHora = LocalDateTime.now();
    }

    public LocalDateTime getTiempo() {
        return fechaHora;
    }

}
