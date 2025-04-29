package DABS.DABS.model;

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
@Document(collection = "doctors")
public class Doctor {
    @Id
    private String id;

    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String email;
    private String contactNumber;
    private String licenseNumber;
    private String specialization;
    private String description;
    private double rating; // average rating (from patient feedbacks)

    private String availableTime; // (optional for now: format "9AM-5PM")
    private Integer slotsPerHour; // how many patients per hour doctor can handle

    private String createdAt;
}
