package com.pakam.ewallet.services.resetpassword;

import com.pakam.ewallet.dtos.request.ResetPasswordRequest;
import com.pakam.ewallet.dtos.request.SendOTPRequest;
import com.pakam.ewallet.dtos.request.VerifyOTPRequest;
import jakarta.mail.MessagingException;

public interface ResetPasswordService {
    String emailOTP(SendOTPRequest sendOTPRequest) throws MessagingException;
    String verifyOTP(VerifyOTPRequest verifyOTPRequest);

    String resetPassword(ResetPasswordRequest resetPasswordRequest);

}
