/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola.dao;

import com.mysql.jdbc.PreparedStatement;
import escola.entity.Usuario;
import escola.util.HibernateUtil;
import java.sql.SQLException;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author diogo
 */
public class LoginDao {

    //Cria variável tipo String com comando de seleção SQL dos campos nome e senha;  
    boolean check = false;
    static Session session;

    public static Usuario acessoLogin(String cpf, String senha) {

        String sql = "from Usuario u where u.senha = :senha and u.cpf = :cpf ";

//Método booleano com dois argumentos para autenticar nome e senha do usuário;       
        //Cria variável tipo String com comando de seleção SQL dos campos nome e senha;  
        boolean check = false; //Cria variável boolean abribuindo o valor false;  
        Usuario usuario = null;
        try {

            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Query q = session.createQuery(sql)
                    .setParameter("senha", senha)
                    .setParameter("cpf", cpf);
            List resultList = q.list();

            if (resultList.size() > 0) {
                usuario = (Usuario) resultList.get(0);
            }

            //displayResult(resultList);
            session.getTransaction().commit();
        } catch (HibernateException he) {
            he.printStackTrace();
        }
        return usuario;
    }

}
