package video.player.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import video.player.api.entities.Account;
import video.player.api.repository.AccountRepository;

import java.util.List;

@RestController
@RequestMapping(value = "/accounts")
public class AccountController {
    @Autowired
    private AccountRepository repository;

    @GetMapping
    ResponseEntity<List<Account>> findAll(){
       List<Account> list =  repository.findAll();
        return ResponseEntity.ok().body(list);
    }
}
