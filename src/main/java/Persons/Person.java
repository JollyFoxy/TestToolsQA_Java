package Persons;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.With;

/**Пользователь*/
@AllArgsConstructor
@Getter @With
public class Person {
    private String name;
    private String lastName;
    private String userName;
    private String permanentAddress;
    private String currentAddress;
    private String email;
    private String phoneNumber;
    private int age;
    private String password;
    private int salary;
    private String department;
}