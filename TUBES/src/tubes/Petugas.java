public class Petugas extends Orang {
	public Petugas (String nama, String id) {
		super(nama, id);
	}
	
	private Gudang[] g = new Gudang[2];
	
	public void cekBarang (Barang b) {
		if (b.getKondisiBarang() == "Baik") {
			g[0].addBarang(b);
		}
		else {
			g[1].addBarang(b);
		}
	}
}