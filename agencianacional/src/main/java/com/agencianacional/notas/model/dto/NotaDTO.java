package com.agencianacional.notas.model.dto;
import javax.validation.constraints.NotNull;

public class NotaDTO {

    private long id;
    @NotNull(message = "El campo debe ser enviado")
    private String nombre;
    @NotNull(message = "El campo debe ser enviado")
    private String titulo;
    @NotNull(message = "El campo debe ser enviado")
    private String contenido;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}


