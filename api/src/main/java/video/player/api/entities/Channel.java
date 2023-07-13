package video.player.api.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.ArrayList;

@Entity
@Table(name = "tb_chanell")
public class Channel {
    private String name;
    private String descricao;
    //private ArrayList<Video> videosEnviados = new ArrayList<Video>();
    private ArrayList<Account> inscritos = new ArrayList<Account>();
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescricao() {
        return descricao;
    }

    public ArrayList<Account> getInscritos() {
        return inscritos;
    }
}
