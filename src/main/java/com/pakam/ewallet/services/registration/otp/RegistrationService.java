package com.pakam.ewallet.services.registration.otp;


import com.pakam.ewallet.dtos.request.RegistrationRequest;
import com.pakam.ewallet.dtos.request.SendOTPRequest;
import com.pakam.ewallet.dtos.request.VerifyOTPRequest;
import jakarta.mail.MessagingException;

public interface RegistrationService {
    String register(RegistrationRequest registrationRequest) throws MessagingException;

    String verifyOTP(VerifyOTPRequest verifyOTPRequest);

    String resendVerificationOTP(SendOTPRequest sendOTPRequest) throws MessagingException;


}
