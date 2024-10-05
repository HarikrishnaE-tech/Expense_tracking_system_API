package spring.Expensetracking.model;

import org.springframework.stereotype.Component;

@Component
public class UserDTO {

private String username;
private String email;
private int expid;
private int budgetid;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getExpid() {
	return expid;
}
public void setExpid(int expid) {
	this.expid = expid;
}
public int getBudgetid() {
	return budgetid;
}
public void setBudgetid(int budgetid) {
	this.budgetid = budgetid;
}
public UserDTO(String username, String email, int expid, int budgetid) {
	super();
	this.username = username;
	this.email = email;
	this.expid = expid;
	this.budgetid = budgetid;
}
public UserDTO() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "UserDTO [username=" + username + ", email=" + email + ", expid=" + expid + ", budgetid=" + budgetid + "]";
}

	
	
	
}
