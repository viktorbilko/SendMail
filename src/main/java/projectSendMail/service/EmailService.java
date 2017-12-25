package projectSendMail.service;

import projectSendMail.model.User;

import java.util.Set;

/**
 * @author Viktor Bilko on 23.09.2017.
 */
public interface EmailService {

    String buildSignature(User user);

    String buildTextMessage(User user, String textMessage);

    void sendMessageToStudents(User user, Set<String> studentsEmail, String subject, String textMessage);

    void sendMessage(User user, String toEmail, String subject, String textMessage);

}
