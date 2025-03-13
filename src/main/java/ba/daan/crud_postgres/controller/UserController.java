package ba.daan.crud_postgres.controller;

import ba.daan.crud_postgres.model.User;
import ba.daan.crud_postgres.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
    @RequestMapping("/api/v1/users")
    public class UserController {

        @Autowired
        private UserService userService;

        @PostMapping
        public ResponseEntity<User> createUser(@RequestBody User user) {
            return new ResponseEntity<>(userService.createUser(user), HttpStatus.CREATED);
        }

        @GetMapping
        public ResponseEntity<List<User>> getAllUsers() {
            return ResponseEntity.ok(userService.getAllUsers());
        }

        @GetMapping("/{id}")
        public ResponseEntity<User> getUserById(@PathVariable Long id) {
            return userService.getUserById(id)
                    .map(ResponseEntity::ok)
                    .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }

        @PutMapping("/{id}")
        public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User userDetails) {
            return ResponseEntity.ok(userService.updateUser(id, userDetails));
        }

        @PatchMapping("/{id}")
        public ResponseEntity<User> patchUser(@PathVariable Long id, @RequestBody Map<String, Object> updates) {
            return ResponseEntity.ok(userService.patchUser(id, updates));
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
            userService.deleteUser(id);
            return ResponseEntity.noContent().build();
        }
    }
