package projectSendMail.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Viktor Bilko on 23.09.2017.
 */
@Data
@AllArgsConstructor
public class User {

    private String name;
    private String surname;
    private Email email;
}
