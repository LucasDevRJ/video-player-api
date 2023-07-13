package video.player.api.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import video.player.api.entities.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
}
