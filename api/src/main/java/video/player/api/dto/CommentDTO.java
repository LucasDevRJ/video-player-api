package video.player.api.dto;

import video.player.api.entities.Comment;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentDTO implements Serializable {
    @Serial
    private static final Integer serialVersionUID= 1;
    private Integer id;
    private String title;
    private String description;
    private Integer duration;
    private String urlVideo;
    private Date upload;
    private int numberOfViews;
    private List<Comment> comments = new ArrayList();

    public CommentDTO(String title, String description, Integer duration, String urlVideo, Date upload, int numberOfViews, List<Comment> comments) {
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.urlVideo = urlVideo;
        this.upload = upload;
        this.numberOfViews = numberOfViews;
        this.comments = comments;
    }

    public CommentDTO() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
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

    public int getNumberOfViews() {
        return numberOfViews;
    }

    public void setNumberOfViews(int numberOfViews) {
        this.numberOfViews = numberOfViews;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
