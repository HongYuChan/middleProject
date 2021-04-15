package middle.model;

import java.io.Serializable;

public class Image implements Serializable{
	private int image_id;
	private int product_id;
	private String image_url;
	public Image(int image_id, int product_id, String image_url) {
		super();
		this.image_id = image_id;
		this.product_id = product_id;
		this.image_url = image_url;
	}
	public Image() {
		super();
	}
	public int getImage_id() {
		return image_id;
	}
	public void setImage_id(int image_id) {
		this.image_id = image_id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getImage_url() {
		return image_url;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
}
