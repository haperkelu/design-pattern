/**   
* @Title: Customer.java 
* @Package org.brilliance.design.relationships 
* @Description: TODO
* @author PAI LI   
* @date 2014-5-24 下午5:10:45 
* @version V1.0   
*/
package org.brilliance.design.relationships;

import java.util.HashSet;
import java.util.Set;


/**
 * @author PAI LI
 *
 */
public class Order {
	
	private Set<CustomerOrderRelationship> relations = new HashSet<CustomerOrderRelationship>();
	private String id;
	public Order(String id) {
		this.id = id;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
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
	
	public void addCustomer(Customer customer) {
		customer.addOrder(this);
		this.relations.add(new CustomerOrderRelationship(customer, this));
	}
	
	public void removeCustomer(Customer customer) {
		customer.removeOrder(this);
		this.relations.remove(new CustomerOrderRelationship(customer, this));
	}
}
