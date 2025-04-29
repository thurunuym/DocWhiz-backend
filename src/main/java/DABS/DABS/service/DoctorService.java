package DABS.DABS.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import DABS.DABS.model.Doctor;
import DABS.DABS.repository.DoctorRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DoctorService {
   
    private final DoctorRepository doctorRepository;

    public Doctor registerDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    public Doctor getDoctorByUsername(String username) {
        Optional<Doctor> optionalDoctor = doctorRepository.findByUsername(username);
        return optionalDoctor.orElseThrow(() -> new RuntimeException("Doctor not found"));
    }
}

