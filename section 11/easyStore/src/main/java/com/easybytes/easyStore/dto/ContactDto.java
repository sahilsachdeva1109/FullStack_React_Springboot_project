package com.easybytes.easyStore.dto;

import jakarta.validation.constraints.*;

public class ContactDto {

    @NotBlank(message = "Name cannot be empty")
    @Size(min = 5, max = 30, message = "Name must be between 5 and 30 ")
    private String name;
    @NotBlank(message = "Email cannot be empty")
    @Email(message = "invalid email address")
    private String email;
    @NotBlank(message = "Mobile number cannot be empty")
    @Pattern(regexp = "^\\d{10}$", message = "mobile no must be 10 digits")
    private String mobileNumber;
    @NotBlank(message = "Message cannot be empty")
    @Size(min = 5, max = 500, message = "Message must be between 5 and 500 ")
    private String message;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
