package vn.com.native_query.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.com.entity.User;
import vn.com.native_query.model.New_User_Model;
import vn.com.native_query.model.UserDTO;
import vn.com.native_query.model.UserModel;
import vn.com.native_query.service.UserService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/demo/native/")
public class UserController {

    @Autowired
    UserService userService;

    /*
     *  Using UserModel (interface) as a customize model
     */
    @GetMapping("get-all-interface")
    public ResponseEntity<List<UserModel>> getAllUserInterface() {
        List<UserModel> rs = null;
        try {
            rs = userService.getAllUserInterface();
        } catch (Exception e) {
            System.out.println(e);
        }
        return new ResponseEntity<>(rs, HttpStatus.OK) ;
    }

    /*
     *  Using User entity
     */
    @GetMapping("get-all-entity")
    public ResponseEntity<List<User>> getAllUserEntity() {
        List<User> rs = null;
        try {
            rs = userService.getAllUserEntity();
        } catch (Exception e) {
            System.out.println(e);
        }
        return new ResponseEntity<>(rs, HttpStatus.OK) ;
    }
    /*
     *  Using User Entity as a model
     */
    @GetMapping("find-all-jpa")
    public ResponseEntity<List<User>> findAll() {
        List<User> rs = null;
        try {
            rs = userService.findAll();
        } catch (Exception e) {
            System.out.println(e);
        }
        return new ResponseEntity<>(rs, HttpStatus.OK) ;
    }

    /*
     *  Using UserDTO: to get param from client
     */
    @PostMapping("get-one-by-id")
    public ResponseEntity<Optional<User>> findById(@RequestBody UserDTO dto) {
        Optional<User> rs = null;
        try {
            rs = userService.findById(dto);
        } catch (Exception e) {
            System.out.println(e);
        }
        return new ResponseEntity<>(rs, HttpStatus.OK) ;
    }

    @PostMapping("get-user-by-id")
    public ResponseEntity<New_User_Model> getUserById(@RequestBody UserDTO dto) {
        New_User_Model rs = null;
        try {
            rs = userService.getUserById(dto);
        } catch (Exception e) {
            System.out.println(e);
        }
        return new ResponseEntity<>(rs, HttpStatus.OK) ;
    }
}
