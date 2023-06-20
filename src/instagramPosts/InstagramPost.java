package instagramPosts;

import java.time.LocalDate;

public class InstagramPost {
    //initializing the variables
    private String name;
    private long id;
    private String postImageUrl;
    private String postCaption;

    // Setters and getters
    public void setName(){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setId(){
        this.id=id;
    }

    public long getId(){
        return id;
    }

    public void setPostImageUrl(){
        this.postImageUrl=postImageUrl;
    }

    public String getPostImageUrl(){
        return postImageUrl;
    }

    public void setPostCaption(){
        this.postCaption=postCaption;
    }

    public String getPostCaption(){
        return postCaption;
    }



}
