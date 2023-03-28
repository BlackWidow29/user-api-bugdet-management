package br.com.scorpion.userapi.api.users.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/user")
public interface IUserResource {

    @GetMapping
    ResponseEntity<?> listAllUsers();

}
