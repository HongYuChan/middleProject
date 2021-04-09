package middle.model;

import java.io.Serializable;

public class NoticeBoard implements Serializable{
	private int notice_id;
	private int manager_id;
	private String notice_title;
	private String notice_contents;
	private String notice_writer;
	private String notice_date;
	private int notice_hitcount;
	
	public NoticeBoard() {
		super();
	}
	public NoticeBoard(int notice_id, int manager_id, String notice_title, String notice_contents, String notice_writer,
			String notice_date, int notice_hitcount) {
		super();
		this.notice_id = notice_id;
		this.manager_id = manager_id;
		this.notice_title = notice_title;
		this.notice_contents = notice_contents;
		this.notice_writer = notice_writer;
		this.notice_date = notice_date;
		this.notice_hitcount = notice_hitcount;
	}
	public int getNotice_id() {
		return notice_id;
	}
	public void setNotice_id(int notice_id) {
		this.notice_id = notice_id;
	}
	public int getManager_id() {
		return manager_id;
	}
	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}
	public String getNotice_title() {
		return notice_title;
	}
	public void setNotice_title(String notice_title) {
		this.notice_title = notice_title;
	}
	public String getNotice_contents() {
		return notice_contents;
	}
	public void setNotice_contents(String notice_contents) {
		this.notice_contents = notice_contents;
	}
	public String getNotice_writer() {
		return notice_writer;
	}
	public void setNotice_writer(String notice_writer) {
		this.notice_writer = notice_writer;
	}
	public String getNotice_date() {
		return notice_date;
	}
	public void setNotice_date(String notice_date) {
		this.notice_date = notice_date;
	}
	public int getNotice_hitcount() {
		return notice_hitcount;
	}
	public void setNotice_hitcount(int notice_hitcount) {
		this.notice_hitcount = notice_hitcount;
	}
	
}
