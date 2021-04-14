package middle.model;

import java.io.Serializable;

public class Deal implements Serializable{
	private int deal_id;
	private int product_id;
	private int user_id;
	private int status;
	public Deal(int deal_id, int product_id, int user_id, int status) {
		super();
		this.deal_id = deal_id;
		this.product_id = product_id;
		this.user_id = user_id;
		this.status = status;
	}
	public Deal() {
		super();
	}
	@Override
	public String toString() {
		return "Deal [deal_id=" + deal_id + ", product_id=" + product_id + ", user_id=" + user_id + ", status=" + status
				+ "]";
	}
	public int getDeal_id() {
		return deal_id;
	}
	public void setDeal_id(int deal_id) {
		this.deal_id = deal_id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
}
