/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author johan
 */
@Entity
@XmlRootElement
@XmlAccessorType(value = XmlAccessType.FIELD)
@Table(name = "TB_historiaLaboral")
@NamedQueries({
    /*@NamedQuery(name = "Usuario.listarTodo", query = "SELECT a FROM TB_usuario a "),
    @NamedQuery(name = "Usuario.listarAutores", query = "SELECT a.id, a.nombre, a.apellido, a.fecha FROM TB_usuario a"),
    @NamedQuery(name = "Usuario.buscarId", query = "SELECT a FROM TB_usuario a WHERE a.autor = :id"),
    @NamedQuery(name = "Usuario.buscarDocumento", query = "SELECT a FROM TB_usuario a WHERE a.documento = :documento"),
    @NamedQuery(name = "Usuario.cambiarEstado", query = "UPDATE TB_usuario p SET p.estado = :estado WHERE p.id = :id")*/
})
public class HistoriaLaboral {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @ManyToOne 
    @XmlTransient
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;
    
    @NotNull(message = "Año de trabajo requerido")
    @Column(name = "anio", nullable = false)
    private int anio;
    
    @NotNull(message = "Sueldo requerido")
    @Column(name = "sueldo", nullable = false)
    private int sueldo;
    
    @NotNull(message = "Función requerida")
    @Column(name = "funcion", nullable = false, length = 30)
    private String funcion;
    
    @NotNull(message = "Especialización requerida")
    @Column(name = "especializacion", nullable = false, length = 30)
    private String especializacion;
    
    
    
}
