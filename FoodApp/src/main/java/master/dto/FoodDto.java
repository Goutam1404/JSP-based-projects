package master.dto;

public class FoodDto {
	private String fid;
	private String fname;
	public String getFid() {
		return fid;
	}
	public void setFid(String fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public double getFprice() {
		return fprice;
	}
	public void setFprice(double fprice2) {
		this.fprice = fprice2;
	}
	private double fprice;

}
