//Create a few blog post objects:
//"Lorem Ipsum" titled by John Doe posted at "2000.05.04."
//Lorem ipsum dolor sit amet.
//"Wait but why" titled by Tim Urban posted at "2010.10.10."
//A popular long-form, stick-figure-illustrated blog about almost everything.
//"One Engineer Is Trying to Get IBM to Reckon With Trump" titled by William Turton at "2017.03.28."
//Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.


package blogpost;

public class Main {

    public static void main(String[] args) {

        BlogPost firstBlogPost = new BlogPost();
        firstBlogPost.author = "John Doe";
        firstBlogPost.publicationDate = "04.05.2000";
        firstBlogPost.title = "Lorem Ipsum";
        firstBlogPost.text = "Lorem ipsum dolor sit amet.";
        firstBlogPost.showBlogPosts();

        BlogPost secondBlogspot = new BlogPost("Wait but why", "10.10.2010", "Tim Urban",  "A popular long-form, stick-figure-illustrated blog about almost everything.");
        secondBlogspot.showBlogPosts();

        BlogPost thirdBlogspot = new BlogPost("One Engineer Is Trying to Get IBM to Reckon With Trump", "28.03.2017", "William Turton", "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention.\nWhen I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.");
        thirdBlogspot.showBlogPosts();
    }
}
