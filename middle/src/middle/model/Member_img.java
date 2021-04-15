package middle.model;

import java.io.Serializable;

public class Member_img implements Serializable{
	private int image_id;
	private int user_id;
	private String url;
	
	public Member_img() {
		super();
	}
	public Member_img(int image_id, int user_id, String url) {
		super();
		this.image_id = image_id;
		this.user_id = user_id;
		this.url = url;
	}
	public int getImage_id() {
		return image_id;
	}
	public void setImage_id(int image_id) {
		this.image_id = image_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
}
