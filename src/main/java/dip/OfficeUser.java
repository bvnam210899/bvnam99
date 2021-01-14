package dip;

import openclosed.ex0.IPost;
import openclosed.ex0.Post;
import single.responsibility.cohension.ex3.Database;

public class OfficeUser {
    public void publishNewPost() {
        Database db = new Database();
        String postMessage = "example message";
//        Post post = new Post();
        IPost post = new Post();
        post.CreatePost(db, postMessage);
    }
}
