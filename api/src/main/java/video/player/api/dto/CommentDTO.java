package video.player.api.dto;

import java.util.Date;

public class CommentDTO {
    private String titulo;
    private String descricao;
    private int duracao;
    private String urlVideo;
    private Date upload;
    private int numeroVisualizacoes;
    //private List<Comments> comentarios;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getUrlVideo() {
        return urlVideo;
    }

    public void setUrlVideo(String urlVideo) {
        this.urlVideo = urlVideo;
    }

    public Date getUpload() {
        return upload;
    }

    public void setUpload(Date upload) {
        this.upload = upload;
    }

    public int getNumeroVisualizacoes() {
        return numeroVisualizacoes;
    }

    public void setNumeroVisualizacoes(int numeroVisualizacoes) {
        this.numeroVisualizacoes = numeroVisualizacoes;
    }
}
