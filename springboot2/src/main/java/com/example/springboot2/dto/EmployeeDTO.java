package com.example.springboot2.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class EmployeeDTO {
    @Min(value = 10,message = "less than 10")
    @Max(value = 100, message = "greater than 100")
    private int id;

    @Size(min = 2, max=100, message = "INVALID")
    @NotBlank(message = "Not Blank")
    @Pattern(regexp = "^[A-Za-z ]{2,30}$" , message = "Only Alpha")
    private String name;

    @NotBlank(message = "Address is required")
    private String address;

    @Min(value = 1000, message = "Salary must be at least 1000")
    private double salary;
}
