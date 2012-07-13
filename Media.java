/**
 * 
 */
package task4;

/**
 * @author hguo1339
 *
 */
public abstract class Media implements Comparable<Media> {
	protected String title;
	public Media(String s) {
		title = s;
	}
	public int compareTo(Media m) {
		return this.title.compareTo(m.title);
	}
	public String getTitle() {
		return title;
	}
}
