package com.forohub.ForoHub.domain.topico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name="topicos")
@Entity(name="Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private LocalDateTime fechaDeCreacion;
    private boolean estatus;
    private String autor;
    private String curso;

    public Topico (DatosRegistroTopico datosRegistroTopico){
        this.estatus = true;
        this.titulo = datosRegistroTopico.titulo();
        this.mensaje = datosRegistroTopico.mensaje();
        this.autor = datosRegistroTopico.autor();
        this.curso = datosRegistroTopico.curso();
    }

    public void actualizarDatos(DatosActualizarTopico datosActualizarTopico){
        if(datosActualizarTopico.titulo()!= null){
            this.titulo = datosActualizarTopico.titulo();
        }
        if(datosActualizarTopico.curso()!=null){
            this.curso = datosActualizarTopico.curso();
        }
    }

    public void desactivarTopico(){
        this.estatus = false;
    }


}
