package projectSendMail.service.impl;

import lombok.val;
import projectSendMail.dao.factory.DaoFactory;
import projectSendMail.model.User;
import projectSendMail.service.UserService;

import java.util.Set;

/**
 * @author Viktor Bilko on 23.09.2017.
 */
public class UserServiceImpl implements UserService {

    @Override
    public void saveUser(String name, String surname, String email, String password) {
        val userDao = DaoFactory.getUserDao();
        userDao.saveUser(name, surname, email, password);
    }

    @Override
    public void saveStudentsEmail(String emailStudent) {
        val userDao = DaoFactory.getUserDao();
        userDao.saveStudentsEmail(emailStudent);
    }

    @Override
    public User getUser() {
        val userDao = DaoFactory.getUserDao();
        return userDao.getUser();
    }

    @Override
    public Set getStudentEmail() {
        val userDao = DaoFactory.getUserDao();
        return userDao.getStudentEmail();
    }

    @Override
    public String getAdminEmail() {
        val userDao = DaoFactory.getUserDao();
        return userDao.getAdminEmail();
    }
}
