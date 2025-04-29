package DABS.DABS.repository;

import DABS.DABS.model.Appointment;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AppointmentRepository extends MongoRepository<Appointment, String> {
    List<Appointment> findByPatientId(String patientId);
    List<Appointment> findByDoctorId(String doctorId);
    List<Appointment> findByDate(String date);
    List<Appointment> findByStatus(String status);
    List<Appointment> findByDateAndStatus(String date, String status);
}
