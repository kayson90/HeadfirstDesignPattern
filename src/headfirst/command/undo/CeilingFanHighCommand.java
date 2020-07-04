package headfirst.command.undo;

/**
 * 具体的命令拥有接收者，具体的命令对应的是具体的接收者
 */
public class CeilingFanHighCommand implements Command {
	CeilingFan ceilingFan;
	//保持原来的状态
	int prevSpeed;

	public CeilingFanHighCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	public void execute() {
		//记住原来的状态
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.high();
	}

	/**
	 * 返回到原来的状态
	 */
	public void undo() {
		if (prevSpeed == CeilingFan.HIGH) {
			ceilingFan.high();
		} else if (prevSpeed == CeilingFan.MEDIUM) {
			ceilingFan.medium();
		} else if (prevSpeed == CeilingFan.LOW) {
			ceilingFan.low();
		} else if (prevSpeed == CeilingFan.OFF) {
			ceilingFan.off();
		}
	}
}
