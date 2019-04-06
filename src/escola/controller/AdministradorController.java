/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola.controller;

import escola.dao.AdministradorDao;
import escola.entity.Usuario;

/**
 *
 * @author Diogo Henrique: Agro42
 */
public class AdministradorController {
    
    AdministradorDao ad;
    
    public void criarUsuario(Usuario u){
        ad = new AdministradorDao();
        ad.criarUsuario(u);
        
    }
    
}
