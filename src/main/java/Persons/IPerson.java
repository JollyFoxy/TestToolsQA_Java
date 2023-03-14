package Persons;

import UserGenerator.UG;

public interface IPerson {
    Person person =new Person(UG.genName(), UG.genLastName(),
            UG.genUserName(),UG.genStreet(),
            UG.genStreet(), UG.genEmail(),
            UG.genPhone(), UG.genAge());
}