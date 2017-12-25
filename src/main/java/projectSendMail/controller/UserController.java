package projectSendMail.controller;

import lombok.val;
import projectSendMail.service.factory.ServiceFactory;

import java.util.Set;

/**
 * @author Viktor Bilko on 23.09.2017.
 */
public class UserController {

    public static void main(String[] args) {

       val userService = ServiceFactory.getUserService();

       userService.saveUser("Viktor",
               "Bilko",
               "viktor.bilko@gmail.com",
               "alkanaft");

       userService.saveStudentsEmail("viktor.bilko@gmail.com");
       userService.saveStudentsEmail("Remwolf@bigmir.net");

        Set <String> studentEmail = userService.getStudentEmail();

        val emailService = ServiceFactory.getEmailService();
        emailService.buildSignature(userService.getUser());
        emailService.sendMessageToStudents(userService.getUser(),
                studentEmail,
                "Test Students",
                "Hello! Its ok!");

//        emailService.sendMessage(userService.getUser(),
//                userService.getAdminEmail(),
//                "Test123",
//                "Hello! Its ok!");
    }
}
