/**   
* @Title: EventArgs.java 
* @Package org.brilliance.design.observer 
* @Description: TODO
* @author Pie.Li   
* @date 2014-3-28 下午5:34:51 
* @version V1.0   
*/
package org.brilliance.design.observer;

/**
 * @author Pie.Li
 *
 */
public class EventArgs {

	private String eventCode;
	private Object[] args;

	/**
	 * @return the eventCode
	 */
	public String getEventCode() {
		return eventCode;
	}

	/**
	 * @param eventCode the eventCode to set
	 */
	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}

	/**
	 * @return the args
	 */
	public Object[] getArgs() {
		return args;
	}

	/**
	 * @param args the args to set
	 */
	public void setArgs(Object[] args) {
		this.args = args;
	}	
	
}
