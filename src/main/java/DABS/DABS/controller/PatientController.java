package DABS.DABS.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import DABS.DABS.model.Patient;
import DABS.DABS.service.PatientService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/patients")
@RequiredArgsConstructor
public class PatientController {

    private final PatientService patientService;


    @PostMapping("/register")
    public ResponseEntity<Patient> registerPatient(@RequestBody Patient patient) {
        
        return ResponseEntity.ok(patientService.registerPatient(patient));
}

    @GetMapping("/{username}")
    public ResponseEntity<Patient> getPatient(@PathVariable String username){
        return ResponseEntity.ok(patientService.getPatientByUserName(username));
    }
}

//@RestController
//Tells Spring BootThis class will handle HTTP requests and send JSON responses.
//It's a combination of @Controller + @ResponseBody.
//Automatically converts your method return values into JSON.

//@RequiredArgsConstructor

//Auto-creates a constructor and injects the PatientService object automatically.
//So no need to manually create new PatientService().



//@RequestBody Patient patient
//The JSON body from the client (Frontend) will be automatically converted into a Patient object.

//ResponseEntity.ok()
//It's a standard way of sending back a HTTP Response with 200 OK status and the data (the created Patient).

//patientService.registerPatient(patient)
//Calls the service layer to save the patient in the database.