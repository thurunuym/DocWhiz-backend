package DABS.DABS.service;

import DABS.DABS.model.Appointment;
import java.util.List;

public interface AppointmentService {
    Appointment createAppointment(Appointment appointment);
    List<Appointment> getAppointmentsForPatient(String patientId);
    List<Appointment> getAppointmentsForDoctor(String doctorId);
}
