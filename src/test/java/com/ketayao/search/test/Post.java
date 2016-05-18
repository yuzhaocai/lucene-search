package com.ketayao.search.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.ketayao.search.Searchable;

/**
 * 测试索引的对象
 * @author Winter Lau
 */
public class Post implements Searchable {

	private long id;
	private String title;
	private String body;
		
	public Post(){}
	public Post(long id, String t, String b){
		this.id = id;
		this.title = t;
		this.body = b;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public int compareTo(Searchable o) {
		return 0;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<String> storeFields() {
		return Arrays.asList("title");
	}

	public List<String> indexFields() {
		return Arrays.asList("title","body");
	}

	public Map<String, String> extendStoreDatas() {
		return null;
	}

	public Map<String, String> extendIndexDatas() {
		return null;
	}

	public List<? extends Searchable> listAfter(long id, int count) {
		return null;
	}
	public float boost() {
		return 1.0f;
	}
	public void setTest(String test){
		
	}
}
