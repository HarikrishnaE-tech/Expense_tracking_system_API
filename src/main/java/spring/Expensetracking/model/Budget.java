package spring.Expensetracking.model;

import java.time.YearMonth;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Component
@Entity
public class Budget {
@Id
@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int budid;
	private Double budgamount;
	private YearMonth monthlybudget;
	
	@OneToOne
	User user;

	public int getBudid() {
		return budid;
	}

	public void setBudid(int budid) {
		this.budid = budid;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Budget(int budid, Double budgamount, YearMonth monthlybudget, User user) {
		super();
		this.budid = budid;
		this.budgamount = budgamount;
		this.monthlybudget = monthlybudget;
		this.user = user;
	}

	public Budget() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Budget [budid=" + budid + ", budgamount=" + budgamount + ", monthlybudget=" + monthlybudget + ", user="
				+ user + "]";
	}

	
}
