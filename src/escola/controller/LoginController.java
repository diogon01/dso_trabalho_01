/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola.controller;

import escola.dao.LoginDao;
import escola.entity.Usuarios;
import escola.ui.Administrador;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author vant3d
 */
public class LoginController {
    
    
    final JFrame frame = new JFrame("JOptionPane Demo");
    LoginDao loginDao;

    public void Login(String cpf, String senha) {
        if (cpf.trim().length() == 0 && cpf.equals("")
                && senha.trim().length() == 0 && senha.equals("")) {
            
               // show message
                    JOptionPane.showMessageDialog(frame,
                            "Campo cpf ou senha são obrigatórios",
                            "Login incorreto",
                            JOptionPane.ERROR_MESSAGE);

        } else {
             
            loginDao = new LoginDao();
            Usuarios usuario = loginDao.acessoLogin(cpf, senha);
            
            if(usuario == null){
                    JOptionPane.showMessageDialog(frame,
                            "Senha ou cpf incorretos",
                            "Login incorreto",
                            JOptionPane.INFORMATION_MESSAGE);
               
            } else {
               if(usuario.getTipo().equals("ADMIN")){
                   new Administrador().setVisible(true);
               }
            } 
            
            
        }
    }

}
