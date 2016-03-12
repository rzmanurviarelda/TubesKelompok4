/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

/**
 *
 * @author ASUS
 */
public class Gudang {
    private String namaGudang;
    private Barang [] daftarBarang;
    private int maxBarang;
    private int nBarang = 0;
    
    public Gudang (String namaGudang) {
        this.namaGudang = namaGudang;
        daftarBarang = new Barang[50];
        maxBarang = 50;
    }
    
    public String getNamaBarang (String namaBarang) {
        return namaBarang;
    }
    
    public void addBarang (Barang b) {
        if (nBarang < maxBarang) {
            this. daftarBarang[nBarang] = b;
            nBarang++;
        }
    }
    
    public Barang getBarang (int x) {
        return daftarBarang[x];
    }
    
    public void removeBarang () {
        for (int i = 0; i<daftarBarang.length; i++) {
            if (daftarBarang[i].getKondisiBarang() == "Tidak Baik") {
                daftarBarang[i] = null;
            }
        }
    }
}