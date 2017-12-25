package projectSendMail.dao.impl;

import projectSendMail.dao.UserDao;
import projectSendMail.database.UserData;
import projectSendMail.model.Email;
import projectSendMail.model.User;

import java.util.Set;

/**
 * @author Viktor Bilko on 23.09.2017.
 */
public class UserDaoImpl implements UserDao {

    @Override
    public void saveUser(String name, String surname, String email, String password) {
        UserData.saveUser(name, surname, email, password);
    }

    @Override
    public void saveStudentsEmail(String emailStudent) {
        UserData.saveStudentEmail(emailStudent);
    }

    @Override
    public User getUser() {
        return UserData.getUser();
    }

    @Override
    public Set getStudentEmail() {
        return UserData.getListStudents();
    }

    @Override
    public String getAdminEmail() {
        return UserData.getAdminEmail();
    }
}
