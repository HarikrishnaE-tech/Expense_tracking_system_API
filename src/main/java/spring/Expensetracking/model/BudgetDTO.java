package spring.Expensetracking.model;

import java.time.YearMonth;

import org.springframework.stereotype.Component;

@Component
public class BudgetDTO {
 private int  userid;
 private Double budgamount;
 private YearMonth monthlybudget;
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public Double getBudgamount() {
	return budgamount;
}
public void setBudgamount(Double budgamount) {
	this.budgamount = budgamount;
}
public YearMonth getMonthlybudget() {
	return monthlybudget;
}
public void setMonthlybudget(YearMonth monthlybudget) {
	this.monthlybudget = monthlybudget;
}
public BudgetDTO(int userid, Double budgamount, YearMonth monthlybudget) {
	super();
	this.userid = userid;
	this.budgamount = budgamount;
	this.monthlybudget = monthlybudget;
}
public BudgetDTO() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "BudgetDTO [userid=" + userid + ", budgamount=" + budgamount + ", monthlybudget=" + monthlybudget + "]";
}
 
 
 
 
	
	
}
