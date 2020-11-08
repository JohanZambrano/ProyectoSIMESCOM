/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.service;

import co.edu.unicundi.entity.Usuario;
import javax.ejb.Local;

/**
 *
 * @author johan
 */
@Local
public interface IUsuarioService {
    
    public Usuario buscarDocumento(String documento);
    
            
}
