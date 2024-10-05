package spring.Expensetracking.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component

public class ExpenseDTO {
   private int userid;
   private int cateid;
   private String description;
   private Double amount;
   private LocalDate date;
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public int getCateid() {
	return cateid;
}
public void setCateid(int cateid) {
	this.cateid = cateid;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Double getAmount() {
	return amount;
}
public void setAmount(Double amount) {
	this.amount = amount;
}
public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date) {
	this.date = date;
}
public ExpenseDTO(int userid, int cateid, String description, Double amount, LocalDate date) {
	super();
	this.userid = userid;
	this.cateid = cateid;
	this.description = description;
	this.amount = amount;
	this.date = date;
}
public ExpenseDTO() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "ExpenseDTO [userid=" + userid + ", cateid=" + cateid + ", description=" + description + ", amount=" + amount
			+ ", date=" + date + "]";
}
   
   
	
	
	
}
