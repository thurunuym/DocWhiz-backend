package DABS.DABS.model;

import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "patients") 
public class Patient {
    @Id
    private String id;
    
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private Date dob; // date of birth
    private String gender;
    private String contactNumber;
    private String address;
}


//@Data	Automatically generates getters, setters, toString(), equals(), and hashCode().

