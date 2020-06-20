package headfirst.observer.weatherobservable;

import java.util.Observable;

/**
 * 具体的观察者，这里是继承类，注册和删除的工作不需要做了，通知也只需要调用父类方法就可以了
 * 只能进行继承，违背了面向接口编程，违背了多用组合的原则
 */
public class WeatherData extends Observable {
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() { }

	/**
	 * 注意的这里的使用1，改标志位 2，通知
	 */
	public void measurementsChanged() {
		setChanged();
		//这里没有带任何参数，参数是在可观察者里面调用获取的
		notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
}
