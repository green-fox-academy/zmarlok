//Create a BlogPost class that has
//an authorName
//a title
//a text
//a publicationDate

package blogpost;

public class BlogPost {

    String author;
    String title;
    String text;
    String publicationDate;

    public BlogPost(){

    }

    public BlogPost(String title, String publicationDate, String author, String text){
        this.title = title;
        this.author = author;
        this.text = text;
        this.publicationDate = publicationDate;
    }

    public void showBlogPosts() {
        System.out.println(title + "\n" + "by: " + author + "\n" + text + "\n" + "Published on: " + publicationDate + "\n");
    }

}

