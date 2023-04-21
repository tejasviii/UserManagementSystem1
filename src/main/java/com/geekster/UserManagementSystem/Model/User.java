package com.example.usermanagementapp.Model;


import com.geekster.UserManagementSystem.Model.Email;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "user-tbl")
public class User {
    @Id
    private Integer userId;
    @NotNull
    private String userName;

    @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$", message = "Date of birth must be in the format yyyy-MM-dd")
    private String dateOfBirth;
    @Email
    private String email;
    @Size(min = 12, max = 12, message = "Phone number must be 12 digits and first two numbers are country and rest are number")
    private String phoneNumber;
    private String date;
    private String   time;

}