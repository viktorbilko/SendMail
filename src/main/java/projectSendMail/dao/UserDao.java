package projectSendMail.dao;

import projectSendMail.model.Email;
import projectSendMail.model.User;

import java.util.Set;

/**
 * @author Viktor Bilko on 23.09.2017.
 */
public interface UserDao {

    void saveUser(String name, String surname, String email, String password);

    void saveStudentsEmail(String emailStudent);

    User getUser();

    Set getStudentEmail();

    String getAdminEmail();
}
