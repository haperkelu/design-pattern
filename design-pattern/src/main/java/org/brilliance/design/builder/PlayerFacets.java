/**   
* @Title: Builder.java 
* @Package org.brilliance.design 
* @Description: TODO
* @author Pie.Li   
* @date 2013-12-20 下午10:49:07 
* @version V1.0   
*/
package org.brilliance.design.builder;

/**
 * 
 * Being a good player requires talents, stamina, mentality, team-work
 * 
 * 
 * @author Pie.Li
 *
 */
public class PlayerFacets {
	
	public PlayerFacets(Builder builder) {
		this.talents = builder.talents;
		this.stamina = builder.stamina;
		this.mentality = builder.mentality;
		this.teamWork = builder.teamWork;
	}

	private final int talents;
	private final int stamina;
	private final int mentality;
	private final int teamWork;
	
	public static class Builder{
		
		private int talents;
		private int stamina;
		private int mentality;
		private int teamWork;
		
		public Builder(){			
		}
		
		public Builder talents(int tal){
			this.talents = tal;
			return this;
		}
		
		public Builder stamina(int sta){
			this.stamina = sta;
			return this;
		}
		
		public Builder mentality(int men){
			this.mentality = men;
			return this;
		}
		
		public Builder teamwork(int tw){
			this.teamWork = tw;
			return this;
		}
		
		public PlayerFacets build() {
			return new PlayerFacets(this);
		}
		
	} 
	
}
