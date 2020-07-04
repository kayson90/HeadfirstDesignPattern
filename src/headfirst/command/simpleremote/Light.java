package headfirst.command.simpleremote;

/**
 * 接收者，自己的方法，就是进行操作
 * 怎么操作只有命令知道，调用者是不知道的。
 * 调用者和接收者进行解耦
 * 具体的命令和接收者是耦合的
 */
public class Light {

	public Light() {
	}

	public void on() {
		System.out.println("Light is on");
	}

	public void off() {
		System.out.println("Light is off");
	}
}
