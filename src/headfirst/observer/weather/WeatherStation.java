package headfirst.observer.weather;

public class WeatherStation {
	/**
	 * 观察者模式也很简单，比如我让你做一个订阅、发布的功能，你怎么做？
	 * 是不是会把观察者收消息定义为接口，
	 * 是不是会有被观察的，用来维护观察者列表，发布消息
	 * 所以问题就变得很清晰明了了这里Subject不是一个消息，而是一个被观察者。
	 * 其实被观察者是不用抽象的，因为只有一个嘛，扩展的可能行也不大。
	 * @param args
	 */
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		//在构造函数中进行的注册
		CurrentConditionsDisplay currentDisplay =
			new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
