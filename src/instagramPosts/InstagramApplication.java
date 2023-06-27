package instagramPosts;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalUnit;

public class InstagramApplication {
    public static void main(String[] args) {
        //Post with current date
        InstagramPost firstPost = new InstagramPost();
        firstPost.setId(1);
        firstPost.setName("John");
        firstPost.setPostImageUrl("https://cdn.britannica.com/84/73184-050-05ED59CB/Sunflower-field-Fargo-North-Dakota.jpg");
        firstPost.setPostCaption("Sunflowers");
        firstPost.setPostedDateTime(LocalDateTime.now());
        LocalDateTime datenow = firstPost.getPostedDateTime();
        System.out.println(getTimeAgo(datenow));



        //Post with one hour ago date
        InstagramPost secondPost = new InstagramPost();
        secondPost.setId(2);
        secondPost.setName("Harris");
        secondPost.setPostImageUrl("https://contentgrid.homedepot-static.com/hdus/en_US/DTCCOMNEW/Articles/discover-the-secret-language-of-flowers-2022-hero.jpeg");
        secondPost.setPostCaption("Red roses");
        secondPost.setPostedDateTime(LocalDateTime.now().minusHours(1));
//        LocalDateTime hourAgoTime = (secondPost.getPostedDateTime().minusHours(1));
//        System.out.println(hourAgoTime);
        System.out.println(getTimeAgo(secondPost.getPostedDateTime()));


        //Post with 1 day ago date
        InstagramPost thirdPost = new InstagramPost();
        thirdPost.setId(3);
        thirdPost.setName("George");
        thirdPost.setPostImageUrl("https://hips.hearstapps.com/hmg-prod/images/types-of-garden-flowers-purple-allium-1674847068.jpeg");
        thirdPost.setPostCaption("Lilac");
        thirdPost.setPostedDateTime(LocalDateTime.now().minusDays(1));
//        System.out.println(thirdPost);


        //Post with one month ago date
        InstagramPost fourthPost = new InstagramPost();
        fourthPost.setId(4);
        fourthPost.setName("Camille");
        fourthPost.setPostImageUrl("https://www.metoffice.gov.uk/binaries/content/gallery/metofficegovuk/hero-images/weather/optical-effects/rainbows/rainbow-over-the-yellowstone-landscape-in-wyoming.jpg");
        fourthPost.setPostCaption("Rainbow");
        fourthPost.setPostedDateTime(LocalDateTime.now().minusMonths(1));
//        System.out.println(fourthPost);


        //Post with one year ago date
        InstagramPost fifthPost = new InstagramPost();
        fifthPost.setId(5);
        fifthPost.setName("Jane");
        fifthPost.setPostImageUrl("https://blog.japanwondertravel.com/wp-content/uploads/2021/05/Bonsai-treee.jpg");
        fifthPost.setPostCaption("Bonsai Plants");
        fifthPost.setPostedDateTime(LocalDateTime.now().minusYears(1));

    }
    public static String getTimeAgo(LocalDateTime dateTime) {
        LocalDateTime now = LocalDateTime.now();
        Duration duration = Duration.between(dateTime, now);
        long seconds = duration.getSeconds();

        if (seconds < 60) {
            return "Just Now";
        } else if (seconds < 3600) {
            long minutes = seconds / 60;
            return minutes + " minute" + (minutes > 1 ? "s" : "") + " ago";
        } else if (seconds < 86400) {
            long hours = seconds / 3600;
            return hours + " hour" + (hours > 1 ? "s" : "") + " ago";
        } else if (seconds < 2592000) {
            long days = seconds / 86400;
            return days + " day" + (days > 1 ? "s" : "") + " ago";
        } else if (seconds < 31536000) {
            long months = seconds / 2592000;
            return months + " month" + (months > 1 ? "s" : "") + " ago";
        } else {
            long years = seconds / 31536000;
            return years + " year" + (years > 1 ? "s" : "") + " ago";
        }
    }

}
