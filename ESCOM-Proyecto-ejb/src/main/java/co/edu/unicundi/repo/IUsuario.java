/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.repo;

import co.edu.unicundi.entity.Usuario;
import javax.ejb.Local;

/**
 *
 * @author johan
 */
@Local
public interface IUsuario {
    
    public Usuario buscarDocumento(String documento);
    
}
