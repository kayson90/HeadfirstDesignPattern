package headfirst.observer.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 观察者模式可以扩展开来，从这个角度来说观察者模式无处不在：
 * 事件监听机制也是属于观察者模式，VUE也是观察者模式
 * 响应式编程也属于观察者模式
 * 消息队列的发布和订阅模式也属于观察者模式
 */
public class SwingObserverExample
{
	JFrame frame;

	public static void main(String[] args)
	{
		SwingObserverExample example = new SwingObserverExample();
		example.go();
	}

	public void go()
	{
		frame = new JFrame();

		JButton button = new JButton("Should I do it?");
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		frame.getContentPane().add(BorderLayout.CENTER, button);

		// Set frame properties
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.CENTER, button);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	class AngelListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			System.out.println("Don't do it, you might regret it!");
		}
	}

	class DevilListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			System.out.println("Come on, do it!");
		}
	}
}
