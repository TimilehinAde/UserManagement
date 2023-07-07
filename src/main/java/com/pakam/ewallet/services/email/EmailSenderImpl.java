package com.pakam.ewallet.services.email;
import com.pakam.ewallet.dtos.request.VerifyOTPRequest;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EmailSenderImpl implements EmailSender{
    @Autowired
    private JavaMailSender javaMailSender;
    @Override
    public void send(VerifyOTPRequest otpVerificationRequest) {
        try {
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper message = new MimeMessageHelper(mimeMessage, "utf-8");
            message.setTo(otpVerificationRequest.getEmailAddress());
            message.setSubject("Your One Time Password");
            message.setText("Your one time password is : " + otpVerificationRequest.getOneTimePassword(), true);
            message.setFrom("digeratees@gmail.com");
            javaMailSender.send(mimeMessage);
        } catch (MessagingException | MailException e) {
            log.info("problem2: ");
            log.info(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public void sendFailedTransactionMessage(String emailAddress) {
        try {
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper message = new MimeMessageHelper(mimeMessage, "utf-8");
            message.setTo(emailAddress);
            message.setSubject("PAKAM FINANCIAL SERVICE");
            message.setText("Deposit failed due to insufficient Balance ", true);
            message.setFrom("digeratees@gmail.com");
            javaMailSender.send(mimeMessage);
        } catch (MessagingException | MailException e) {
            log.info("problem2: ");
            log.info(e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
