/**   
* @Title: BBCNewsPublisher.java 
* @Package org.brilliance.design.observer 
* @Description: TODO
* @author Pie.Li   
* @date 2014-3-28 下午5:27:00 
* @version V1.0   
*/
package org.brilliance.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pie.Li
 *
 */
public class BBCNewsPublisher implements InformationPublisher {

	private List<Subscriber> subscribers = new ArrayList<Subscriber>();
	
	public void addSubscriber(Subscriber s) {
		subscribers.add(s);
	}

	public void notifySubscribers(EventArgs event) {
		for(Subscriber item: subscribers){
			if(event.getEventCode().equalsIgnoreCase("create")){
				item.onCreateNews(event);
			} else if(event.getEventCode().equalsIgnoreCase("update")){
				item.onUpdateNews(event);
			}
		}
	}

	public void removeSubscriber(Subscriber s) {
		subscribers.remove(s);
	}

}
