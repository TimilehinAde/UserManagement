package com.pakam.ewallet.services.cardservices;

import com.pakam.ewallet.data.models.Card;
import com.pakam.ewallet.dtos.request.AddCardRequest;
import com.pakam.ewallet.dtos.request.EditCardRequest;
import com.pakam.ewallet.dtos.request.VerifyCardRequest;
import org.springframework.web.bind.annotation.PathVariable;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

public interface CardService {

    Card addCard(AddCardRequest addCardRequest) throws ParseException, IOException;
    String deleteCard(Long cardId);
    Object verifyCard(VerifyCardRequest verifyCardRequest) throws IOException;

    void editCard(@PathVariable Long cardId, EditCardRequest editCardRequest);

    Card viewCardById(Long cardId);
    void deleteUserCards(Long userid);
    List<Card> viewCard(Long userId);


}
