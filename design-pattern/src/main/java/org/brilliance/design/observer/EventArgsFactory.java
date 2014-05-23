/**   
* @Title: EventArgsFactor.java 
* @Package org.brilliance.design.observer.jdk 
* @Description: TODO
* @author PAI LI   
* @date 2014-5-22 下午1:18:21 
* @version V1.0   
*/
package org.brilliance.design.observer;

/**
 * @author PAI LI
 *
 */
public final class EventArgsFactory {

	public static EventArgs createEventArgs(String eventCodeValue) {
		return new EventArgs(EventCodeGroup.get(eventCodeValue));
	}	
	
	public static EventArgs createEventArgs(EventCodeGroup eventCodeGroup) {
		return new EventArgs(eventCodeGroup);
	}	
	
}
