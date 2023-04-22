package co.istad.demothymeleaf.service.impl;

import co.istad.demothymeleaf.model.User;
import co.istad.demothymeleaf.repository.StaticRepository;
import co.istad.demothymeleaf.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final StaticRepository staticRepository;
    @Override
    public List<User> findAllUsers() {
        return staticRepository.getUsers();
    }
}
