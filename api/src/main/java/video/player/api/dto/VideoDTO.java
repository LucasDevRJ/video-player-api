package video.player.api.dto;

import video.player.api.entities.Video;

import java.io.Serial;

public class VideoDTO {
    @Serial
    private static final Integer serialVersionUID= 1;
    private Integer id;
    private String email;
    private String password;

    public VideoDTO(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public VideoDTO() {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
