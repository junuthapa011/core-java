package instagramPosts;

import java.time.LocalDateTime;

public class InstagramPost {
    //initializing the variables
    private String name;
    private long id;
    private String postImageUrl;
    private String postCaption;
    private LocalDateTime postedDateTime;

    // Setters and getters
    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setId(long id){
        this.id=id;
    }

    public long getId(){
        return id;
    }

    public void setPostImageUrl(String postImageUrl){
        this.postImageUrl=postImageUrl;
    }

    public String getPostImageUrl(){
        return postImageUrl;
    }

    public void setPostCaption(String postCaption){
        this.postCaption=postCaption;
    }

    public String getPostCaption(){
        return postCaption;
    }

    public void setPostedDateTime(LocalDateTime postedDateTime) {
        this.postedDateTime = postedDateTime;
    }

    public LocalDateTime getPostedDateTime() {
        return postedDateTime;
    }


    @Override
    public String toString() {
        return "InstagramPost{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", postImageUrl='" + postImageUrl + '\'' +
                ", postCaption='" + postCaption + '\'' +
                ", postedDateTime=" + postedDateTime +
                '}';
    }
}
