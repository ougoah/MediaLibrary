/**
 * 
 */
package task4;

/**
 * @author hguo1339
 *
 */
public class CD extends Media implements Playable {
	protected String genre;
	protected int runningtime;
	public CD(String t, int r, String g) {
		super(t);
		setRunningTime(r);
		getRunningTime();
		getGenre();
	}
	public String getGenre() {
		return genre;
	}
	@Override
	public int getRunningTime() {
		return runningtime;
	}
	@Override
	public void setRunningTime(int r) {
		runningtime = r;
	}
}
