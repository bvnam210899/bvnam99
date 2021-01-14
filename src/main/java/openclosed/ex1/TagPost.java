package openclosed.ex1;


import openclosed.ex0.IPost;
import single.responsibility.cohension.ex3.Database;

public class TagPost implements IPost {

    @Override
    public void CreatePost(Database db, String postMessage) {
        db.addAsTag(postMessage);
    }
}
