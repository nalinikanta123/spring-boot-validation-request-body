package com.dreamthoughts.springvalidaterequestbody.model;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressDTO {

	@NotBlank(message = "[Address] The city is required.")
	private String city;

	@NotBlank(message = "[Address] The street name is required.")
	private String street;
}
