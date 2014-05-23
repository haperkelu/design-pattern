/**   
* @Title: EventArgs.java 
* @Package org.brilliance.design.observer.jdk 
* @Description: TODO
* @author PAI LI   
* @date 2014-5-22 下午1:07:34 
* @version V1.0   
*/
package org.brilliance.design.observer;

/**
 * @author PAI LI
 *
 */
public class EventArgs {

	public EventArgs(EventCodeGroup eventCodeGroup) {
		this.eventCodeGroup = eventCodeGroup;
	}
	
	private EventCodeGroup eventCodeGroup;
	/**
	 * @return the eventCode
	 */
	public EventCodeGroup getEventCodeGroup() {
		return eventCodeGroup;
	}
	
	private Object passingArguments;
	/**
	 * @return the passingArguments
	 */
	public Object getPassingArguments() {
		return passingArguments;
	}

	/**
	 * @param passingArguments the passingArguments to set
	 */
	public void setPassingArguments(Object passingArguments) {
		this.passingArguments = passingArguments;
	}
}
