package video.player.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import video.player.api.entities.Channel;

@Repository
public interface ChannelRepository extends JpaRepository<Channel, Integer> {
}
