package headfirst.observer.weather;

/**
 * 观察者需要对通知进行反应
 */
public interface Observer {
	/**
	 * 这样传递参数不是很好，因为监测指标会发生变化
	 * 并且对于有些观察者说，多给数据是一种累赘
	 * @param temp
	 * @param humidity
	 * @param pressure
	 */
	public void update(float temp, float humidity, float pressure);
}
