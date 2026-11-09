package com.adromi.backendJava.acceso_datos;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Datos {
    private int idIncidencia;
    private String titulo;
    private String descripcion;
    private String fotoUrl;
    private String prioridad;
    private String estado;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaObjetivo;
    private int idEspacio;
    private int idCategoria;
    private int idUsuario;
    private int idUsuarioTecnico;
    private int idProveedor;

    public Datos(int idIncidencia, String titulo, String descripcion, String fotoUrl, String prioridad, String estado, LocalDateTime fechaCreacion, LocalDateTime fechaObjetivo, int idEspacio, int idCategoria, int idUsuario, int idUsuarioTecnico, int idProveedor) {
        this.idIncidencia = idIncidencia;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fotoUrl = fotoUrl;
        this.prioridad = prioridad;
        this.estado = estado;
        this.fechaCreacion = fechaCreacion;
        this.fechaObjetivo = fechaObjetivo;
        this.idEspacio = idEspacio;
        this.idCategoria = idCategoria;
        this.idUsuario = idUsuario;
        this.idUsuarioTecnico = idUsuarioTecnico;
        this.idProveedor = idProveedor;
    }
    public Datos(){

    }

    @Override
    public String toString() {
        return "Datos{" +
                "idIncidencia=" + idIncidencia +
                ", titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fotoUrl='" + fotoUrl + '\'' +
                ", prioridad='" + prioridad + '\'' +
                ", estado='" + estado + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", fechaObjetivo=" + fechaObjetivo +
                ", idEspacio=" + idEspacio +
                ", idCategoria=" + idCategoria +
                ", idUsuario=" + idUsuario +
                ", idUsuarioTecnico=" + idUsuarioTecnico +
                ", idProveedor=" + idProveedor +
                '}';
    }

    public int getIdIncidencia() {
        return idIncidencia;
    }

    public void setIdIncidencia(int idIncidencia) {
        this.idIncidencia = idIncidencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFotoUrl() {
        return fotoUrl;
    }

    public void setFotoUrl(String fotoUrl) {
        this.fotoUrl = fotoUrl;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDateTime getFechaObjetivo() {
        return fechaObjetivo;
    }

    public void setFechaObjetivo(LocalDateTime fechaObjetivo) {
        this.fechaObjetivo = fechaObjetivo;
    }

    public int getIdEspacio() {
        return idEspacio;
    }

    public void setIdEspacio(int idEspacio) {
        this.idEspacio = idEspacio;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdUsuarioTecnico() {
        return idUsuarioTecnico;
    }

    public void setIdUsuarioTecnico(int idUsuarioTecnico) {
        this.idUsuarioTecnico = idUsuarioTecnico;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }
}
