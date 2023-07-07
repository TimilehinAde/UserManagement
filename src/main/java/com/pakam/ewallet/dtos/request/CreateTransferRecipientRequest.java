package com.pakam.ewallet.dtos.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreateTransferRecipientRequest {
    private Long userId;
    private String bankName;
    private String accountNumber;

}
