/**   
* @Title: Customer_New.java 
* @Package org.brilliance.design.relationships 
* @Description: TODO
* @author PAI LI   
* @date 2014-5-24 下午5:11:36 
* @version V1.0   
*/
package org.brilliance.design.relationships;

import java.util.HashSet;
import java.util.Set;

/**
 * @author PAI LI
 *
 */
public class Customer {
	private Set<CustomerOrderRelationship> relations = new HashSet<CustomerOrderRelationship>();
	
	public Customer(String id) {
		this.id = id;
	}
	private String id;
	/**
	 * @return the name
	 */
	public String getId() {
		return this.id;
	}
	
	@Override
	public int hashCode() {
		return this.getId() == null ? 0: this.getId().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		return this.getId().equals(((Order) obj).getId());
	}
	
	public void addOrder(Order order){
		order.addCustomer(this);
		this.relations.add(new CustomerOrderRelationship(this, order));
	}
	
	public void removeOrder(Order order) {
		order.removeCustomer(this);
		this.relations.remove(new CustomerOrderRelationship(this, order));
	}
	
}
