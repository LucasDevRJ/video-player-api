package video.player.api.entities;

import jakarta.persistence.*;

import java.io.Serial;

@Entity
@Table(name = "tb_video")
public class Video {
    @Serial
    private static final Integer serialVersionUID = 1;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String email;
    private String senha;
    @ManyToOne
    private Channel channel;
    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }
}
