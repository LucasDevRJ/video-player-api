package video.player.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import video.player.api.dto.AccountDTO;
import video.player.api.entities.Account;
import video.player.api.repository.AccountRepository;
import video.player.api.service.exceptions.ResourceNotFoundException;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AccountService {
    @Autowired
    private AccountRepository repository;

    @Transactional(readOnly = true)
    public List<AccountDTO> findAll() {
        List<Account> list = repository.findAll();
        return list.stream().map(x -> new AccountDTO(x)).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public AccountDTO findById(Integer id) {
        Optional<Account> obj = repository.findById(id);
        Account entity = obj.orElseThrow(()-> new ResourceNotFoundException("Entity not found"));
        return new AccountDTO(entity);
    }
}
