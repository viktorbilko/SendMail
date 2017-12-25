package projectSendMail.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Properties;

/**
 * @author Viktor Bilko on 23.09.2017.
 */
@Data
@AllArgsConstructor
public class Email {

    private String email;
    private String password;
}
