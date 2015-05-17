
public class BookImpl implements Book{
    private String title;
    private String author;
    public BookImpl(String myTitle, String myAuthor)
    {
        title = myTitle;
        author = myAuthor;
    }
    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }


}
