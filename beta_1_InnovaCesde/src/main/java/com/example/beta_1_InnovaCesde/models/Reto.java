package com.example.beta_1_InnovaCesde.models;


import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "retos") 

public class Reto {
    

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
     private UUID id;
     @Column(name = "titulo", nullable = false, unique = false, length = 100)
     private String titulo;
     @Column(name = "descripcion", nullable = false, unique = false, length = 200)
     private String descripcion;
     @Column(name = "fecha_creacion", nullable = false, unique = false)
     private LocalDateTime fecha_creacion;
     @Column(name = "fecha_limite", nullable = false, unique = false)
     private LocalDateTime fecha_limite;
     @Column(name = "estado", nullable = false, unique = false, length = 20)
     private String estado;
     @Column(name = "empresa", nullable = false, unique = false, length = 100)
     private String empresa;
    
    
    @ManyToOne
    @JoinColumn(name="id_empresa")
    @JsonBackReference("reto_empresa")
    private Empresa empresa;

    @ManyToOne
    @JoinColumn(name="id_categoria")
    @JsonBackReference("reto_categoria")
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name="id_prioridad")
    @JsonBackReference("reto_prioridad")
    private Prioridad prioridad;


     public UUID getId() {
         return id;
     }
     public void setId(UUID id) {
         this.id = id;
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
     public LocalDateTime getFecha_creacion() {
         return fecha_creacion;
     }
     public void setFecha_creacion(LocalDateTime fecha_creacion) {
         this.fecha_creacion = fecha_creacion;
     }
     public LocalDateTime getFecha_limite() {
         return fecha_limite;
     }
     public void setFecha_limite(LocalDateTime fecha_limite) {
         this.fecha_limite = fecha_limite;
     }
     public String getEstado() {
         return estado;
     }
     public void setEstado(String estado) {
         this.estado = estado;
     }
     public String getEmpresa() {
         return empresa;
     }
     public void setEmpresa(String empresa) {
         this.empresa = empresa;
     }
    
     
     

}
