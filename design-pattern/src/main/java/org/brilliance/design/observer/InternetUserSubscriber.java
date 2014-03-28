/**   
* @Title: InternetUserSubscriber.java 
* @Package org.brilliance.design.observer 
* @Description: TODO
* @author Pie.Li   
* @date 2014-3-28 下午5:30:30 
* @version V1.0   
*/
package org.brilliance.design.observer;

/**
 * @author Pie.Li
 *
 */
public class InternetUserSubscriber implements Subscriber {

	public void onCreateNews(EventArgs e) {
		System.out.println(e.getEventCode() + " is triggered");
		System.out.println("I am awared of this news and I will read it");
	}

	public void onUpdateNews(EventArgs e) {
		System.out.println(e.getEventCode() + " is triggered");
		System.out.println("I am awared of this update and I will get into it");
	}

}
