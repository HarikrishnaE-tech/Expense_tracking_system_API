package spring.Expensetracking.responsestructure;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class Expensestructure<T> {

	private HttpStatus status;
	private String message;
	private Double amount;
	private Double budget;
	private LocalDate date;
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Double getBudget() {
		return budget;
	}
	public void setBudget(Double budget) {
		this.budget = budget;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Expensestructure(HttpStatus status, String message, Double amount, Double budget, LocalDate date) {
		super();
		this.status = status;
		this.message = message;
		this.amount = amount;
		this.budget = budget;
		this.date = date;
	}
	public Expensestructure() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Expensestructure [status=" + status + ", message=" + message + ", amount=" + amount + ", budget="
				+ budget + ", date=" + date + "]";
	}
	
	
	
	
}
