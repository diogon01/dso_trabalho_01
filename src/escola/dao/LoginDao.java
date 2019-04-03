/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola.dao;

import com.mysql.jdbc.PreparedStatement;
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

    private static String QUERY_BASED_ON_FIRST_NAME = "select * from Login where nome=? and senha=?";
    //Cria variável tipo String com comando de seleção SQL dos campos nome e senha;  
    boolean check = false;

    public boolean acessoLogin(String nome, String senha) {
        //Método booleano com dois argumentos para autenticar nome e senha do usuário;       
        String sql = "select * from Login where nome=? and senha=?";
        //Cria variável tipo String com comando de seleção SQL dos campos nome e senha;  
        boolean check = false; //Cria variável boolean abribuindo o valor false;  
        try {
            PreparedStatement ps = Conector.getConexao().prepareStatement(sql);
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Query q = session.createQuery(hql);
            List resultList = q.list();
            //displayResult(resultList);
            session.getTransaction().commit();
        } catch (HibernateException he) {
            he.printStackTrace();
        }
        return check;
        //Retorna a variável boolean check;  
    }

}
