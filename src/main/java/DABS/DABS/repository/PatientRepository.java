package DABS.DABS.repository;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import DABS.DABS.model.Patient;

public interface PatientRepository extends MongoRepository<Patient, String> {
    // Custom query methods can be defined here if needed
    // For example, findByUsername, findByEmail, etc.



    Optional<Patient> findByUsername(String username);
}



//MongoRepository provides ready-made methods like:save(),findById(),deleteById(),findAll()
//So you don't have to write queries manually! 
//Patient = the type of object you want to store in the database.
//String = the type of ID (@Id) used in the Patient class 
//Return type is Optional<Patient>, not just Patient.
//Optional is like a special wrapper for a value that may or may not exist.Avoids NullPointerException crashes.