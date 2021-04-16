package middle.model;

import java.io.Serializable;

public class Member_Product implements Serializable{
	private int user_id;
	private String ID;
	private String password;
	private String nickname;
	private String email;
	private String phone_number;
	private String address;
	private int holding_coin;
	private int evaluation;
	private String name;
	private int product_id;
	private String product_name;
	private String title;
	private String sale_date;
	private int buyer_id;
	private String image_url;
	public Member_Product() {
		super();
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getHolding_coin() {
		return holding_coin;
	}
	public void setHolding_coin(int holding_coin) {
		this.holding_coin = holding_coin;
	}
	public int getEvaluation() {
		return evaluation;
	}
	public void setEvaluation(int evaluation) {
		this.evaluation = evaluation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
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
	public String getSale_date() {
		return sale_date;
	}
	public void setSale_date(String sale_date) {
		this.sale_date = sale_date;
	}
	public int getBuyer_id() {
		return buyer_id;
	}
	public void setBuyer_id(int buyer_id) {
		this.buyer_id = buyer_id;
	}
	public String getImage_url() {
		return image_url;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	public Member_Product(int user_id, String iD, String password, String nickname, String email, String phone_number,
			String address, int holding_coin, int evaluation, String name, int product_id, String product_name,
			String title, String sale_date, int buyer_id, String image_url) {
		super();
		this.user_id = user_id;
		ID = iD;
		this.password = password;
		this.nickname = nickname;
		this.email = email;
		this.phone_number = phone_number;
		this.address = address;
		this.holding_coin = holding_coin;
		this.evaluation = evaluation;
		this.name = name;
		this.product_id = product_id;
		this.product_name = product_name;
		this.title = title;
		this.sale_date = sale_date;
		this.buyer_id = buyer_id;
		this.image_url = image_url;
	}
	
}
