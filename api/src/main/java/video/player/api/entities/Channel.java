package video.player.api.entities;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table(name = "tb_chanell")
public class Channel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String descricao;
    //private ArrayList<Video> videosEnviados = new ArrayList<Video>();
    private ArrayList<Account> inscritos = new ArrayList<Account>();
    public Channel(String name, String descricao, ArrayList<Account> inscritos) {
        this.name = name;
        this.descricao = descricao;
        this.inscritos = inscritos;
    }
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
