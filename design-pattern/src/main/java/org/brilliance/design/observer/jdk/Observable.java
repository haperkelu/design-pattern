/**   
* @Title: Observerable.java 
* @Package org.brilliance.design.observer.jdk 
* @Description: TODO
* @author PAI LI   
* @date 2014-5-22 上午10:41:04 
* @version V1.0   
*/
package org.brilliance.design.observer.jdk;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author PAI LI
 *
 */
public class Observable {

	private Collection<Observer> observers;
	private Lock addObserverLock = new ReentrantLock();
	
	@SuppressWarnings("unused")
	private boolean stateChanged = false;
	
	public Observable() {
		this.observers = new ArrayList<Observer>();
	}

	public void addObserver(Observer observer) {

		if(!observers.contains(observer)){
			addObserverLock.lock();
			if(!observers.contains(observer)) {
				observers.add(observer);
			}
			addObserverLock.unlock();
		}
	}
	
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
	
	public void triggerChange(EventCodeGroup eventCodeGroup, Object passingParameter) {
		synchronized(this){
			this.setStateChanged();
			notifyObservers(eventCodeGroup, passingParameter);
			this.resetState();
		}
	}
	
	public void setStateChanged(){
		this.stateChanged = true;
	}
	
	public void resetState() {
		this.stateChanged = false;
	}
	
	private void notifyObservers(EventCodeGroup eventCode, Object passingParameter) {
		Object[] snapShot = observers.toArray();		
		
		//side effect: 1. new observer could not get notified 2. just removed observer gets notified unexpectedly
		for(Object item: snapShot) {
			((Observer)item).onChange(buildEachEventArgs(eventCode, passingParameter));
		}
	}
	
	private EventArgs buildEachEventArgs(EventCodeGroup eventCodeValue, Object passingParameter) {
		EventArgs eachEventArgs = EventArgsFactory.createEventArgs(eventCodeValue);
		eachEventArgs.setPassingArguments(passingParameter);
		return eachEventArgs;
	}

}
