package web.fatec.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import web.fatec.dto.UserDTO;
import web.fatec.entities.UserModel;
import web.fatec.service.impl.UserServiceImp;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserServiceImp userService;

    @GetMapping
    public ResponseEntity<Iterable<UserModel>> getAllUser(){
        return ResponseEntity.status(HttpStatus.OK).body(userService.getAllUser());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserModel> getUserById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(userService.searchUserById(id));
    }

    @PostMapping
    public ResponseEntity<UserModel> createNewUser(@RequestBody @Valid UserDTO userDTO){
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.cadasterNewUser(userDTO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserModel> updateUser(@PathVariable Long id, @RequestBody UserDTO userDTO){
        return ResponseEntity.status(HttpStatus.OK).body(userService.updateProfileUser(id, userDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id){
        userService.deleteProfileUser(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
