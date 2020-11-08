/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.repo.impl;

import co.edu.unicundi.entity.Usuario;
import co.edu.unicundi.repo.AbstractFacade;
import co.edu.unicundi.repo.IUsuario;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author johan
 */
public class UsuarioRepo extends AbstractFacade<Usuario, Integer> implements IUsuario {
 
    // aRREGLAR PERSISTENCIA
    @PersistenceContext(unitName = "co.edu.unicundi_Servicios-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager entity;

    public UsuarioRepo() {
        super(Usuario.class);
    }
    
    @Override
    protected EntityManager getEntityManager() {
        return entity;
    }

    @Override
    public Usuario buscarDocumento(String documento) {
        return buscarDocumento(documento);
    }
    
}
