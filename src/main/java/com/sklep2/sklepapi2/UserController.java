package com.sklep2.sklepapi2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("")
    public String main(){
        return "Glowna";

    }
    @GetMapping("api/liczba")
    public int num(){
        return 666;
    }
    @GetMapping("api/users")
    public List<User> showUsers(){
        return userRepository.getUsers();
    }
    @GetMapping("api/products")
    public List<Product> showProucts(){
        return userRepository.getProducts();
    }

}
