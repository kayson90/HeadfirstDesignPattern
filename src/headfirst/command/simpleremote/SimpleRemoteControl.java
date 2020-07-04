package headfirst.command.simpleremote;

import java.util.*;

//
// This is the invoker，是的，这是调用者，1、设置命令 2、执行命令
//
public class SimpleRemoteControl {
	Command slot;

	public SimpleRemoteControl() {}

	public void setCommand(Command command) {
		slot = command;
	}

	public void buttonWasPressed() {
		slot.execute();
	}
}
