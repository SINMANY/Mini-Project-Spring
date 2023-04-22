package co.istad.demothymeleaf.service;

import co.istad.demothymeleaf.model.User;

import java.util.List;

public interface UserService {
    // find all users
    // then we need to use POJO, so you can create Model to define how feature is
    List<User> findAllUsers();
}
