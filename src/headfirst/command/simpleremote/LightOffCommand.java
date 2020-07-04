package headfirst.command.simpleremote;

/**
 * 具体命令，只需要实现execute方法
 */
public class LightOffCommand implements Command {
	Light light;

	public LightOffCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.off();
	}
}
