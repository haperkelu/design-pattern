/**   
* @Title: Boot.java 
* @Package org.brilliance.design 
* @Description: TODO
* @author Pie.Li   
* @date 2013-12-20 下午10:58:18 
* @version V1.0   
*/
package org.brilliance.design;

import org.brilliance.design.builder.PlayerFacets;
import org.brilliance.design.observer.jdk.EventArgs;
import org.brilliance.design.observer.jdk.EventCodeGroup;
import org.brilliance.design.observer.jdk.Observable;
import org.brilliance.design.observer.jdk.Observer;

/**
 * 
 * @author Pie.Li
 *
 */
public class Boot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//builder pattern
		PlayerFacets instance = new PlayerFacets.Builder().talents(1).stamina(2).mentality(1).teamwork(2).build();
		
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
		publisher.changeState(EventCodeGroup.ADD, "one item is added");
		
	}

}
