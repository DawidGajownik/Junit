package pl.coderslab.tydzien3.z1sonarlint;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.util.logging.Logger;

@Data
@AllArgsConstructor

public class Person {
    //Logger logger = Logger.getLogger(getClass().getName());
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

//    public String getFirstName() {
//        logger.info("Getting FirsName");
//        return this.firstName;
//    }

//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return this.lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }

    public String getInitials() {
        return this.firstName.charAt(0) + "." + this.lastName.charAt(0) + ".";
    }

}
