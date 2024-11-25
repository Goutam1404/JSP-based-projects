package master.dto;

public class BookingDto {
	private String cust_id;
	private String book_id;

	private String tour_name;
	public String cid() {
		return cust_id;
	}
	public void setCid(String cust_id) {
		this.cust_id = cust_id;
	}
	public String bookid() {
		return book_id;
	}
	public void setBookid(String book_id) {
		this.book_id = book_id;
	}
	public String getTname() {
		return tour_name;
	}
	public void setTname(String tour_name) {
		this.tour_name = tour_name;
	}
	public double getTprice() {
		return total_price;
	}
	public void setTprice(float Totalprice2) {
		this.total_price = Totalprice2;
	}
	private double total_price;

	

}
