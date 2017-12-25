package projectSendMail.service.factory;

import projectSendMail.service.EmailService;
import projectSendMail.service.UserService;
import projectSendMail.service.email.EmailServiceImpl;
import projectSendMail.service.impl.UserServiceImpl;

/**
 * @author Viktor Bilko on 23.09.2017.
 */
public class ServiceFactory {

    public static UserService getUserService(){
        return new UserServiceImpl();
    }

    public static EmailService getEmailService(){
        return new EmailServiceImpl();
    }
}
