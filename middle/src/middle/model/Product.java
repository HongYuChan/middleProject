package middle.model;

import java.io.Serializable;

public class Product implements Serializable{
	private int product_id;
	private int user_id;
	private int category_id;
	private String product_name;
	private String title;
	private String product_info;
	private int min_price;
	private String pay_method;
	private String create_date;
	private String sale_date;
	private char status;
	private int buyer_id;
	private int sale_price;
	public Product() {
		super();
	}
	public Product(int product_id, int user_id, int category_id, String product_name, String title, String product_info,
			int min_price, String pay_method, String create_date, String sale_date, char status, int buyer_id,
			int sale_price) {
		super();
		this.product_id = product_id;
		this.user_id = user_id;
		this.category_id = category_id;
		this.product_name = product_name;
		this.title = title;
		this.product_info = product_info;
		this.min_price = min_price;
		this.pay_method = pay_method;
		this.create_date = create_date;
		this.sale_date = sale_date;
		this.status = status;
		this.buyer_id = buyer_id;
		this.sale_price = sale_price;
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
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getProduct_info() {
		return product_info;
	}
	public void setProduct_info(String product_info) {
		this.product_info = product_info;
	}
	public int getMin_price() {
		return min_price;
	}
	public void setMin_price(int min_price) {
		this.min_price = min_price;
	}
	public String getPay_method() {
		return pay_method;
	}
	public void setPay_method(String pay_method) {
		this.pay_method = pay_method;
	}
	public String getCreate_date() {
		return create_date;
	}
	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}
	public String getSale_date() {
		return sale_date;
	}
	public void setSale_date(String sale_date) {
		this.sale_date = sale_date;
	}
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	public int getBuyer_id() {
		return buyer_id;
	}
	public void setBuyer_id(int buyer_id) {
		this.buyer_id = buyer_id;
	}
	public int getSale_price() {
		return sale_price;
	}
	public void setSale_price(int sale_price) {
		this.sale_price = sale_price;
	}
	
}
