package br.com.scorpion.userapi.api.users.controller;

import br.com.scorpion.userapi.api.users.resource.IUserResource;
import br.com.scorpion.userapi.api.users.service.impl.UserServiceImpl;
import br.com.scorpion.userapi.shared.domain.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController implements IUserResource {

    @Autowired
    public UserController(UserServiceImpl userServiceImpl) {
    }

    @Override
    public ResponseEntity<?> listAllUsers() {
        return ResponseEntity.ok(User.builder().build());
    }
}
