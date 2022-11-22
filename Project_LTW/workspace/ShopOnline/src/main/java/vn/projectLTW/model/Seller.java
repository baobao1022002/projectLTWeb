package vn.projectLTW.model;

public class Seller {
	private int selelrId;
	private String sellerName;
	private String images;
	private int status;
	public Seller() {
		super();
	}
	public Seller(int selelrId, String sellerName, String images, int status) {
		super();
		this.selelrId = selelrId;
		this.sellerName = sellerName;
		this.images = images;
		this.status = status;
	}
	public int getSelelrId() {
		return selelrId;
	}
	public void setSelelrId(int selelrId) {
		this.selelrId = selelrId;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public String getImages() {
		return images;
	}
	public void setImages(String images) {
		this.images = images;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
	
	
	
	
}

