
package com.jobposting.jb.service;

import com.jobposting.jb.model.User;

public interface UserService {
    User register(User user);
    User login(String username, String password);
    boolean resetPassword(String email, String newPassword);
}
