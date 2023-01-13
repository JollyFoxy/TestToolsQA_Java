package Persons;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.With;

@AllArgsConstructor
@Getter @With
public class Person {
    private String name;
    private String lastName;
    private String userName;
    private String PermanentAddress;
    private String CurrentAddress;
    private String email;
    private String phoneNumber;
    private int age;
}