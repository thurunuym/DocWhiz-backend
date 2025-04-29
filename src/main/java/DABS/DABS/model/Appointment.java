package DABS.DABS.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "appointments")
public class Appointment {

    @Id
    private String id;

    private String appointmentNo;
    private String patientId;
    private String doctorId;
    private String date;      // Can be LocalDate if you prefer
    private String timeSlot;
    private String reasonForVisit;
    private String status;    // PENDING, ACCEPTED, REJECTED, etc.

    private List<String> documents; // filenames or URLs

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
