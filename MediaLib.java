/**
 * 
 */
package task4;
import java.util.TreeSet;
import java.util.Iterator;

/**
 * @author hguo1339
 *
 */
public class MediaLib {
	private TreeSet<Media> myLib;
	public MediaLib() {
		myLib = new TreeSet<Media>();
		
	}
	public void add(Media m) {
		myLib.add(m);
	}
	public Media getByTitle(String t) {
		for (Media m : myLib) {
			if (m.title == t) {
				return m;
			}
		}
		return null;
	}
	public Media get(int i) { //get the ith item, starting from 0
		if (i >= 0) {
			Media m = new Book("Dummy", "Dummy"); //dummy media item to use later
			int count = 0;
			if (i < myLib.size()) {
				Iterator<Media> itr = myLib.iterator();
				while (itr.hasNext() && count < i+1) {
					m = itr.next(); //where dummy item is used
					count++;			
				}
				return m;
			}
		}
		return null;
	}
}
