package projectSendMail.service.email;

import lombok.val;
import projectSendMail.model.User;
import projectSendMail.service.EmailService;

import java.util.List;
import java.util.Set;

/**
 * @author Viktor Bilko on 23.09.2017.
 */
public class EmailServiceImpl implements EmailService {

    EmailSender tlsSender;

    @Override
    public String buildSignature(User user) {
        val strBuilder = new StringBuilder();
        strBuilder.append("Yours sincerely,")
                .append("\n")
                .append(user.getName())
                .append(" ")
                .append(user.getSurname())
                .append("\n")
                .append("email")
                .append(" ")
                .append(user.getEmail().getEmail());

        return new String(strBuilder);
    }

    @Override
    public String buildTextMessage(User user, String textMessage) {
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append(textMessage)
                .append("\n")
                .append("\n")
                .append(buildSignature(user));

        return String.valueOf(strBuilder);
    }

    @Override
    public void sendMessageToStudents(User user, Set<String> studentsEmail, String subject, String textMessage) {
        for (String email : studentsEmail) {
            sendMessage(user, email, subject, textMessage);
        }
    }

    @Override
    public void sendMessage(User user, String toEmail, String subject, String textMessage) {
        tlsSender = new EmailSender(
                user.getEmail().getEmail(),
                user.getEmail().getPassword()
        );

        tlsSender.send(subject, buildTextMessage(user,textMessage), user.getEmail().getEmail(), toEmail);
    }
}
