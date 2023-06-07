# spring-boot-validation-request-body
Validate Request Inputs

@NotNull: Marks a field as required and cannot be null.
@NotBlank: Marks a field as required and cannot be blank.
@NotEmpty: Marks a field (including collection, map, or array) as required and cannot be empty.
@Size: Specifies the minimum and/or maximum size of a field.
@Min: Specifies the minimum value of a numeric field.
@Max: Specifies the maximum value of a numeric field.
@Email: Validates that a field is a valid email address.
@Pattern: Specifies a regular expression that a field must match.
@Valid: Indicates that a field should be validated recursively.
@AssertTrue: Validates that a boolean field is true.
@AssertFalse: Validates that a boolean field is false.
@DecimalMin: Specifies the minimum value of a decimal field.
@DecimalMax: Specifies the maximum value of a decimal field.
@Digits: Specifies the number of digits and/or fraction digits for a decimal field.
@Positive: Validates that a numeric field is positive.
@PositiveOrZero: Validates that a numeric field is positive or zero.
@Negative: Validates that a numeric field is negative.
@NegativeOrZero: Validates that a numeric field is negative or zero.
@Future: Validates that a date or time field is in the future.
@Past: Validates that a date or time field is in the past.
@URL: Validates that a field is a valid URL.
@Validated: Indicates that a class or interface should be validated recursively.
@Range: Specifies a range of values for a field.




^: the start of the string
(?=.*\d): at least one digit
(?=.*[a-z]): at least one lowercase letter
(?=.*[A-Z]): at least one uppercase letter
(?=.*[@#$%^&+=!*()]): at least one special character
.{8,}: at least 8 characters long
$: the end of the string


Difference : 
@NotNull : to say that a field must not be null. 
@NotEmpty : to say that a list field must not empty. 
@NotBlank : to say that a string field must not be the empty string (i.e. it must have at least one character).

http://localhost:8080/api/auth/signup

RequestBody:
{
    "username": "testuser",
    "email": "testuser@gmail.com",
    "age": 29,
    "graduationDate": "2018-09-09",
    "password": "silence1234",
    "confirmPassword": "silence1234",
    "address": {}
}

ResponseBody: 400 Bad Request
{
    "errors": [
        "[Address] The city is required.",
        "Password must be 8 characters long and combination of uppercase letters, lowercase letters, numbers, special characters.",
        "[Address] The street name is required."
    ]
}


RequestBody:

{
    "username": "testuser",
    "email": "testuser@gmail.com",
    "age": 29,
    "graduationDate": "2018-09-09",
    "password": "Silence@1234",
    "confirmPassword": "Silence@1234",
    "address": {
        "city": "new york",
        "street": "Franklin St"
    }
}

ResponseBody: 200 OK
User registered Successfully!



