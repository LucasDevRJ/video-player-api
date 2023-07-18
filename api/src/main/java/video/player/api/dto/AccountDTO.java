package video.player.api.dto;

import video.player.api.entities.Account;
import video.player.api.entities.Channel;

import java.io.Serial;
import java.io.Serializable;

public class AccountDTO implements Serializable {
    @Serial
    private static final Integer serialVersionUID= 1;
    private Integer id;
    private String name;
    private Channel channel;

    public AccountDTO() {
    }

    public AccountDTO(Integer id, String name, Channel channel) {
        this.id = id;
        this.name = name;
        this.channel = channel;
    }
    public AccountDTO(Account entity){
        this.id = entity.getId();
        this.name = entity.getName();
        this.channel = entity.getChannel();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }
}
