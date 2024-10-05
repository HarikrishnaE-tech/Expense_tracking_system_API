package spring.Expensetracking.model;

import org.springframework.stereotype.Component;

@Component
public class CategoryDTO {

	private String Catename;
	private int expid;
	public String getCatename() {
		return Catename;
	}
	public void setCatename(String catename) {
		Catename = catename;
	}
	public int getExpid() {
		return expid;
	}
	public void setExpid(int expid) {
		this.expid = expid;
	}
	public CategoryDTO(String catename, int expid) {
		super();
		Catename = catename;
		this.expid = expid;
	}
	public CategoryDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CategoryDTO [Catename=" + Catename + ", expid=" + expid + "]";
	}
	
	
	
}
