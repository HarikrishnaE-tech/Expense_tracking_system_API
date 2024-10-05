package spring.Expensetracking.model;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Component
@Entity
public class Expense {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int expenseid;
private String description;
private  Double amount;
private LocalDate Date;


@ManyToOne

User user;

@ManyToOne

Category category;

public int getExpenseid() {
	return expenseid;
}

public void setExpenseid(int expenseid) {
	this.expenseid = expenseid;
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
	return Date;
}

public void setDate(LocalDate date) {
	Date = date;
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

public Category getCategory() {
	return category;
}

public void setCategory(Category category) {
	this.category = category;
}

public Expense(int expenseid, String description, Double amount, LocalDate date, User user, Category category) {
	super();
	this.expenseid = expenseid;
	this.description = description;
	this.amount = amount;
	Date = date;
	this.user = user;
	this.category = category;
}

public Expense() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Expense [expenseid=" + expenseid + ", description=" + description + ", amount=" + amount + ", Date=" + Date
			+ ", user=" + user + ", category=" + category + "]";
}



}