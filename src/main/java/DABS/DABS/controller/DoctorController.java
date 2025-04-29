package DABS.DABS.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import DABS.DABS.model.Doctor;
import DABS.DABS.service.DoctorService;
import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("api/doctors")
@RequiredArgsConstructor
public class DoctorController {
    private final DoctorService doctorService;;

    @PostMapping("register")
    public ResponseEntity<Doctor> registerDoctor(@RequestBody Doctor doctor) {
        return ResponseEntity.ok(doctorService.registerDoctor(doctor));
    }   

    @GetMapping("/{username}")
    public ResponseEntity<Doctor> getDoctor(@PathVariable String username){
        return ResponseEntity.ok(doctorService.getDoctorByUsername(username));
    }
}
