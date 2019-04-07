/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola.dao;

import escola.entity.Usuario;
import escola.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.hibernate.Session;

/**
 *
 * @author Diogo Henrique: Agro42
 */
public class AdministradorDao {

    static Session session;

    // Método 1: este método usado para criar um novo registro de aluno na 
    //tabela do banco de dados
    public boolean criarUsuario(Usuario usuario) {

        boolean salvou = false;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(usuario);

            session.getTransaction().commit();
            
            salvou = true;

        } catch (Exception erroSql) {
            if (session.getTransaction() != null) {
                session.getTransaction().rollback();
            }

            erroSql.printStackTrace();

        } finally {
            if (session != null) {
                session.close();            }
        }
        
        return salvou;

    }
    
    // Método 2: este método é usado para exibir os registros da tabela de usuarios 
    // do banco de dados
    public static List usuarios() {
        
        List ls_usuario = new ArrayList();
        
        try{
            
            // Inicia a sessao do hibernate
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            
            ls_usuario = session.createQuery("From Usuario").list();
            
            
        } catch (Exception erroSql) {
            if (session.getTransaction() != null) {
                session.getTransaction().rollback();
            }
            erroSql.printStackTrace();

        } finally {
            if (session != null) {
                session.close();            }
        }
        return ls_usuario;
    }
    
}
