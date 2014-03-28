/**   
* @Title: Subscriber.java 
* @Package org.brilliance.design.observer 
* @Description: TODO
* @author Pie.Li   
* @date 2014-3-28 下午5:23:33 
* @version V1.0   
*/
package org.brilliance.design.observer;

/**
 * @author Pie.Li
 *
 */
public interface Subscriber {

	
	void onCreateNews(EventArgs e);
	void onUpdateNews(EventArgs e);
	
}
