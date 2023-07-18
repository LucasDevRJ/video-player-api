package video.player.api.dto;

import video.player.api.entities.Account;
import video.player.api.entities.Channel;
import video.player.api.entities.Video;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ChannelDTO implements Serializable {
    @Serial
    private static final Integer serialVersionUID= 1;
    private Integer id;
    private String name;
    private Account account;
    private List<Video> videos = new ArrayList();
    public ChannelDTO() {

    }
    public ChannelDTO(String name, Account account, List<Video> videos) {
        this.name = name;
        this.account = account;
        this.videos = videos;
    }
}
