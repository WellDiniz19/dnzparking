package br.com.dinizbit.dnzparking.web.controller;

import br.com.dinizbit.dnzparking.entity.User;
import br.com.dinizbit.dnzparking.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/users")
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<User> created(@RequestBody User user){
        User usuario = userService.save(user);
    return ResponseEntity.status(HttpStatus.CREATED).body(usuario);
    }

    @GetMapping("/{user_id}")
    public ResponseEntity<User> getById(@PathVariable Long user_id){
        User usuario = userService.searchById(user_id);
        return ResponseEntity.ok(usuario);
    }
    @PatchMapping("/{user_id}")
    public ResponseEntity<User> updatePassword(@PathVariable Long user_id, @RequestBody User user){
        User usuario = userService.editPassword(user_id, user.getPassword());
        return ResponseEntity.ok(usuario);
    }
    @GetMapping
    public ResponseEntity<List<User>> getAll() {
        List<User> usuarios = userService.searchAll();
        return ResponseEntity.ok(usuarios);
    }
}
