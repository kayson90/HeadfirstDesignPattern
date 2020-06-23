package headfirst.observer.weather;

/**
 * 主题用来，注册，删除，通知
 * 其实我认为这里的subject没有必要抽象出来
 */
public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
