package projectSendMail.database;

import lombok.Getter;
import projectSendMail.model.Email;
import projectSendMail.model.User;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Viktor Bilko on 23.09.2017.
 */

public class UserData {

    @Getter
    private static Set<String> listStudents = new HashSet<>();
    @Getter
    private static User user;

    public static void saveUser(String name, String surname, String email, String password) {
        user = new User(name, surname, new Email(email,password));
    }

    public static void saveStudentEmail(String emailStudent) {
        listStudents.add(emailStudent);
    }

    public static String getAdminEmail() {
        return "viktor.bilko@gmail.com";
    }
}
