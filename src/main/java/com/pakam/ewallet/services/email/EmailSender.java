package com.pakam.ewallet.services.email;
import com.pakam.ewallet.dtos.request.VerifyOTPRequest;
import jakarta.mail.MessagingException;

public interface EmailSender {
    void send(VerifyOTPRequest otpVerificationRequest) throws MessagingException;
    void sendFailedTransactionMessage(String emailAddress);
}
