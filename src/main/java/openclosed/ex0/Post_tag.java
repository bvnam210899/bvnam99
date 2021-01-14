package openclosed.ex0;

import single.responsibility.cohension.ex3.Database;

public class Post_tag implements IPost{
    @Override
    public void CreatePost(Database db, String postMessage) {
        db.addAsTag(postMessage);
    }
}
