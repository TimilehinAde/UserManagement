package com.pakam.ewallet.services.user;

import com.pakam.ewallet.data.models.Card;
import com.pakam.ewallet.data.models.User;
import com.pakam.ewallet.dtos.request.*;
import com.pakam.ewallet.dtos.response.accountverificationpaystackresponse.AccountVerificationPaystackResponse;
import com.pakam.ewallet.dtos.response.bvnvalidationpaystackresponse.BVNValidationPaystackResponse;
import com.pakam.ewallet.dtos.response.getbankspaystackresponse.BankName;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Optional;

public interface UserService {
    String createAccount(User user);

    String login(LoginRequest loginRequest);
    Optional<User>findUserByEmailAddress(String EmailAddress);

    String changePassword(ChangePasswordRequest changePasswordRequest);
    void enableUser(String emailAddress);
    void saveUser(User user);

    List<Card> viewCards(Long userId);
    String addCard(Long userId, AddCardRequest addCardRequest) throws ParseException, IOException;
    AccountVerificationPaystackResponse verifyReceiverAccount(AccountVerificationRequest accountVerificationRequest) throws IOException;
    List<BankName> getListOfBanks() throws IOException;
    BVNValidationPaystackResponse bvnValidation(BvnValidationRequest bvnValidationRequest) throws IOException;
    String getBankCode(BankCodeRequest bankCodeRequest) throws IOException;
    String createTransferRecipient(CreateTransferRecipientRequest createTransferRecipientRequest) throws IOException;
    JsonNode initiateTransfer(InitiateTransferRequest initiateTransferRequest) throws IOException;

    String deleteUser(Long userId, DeleteUserRequest deleteUserRequest);

    User findUserById(Long userId);

}
