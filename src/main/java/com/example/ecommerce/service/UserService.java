package com.example.ecommerce.service;



import com.example.ecommerce.model.User;
import com.example.ecommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void registerUser(User user) {
        if (userRepository.findByUsername(user.getUsername()) == null) {
            userRepository.save(user);
        } else {
            throw new RuntimeException("Username is already taken");
        }
    }

    public boolean validateUserCredentials(String username, String password) {
        User user = userRepository.findByUsername(username);

        return user != null && password.equals(user.getPassword());
    }

}
