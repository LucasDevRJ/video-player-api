package video.player.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import video.player.api.entities.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {
}
