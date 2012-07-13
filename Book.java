/**
 * 
 */
package task4;

/**
 * @author hguo1339
 *
 */
public class Book extends Media {
	protected String author;
	public Book(String t, String a) {
		super(t);
		author = a;
	}
}
