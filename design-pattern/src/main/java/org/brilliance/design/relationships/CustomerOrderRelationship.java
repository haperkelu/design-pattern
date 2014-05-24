package org.brilliance.design.relationships;

public class CustomerOrderRelationship {
	
	public CustomerOrderRelationship(Customer customer, Order order) {
		this.customer = customer;
		this.order = order;
	}
	
	private Customer customer;
	private Order order;
	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @return the order
	 */
	public Order getOrder() {
		return order;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = prime * 1 + ((this.getCustomer() == null) ? 0 : customer.hashCode());;
		return prime * result + ((this.getOrder() == null) ? 0 : order.hashCode());  
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		CustomerOrderRelationship other = (CustomerOrderRelationship) obj;
		return this.getCustomer().equals(other.getCustomer()) && this.getOrder().equals(other.getOrder());
	}

}