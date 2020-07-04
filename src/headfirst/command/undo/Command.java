package headfirst.command.undo;

/**
 * 这个例子要重点关注undo
 */
public interface Command {
	public void execute();
	public void undo();
}
