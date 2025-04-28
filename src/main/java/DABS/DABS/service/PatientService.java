package DABS.DABS.service;

import DABS.DABS.model.Patient;

public interface PatientService {
    Patient registerPatient(Patient patient);
    Patient getPatientByUserName(String username);
}
