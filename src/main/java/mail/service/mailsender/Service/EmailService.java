package mail.service.mailsender.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(String toEmail, String subject, String body) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(toEmail);
        message.setSubject(subject);
        message.setText(body);

        // Жестко задаем отправителя
        message.setFrom("kamron1234d5@mail.ru"); // Укажите ваш email напрямую

        // Отправка письма
        mailSender.send(message);
        System.out.println("Письмо отправлено на " + toEmail);
    }
}
