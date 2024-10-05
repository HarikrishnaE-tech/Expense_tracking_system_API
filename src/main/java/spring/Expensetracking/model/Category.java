package spring.Expensetracking.model;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Component
@Entity
public class Category {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int cateid;
private String catename;

	@OneToMany
List<Expense> expense;

	public int getCateid() {
		return cateid;
	}

	public void setCateid(int cateid) {
		this.cateid = cateid;
	}

	public String getCatename() {
		return catename;
	}

	public void setCatename(String catename) {
		this.catename = catename;
	}

	public List<Expense> getExpense() {
		return expense;
	}

	public void setExpense(List<Expense> expense) {
		this.expense = expense;
	}

	public Category(int cateid, String catename, List<Expense> expense) {
		super();
		this.cateid = cateid;
		this.catename = catename;
		this.expense = expense;
	}

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Category [cateid=" + cateid + ", catename=" + catename + ", expense=" + expense + "]";
	}
	
	
	
}

	