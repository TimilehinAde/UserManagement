package com.pakam.ewallet.data.models;

import com.pakam.ewallet.enums.Role;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@RequiredArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message = "This field is required")
    @NotEmpty(message = "This field is not required")
    private String userName;
    @NotNull(message = "This field is required")
    @NotEmpty(message = "This field is not required")
    private String firstName;
    @NotNull(message = "This field is required")
    @NotEmpty(message = "This field is not required")
    private String lastName;

    @NotNull(message = "This field is required")
    @NotEmpty(message = "This field is not required")
    @Email(message = "This field requires a valid email address")
    private String emailAddress;
    private String password;
    private Boolean isDisabled = true;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_Id", referencedColumnName = "id")
    private List<Card> cardList ;

    public User(String userName, String firstName, String lastName, String emailAddress,  String password) {
        this.userName=userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.password = password;
    }
}
