/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola.controller;

import escola.dao.AdministradorDao;
import escola.entity.Usuario;
import java.util.List;

/**
 *
 * @author Diogo Henrique: Agro42
 */
public class AdministradorController {
    
    AdministradorDao ad;
    
    public boolean criarUsuario(Usuario u){
        
        ad = new AdministradorDao();
       return ad.criarUsuario(u);
        
    }
    
    public List listarusuarios(String nome, String cpf, String tipo){
        
        ad = new AdministradorDao();
       return ad.listarUsuarios(nome,cpf,tipo);
        
    }
    
}
