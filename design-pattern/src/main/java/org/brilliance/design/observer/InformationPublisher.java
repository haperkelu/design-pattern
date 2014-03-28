/**   
* @Title: Publisher.java 
* @Package org.brilliance.design.observer 
* @Description: TODO
* @author Pie.Li   
* @date 2014-3-28 下午5:09:22 
* @version V1.0   
*/
package org.brilliance.design.observer;

/**
 * @author Pie.Li
 *
 */
public interface InformationPublisher {

	void addSubscriber(Subscriber s);
	void removeSubscriber(Subscriber s);
	void notifySubscribers(EventArgs event);
	
}
