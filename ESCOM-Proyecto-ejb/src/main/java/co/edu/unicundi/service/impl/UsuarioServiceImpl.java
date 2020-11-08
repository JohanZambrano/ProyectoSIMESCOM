/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.service.impl;

import co.edu.unicundi.entity.Usuario;
import co.edu.unicundi.repo.AbstractFacade;
import co.edu.unicundi.service.IUsuarioService;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author johan
 */
@Stateless
public class UsuarioServiceImpl implements IUsuarioService {

    @EJB
    private AbstractFacade repo;
    
    @Override
    public Usuario buscarDocumento(String documento) {
        return (Usuario) repo.buscarDocumento("buscarDocumento", documento);
    }
    
}
