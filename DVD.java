/**
 * 
 */
package task4;

/**
 * @author hguo1339
 *
 */
public class DVD extends Media implements Playable {
	protected String format;
    protected int runningtime;
    
	public DVD(String t, int r, String f) {
		super(t);
		format = f;
		title = t;
		setRunningTime(r);
	}
	public String getFormat() {
		return format;
	}
	public int getRunningTime() {
		return runningtime;
	}
	public void setRunningTime(int r) {
		runningtime = r;
	}
}
