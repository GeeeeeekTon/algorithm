package dm.cmd;
/**
 *
 * @author Smile.Wu
 * @version 2015-9-25
 */
public interface Invoker {

	public boolean action();
	
	public void addCommand(Command c);
}
