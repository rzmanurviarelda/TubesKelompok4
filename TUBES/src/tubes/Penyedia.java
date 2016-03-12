public class Penyedia extends Orang {
	public Penyedia (String nama, String id) {
		super(nama, id);
	}
	
	private Barang [] daftarBarang = new Barang [50];
	private int jumlahBrg = 0;
	
	public void createBarang(String namaBrg, int idBrg) {
		if (jumlahBrg < 50) {
			daftarBarang [jumlahBrg] = new Barang (namaBrg, idBrg);
			jumlahBrg++;
		}
	}
	
	public Barang getBarang (int i) {
		return daftarBarang[i];
	}
	
	public void removeBarang (Barang b) {
		for (int i = 0; i < daftarBarang.length; i++) {
			if (b == daftarBarang[i]) {
				daftarBarang[i] = null;
			}
			else {
				System.out.println (daftarBarang[i]);
				System.out.println ("Barang berhasil di hapus");
			}
		}
	}
}