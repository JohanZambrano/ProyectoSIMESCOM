/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author johan
 */
@Entity
@XmlRootElement
@XmlAccessorType(value = XmlAccessType.FIELD)
@Table(name = "TB_usuario")
@NamedQueries({
    @NamedQuery(name = "Usuario.listarTodo", query = "SELECT a FROM TB_usuario a "),
    @NamedQuery(name = "Usuario.listarAutores", query = "SELECT a.id, a.nombre, a.apellido, a.fecha FROM TB_usuario a"),
    @NamedQuery(name = "Usuario.buscarId", query = "SELECT a FROM TB_usuario a WHERE a.autor = :id"),
    @NamedQuery(name = "Usuario.buscarDocumento", query = "SELECT a FROM TB_usuario a WHERE a.documento = :documento"),
    @NamedQuery(name = "Usuario.cambiarEstado", query = "UPDATE TB_usuario p SET p.estado = :estado WHERE p.id = :id")
})
public class Usuario implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @NotNull(message = "Nombre requerido")
    @Column(name = "nombre", nullable = false, length = 25)
    private String nombre;
    
    @NotNull(message = "Apellido requerido")
    @Column(name = "apellido", nullable = false, length = 25)
    private String apellido;
    
    @NotNull(message = "Documento requerido")
    @Column(name = "documento", nullable = false, length = 12)
    private String documento;
    
    @NotNull(message = "Lugar de expedición del documento requerido")
    @Column(name = "lugarExpedicionDocumento", nullable = false, length = 25)
    private String lugarExpedicionDocumento;
    
    @NotNull(message = "Estado de actividad en la Institución requerido")
    @Column(name = "aun_activo", nullable = false)
    private boolean aun_activo;
    
    @NotNull(message = "Correo requerido")
    @Column(name = "correo", nullable = false, length = 25)
    private String correo;
    
    public Usuario(){}

    public Usuario(Integer id, String nombre, String apellido, String documento, boolean aun_activo, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.aun_activo = aun_activo;
        this.correo = correo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public boolean isAun_activo() {
        return aun_activo;
    }

    public void setAun_activo(boolean aun_activo) {
        this.aun_activo = aun_activo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
}
