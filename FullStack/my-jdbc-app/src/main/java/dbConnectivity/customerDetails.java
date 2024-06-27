package dbConnectivity;

public class customerDetails {

	private String courseName;
	private String purchasedDate;
	private String amount;
	private String location;
	
	protected String getCourseName() {
		return courseName;
	}
	protected void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	protected String getPurchasedDate() {
		return purchasedDate;
	}
	protected void setPurchasedDate(String purchasedDate) {
		this.purchasedDate = purchasedDate;
	}
	protected String getAmount() {
		return amount;
	}
	protected void setAmount(String amount) {
		this.amount = amount;
	}
	protected String getLocation() {
		return location;
	}
	protected void setLocation(String location) {
		this.location = location;
	}
	
	

}
