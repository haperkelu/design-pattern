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
				
	}

}
