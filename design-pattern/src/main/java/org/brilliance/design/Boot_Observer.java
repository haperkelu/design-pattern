/**   
* @Title: Boot_Observer.java 
* @Package org.brilliance.design 
* @Description: TODO
* @author PAI LI   
* @date 2014-5-23 下午10:09:46 
* @version V1.0   
*/
package org.brilliance.design;

import org.brilliance.design.observer.EventArgs;
import org.brilliance.design.observer.EventCodeGroup;
import org.brilliance.design.observer.Observable;
import org.brilliance.design.observer.Observer;

/**
 * @author PAI LI
 *
 */
public class Boot_Observer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		create_one_publisher_and_two_emotional_subscribers();
		
	}
	
	
	/**
	 * 
	 */
	private static void create_one_publisher_and_two_emotional_subscribers() {
		Observable publisher = new Observable();
		publisher.addObserver(new Observer() {
			public void onChange(EventArgs eventArgs) {
				System.out.println("I am happy");
				System.out.println(eventArgs.getEventCodeGroup().getCode());
				System.out.println(eventArgs.getPassingArguments());
			}
		});
		publisher.addObserver(new Observer() {
			public void onChange(EventArgs eventArgs) {
				System.out.println("I am sad");
				System.out.println(eventArgs.getEventCodeGroup().getCode());
				System.out.println(eventArgs.getPassingArguments());
			}
		});		
		publisher.triggerChange(EventCodeGroup.ADD, "one item is added");
	}

}
