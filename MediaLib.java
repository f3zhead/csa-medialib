
/*************************************
 * Sample solution for Activity 2.5.7
 *
 * A MediaLib class for the MediaLibrary program
 * 
 * See comments for each step
 **************************************/
public class MediaLib {
  private Book book;
  private Movie movie;
  private static int numEntries;

  // pretty useless if you ask me
  public void addBook(Book b) {
    if (this.book == null) {
      book = b;
      MediaLib.numEntries++;
    } else {
      System.out.println("u did bad");
    }
  }

  public void addMovie(Movie m) {
    if (this.movie == null) {
      movie = m;
      MediaLib.numEntries++;

    } else {
      System.out.println("no u");
    }
  }

  // new step 18-22
  /*
   * test scenario
   * public void testBook(Book tester)
   * {
   * tester.setTitle("Animal Farm");
   * // show state chagne with one of the following
   * System.out.println(" in test: " + tester);
   * System.out.println(" in test: " + tester.getTitle());
   * }
   */

  @Override
  public String toString() {
    String info = "";

    // Step 5, avoid crashing by testing that book is not null before using its
    // toString method
    if (book != null)
      info += "Book: " + book + "\n";

    return info;
  }

  public static int getNumEntries() {
    return MediaLib.numEntries;
  }
}
