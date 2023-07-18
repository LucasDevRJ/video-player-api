package video.player.api.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import video.player.api.entities.Video;

@Repository
public interface VideoRepository extends JpaRepository<Video, Integer> {
}
