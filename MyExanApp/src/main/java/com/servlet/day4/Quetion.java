package com.servlet.day4;

public class Quetion {
	public int id;
	public String quetion;
	public String option1;
	public String option2;
	public String option3;
	public String option4;
	public String right_ans;
	
	public Quetion() {
		super();
	}
	public Quetion(int id, String quetion, String option1, String option2, String option3, String option4,
			String right_ans) {
		super();
		this.id = id;
		this.quetion = quetion;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.right_ans = right_ans;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuetion() {
		return quetion;
	}
	public void setQuetion(String quetion) {
		this.quetion = quetion;
	}
	public String getOption1() {
		return option1;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public String getOption2() {
		return option2;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public String getOption3() {
		return option3;
	}
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	public String getOption4() {
		return option4;
	}
	public void setOption4(String option4) {
		this.option4 = option4;
	}
	public String getRight_ans() {
		return right_ans;
	}
	public void setRight_ans(String right_ans) {
		this.right_ans = right_ans;
	}


	
	

}
