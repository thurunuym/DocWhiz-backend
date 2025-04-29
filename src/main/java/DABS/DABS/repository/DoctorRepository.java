package DABS.DABS.repository;

import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

import DABS.DABS.model.Doctor;

public interface DoctorRepository extends MongoRepository<Doctor,String>{
    Optional<Doctor> findByUsername(String username);
}


