package com.pakam.ewallet.services.registration.otp;

import com.pakam.ewallet.data.models.VerificationOTP;

import java.util.Optional;


public interface VerificationOTPService {
    void saveVerificationOTP(VerificationOTP verificationOTP);
    Optional<VerificationOTP> findByOTP(String otp);

    void setVerifiedAt(String otp);

    void deleteOtp();
}
