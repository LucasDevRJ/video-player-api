package video.player.api.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Comment {
    private String title;
    private String description;
    private int duration;
    private String urlVideo;
    private Date upload;
    private int numberOfViews;
    private List<Comment> comments = new ArrayList();

    public Comment(String title, String description, int duration, String urlVideo, Date upload, int numberOfViews, List<Comment> comments) {
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.urlVideo = urlVideo;
        this.upload = upload;
        this.numberOfViews = numberOfViews;
        this.comments = comments;
    }

    public Comment() {

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

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
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
}
