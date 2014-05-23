/**   
* @Title: EventCodeGroup.java 
* @Package org.brilliance.design.observer.jdk 
* @Description: TODO
* @author PAI LI   
* @date 2014-5-22 下午1:21:16 
* @version V1.0   
*/
package org.brilliance.design.observer;

/**
 * @author PAI LI
 *
 */
public class EventCodeGroup {

	public final static EventCodeGroup ADD = new EventCodeGroup("add");
	public final static EventCodeGroup UPDATE = new EventCodeGroup("update");
	public final static EventCodeGroup DELETE = new EventCodeGroup("delete");
	
	private final static EventCodeGroup[] EVENT_CODE_GROUPS = {ADD, UPDATE, DELETE} ;
	
	private String code;
	
	/**
	 * @return the eventCode
	 */
	public String getCode() {
		return code;
	}

	private EventCodeGroup(String eventCode) {
		this.code = eventCode;
	}	
	
	public static EventCodeGroup eventCodeAt(int index) {
		return EVENT_CODE_GROUPS[index];
	}
	
	public static EventCodeGroup get(String eventCodeValue) {
		for(EventCodeGroup item: EVENT_CODE_GROUPS){
			if(item.getCode().equalsIgnoreCase(eventCodeValue)){
				return item;
			}
		}
		throw new UnsupportedOperationException("EventCode not found error!");
	}  
	
}
