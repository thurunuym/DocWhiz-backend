package DABS.DABS.service.impl;

import org.springframework.stereotype.Service;

import DABS.DABS.model.Patient;
import DABS.DABS.repository.PatientRepository;
import DABS.DABS.service.PatientService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService{

    private final PatientRepository patientRepository;

    @Override
    public Patient registerPatient(Patient patient) {
        // Add validations later
        return patientRepository.save(patient);
    }

    @Override
        public Patient getPatientByUserName(String username) {
        return patientRepository.findByUsername(username)
            .orElseThrow(() -> new RuntimeException("Patient not found with username: " + username));
    }

}


//So when you add @Service, Spring automatically manages the class — creates an object of it and injects it wherever needed.
//No need to manually create new ServiceClass() — Spring will do it.

//This is a Lombok annotation (Lombok is a Java library that helps remove boilerplate code).
//It automatically creates a constructor only for the fields that are final or @NonNull.

