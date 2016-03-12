public abstract class Orang {
	private String nama;
	private String id;
	
	public Orang (String nama, String id) {
		this.nama = nama;
		this.id = id;
	}
	
	public void setName (String nama) {
		this.nama = nama;
	}
	
	public String getNama () {
		return nama;
	}
	
	public void setId (String id) {
		this.id = id;
	}
	
	public String getId () {
		return id;
	}
} 