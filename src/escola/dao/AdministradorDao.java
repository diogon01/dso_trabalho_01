/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola.dao;

import escola.entity.Usuario;
import escola.util.HibernateUtil;
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
    public void criarUsuario(Usuario usuario) {

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(usuario);

            session.getTransaction().commit();

        } catch (Exception erroSql) {
            if (session.getTransaction() != null) {
                session.getTransaction().rollback();
            }

            erroSql.printStackTrace();

        } finally {
            if (session != null) {
                session.close();
            }
        }

    }
}
