package middle.model;

import java.io.Serializable;

public class Video implements Serializable{
	
	private int video_id;
	private int product_id;
	private String video_url;
	private String video_name;
	
	public Video() {
		
	}
	
	public Video(int video_id, int product_id, String video_url, String video_name) {
		this.video_id = video_id;
		this.product_id = product_id;
		this.video_url = video_url;
		this.video_name = video_name;
	}

	public int getVideo_id() {
		return video_id;
	}

	public void setVideo_id(int video_id) {
		this.video_id = video_id;
	}

	
	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getVideo_url() {
		return video_url;
	}

	public void setVideo_url(String video_url) {
		this.video_url = video_url;
	}

	public String getVideo_name() {
		return video_name;
	}

	public void setVideo_name(String video_name) {
		this.video_name = video_name;
	}
	
	
	
}
