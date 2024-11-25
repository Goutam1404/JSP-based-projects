package master.dto;

public class Tourdto {
	private String tour_id;
	private String tour_name;
	public String getTid() {
		return tour_id;
	}
	public void setTid(String tour_id) {
		this.tour_id = tour_id;
	}
	public String getTname() {
		return tour_name;
	}
	public void setTname(String tour_name) {
		this.tour_name = tour_name;
	}
	public double getTprice() {
		return price;
	}
	public void setTprice(float Tourprice2) {
		this.price = Tourprice2;
	}
	private double price;
}
