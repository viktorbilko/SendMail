package projectSendMail.dao.factory;

import projectSendMail.dao.UserDao;
import projectSendMail.dao.impl.UserDaoImpl;

/**
 * @author Viktor Bilko on 23.09.2017.
 */
public class DaoFactory {

    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
