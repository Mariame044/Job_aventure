package odk.apprenant.jobaventure_backend.controller;


import odk.apprenant.jobaventure_backend.model.User;
import odk.apprenant.jobaventure_backend.service.UseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UseService useService;



}
