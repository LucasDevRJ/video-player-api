package video.player.api.entities;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_video")
public class Video implements Serializable {
    @Serial
    private static final Integer serialVersionUID = 1;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String email;
    private String senha;
    @ManyToOne
    private Channel channel;
    public Video() {

    }
    public Video(String email, String senha, Channel channel) {
        this.email = email;
        this.senha = senha;
        this.channel = channel;
    }
    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Channel channel = (Channel) o;
        return id.equals(channel.id);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
