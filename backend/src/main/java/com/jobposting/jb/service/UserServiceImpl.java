

package com.jobposting.jb.service;

import com.jobposting.jb.model.User;
import com.jobposting.jb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User register(User user) {
        return userRepository.save(user);
    }

    @Override
    public User login(String username, String password) {
        Optional<User> optionalUser = userRepository.findByUsername(username);
        return optionalUser.filter(user -> user.getPassword().equals(password)).orElse(null);
    }

    @Override
    public boolean resetPassword(String email, String newPassword) {
        Optional<User> optionalUser = userRepository.findByEmail(email);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            user.setPassword(newPassword);
            userRepository.save(user);
            return true;
        }
        return false;
    }
}
