package com.toe.sycweb.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="menu")
public class Menu {

	@Id
	private String id;
	
	private String title;
	private String displayImgUrl;
	private String content;
	private List<String> contentImgUrlList;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDisplayImgUrl() {
		return displayImgUrl;
	}
	public void setDisplayImgUrl(String displayImgUrl) {
		this.displayImgUrl = displayImgUrl;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public List<String> getContentImgUrlList() {
		return contentImgUrlList;
	}
	public void setContentImgUrlList(List<String> contentImgUrlList) {
		this.contentImgUrlList = contentImgUrlList;
	}
	
	
}