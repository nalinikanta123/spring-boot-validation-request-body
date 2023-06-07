package com.dreamthoughts.springvalidaterequestbody.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignupRequest {

	@NotBlank(message = "The username is required.")
	@Size(min = 3, max = 20, message = "The username must be from 3 to 20 characters.")
	private String username;

	@NotEmpty(message = "The email is required.")
	@Email(message = "The email is not a valid email.")
	private String email;

	@NotNull(message = "The age is required.")
	@Min(value = 18, message = "The age must be equal or greater than 18")
	private int age;

	@NotNull(message = "The graduation date is required.")
	@Past(message = "The graduation date must be in the past.")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date graduationDate;

	@NotBlank(message = "The password is required.")
	@Pattern(regexp = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!*()]).{8,}$", message = "Password must be 8 characters long and combination of uppercase letters, lowercase letters, numbers, special characters.")
	private String password;

	@NotBlank(message = "The confirm Password is required.")
	private String confirmPassword;

	@Valid
	@NotNull(message = "The address is required.")
	private AddressDTO address;

}
