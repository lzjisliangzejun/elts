package com.example.eltss.bean;

import java.io.Serializable;

import com.example.eltss.bean.User;

public class ExamInfo implements Serializable{
	/**
 "course":"android",
 "total":20,
 "time":10,
 "question":"android.json"
	 */
	private String course;
	private int total;
	private int time;
	private String question;
	private User user; 
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public ExamInfo(){
		
	}
    
	public ExamInfo(String course, int total, int time, String question,
			User user) {
		super();
		this.course = course;
		this.total = total;
		this.time = time;
		this.question = question;
		this.user = user;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	@Override
	public String toString() {
		int userId=1001;
		if(user != null){
			userId=user.getId();
		}
		
		return "考试科目:"+this.course+"\t 考生编号:"+userId+"\n"
				+"考题数量:"+this.total+"\t 考试时间:"+this.time+"分钟";
	}
	public static void main(String[] args) {
		User user= new User();
		System.out.print(user.toString());
	}
	

}
