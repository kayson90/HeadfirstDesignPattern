package headfirst.observer.weather;

/**
 * 主题用来，注册，删除，通知
 */
public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
