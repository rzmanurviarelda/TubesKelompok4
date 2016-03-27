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
import java.util.Scanner;

public class Aplikasi {
    private Penyedia [] daftarPenyedia = new Penyedia [50];
    private Petugas [] daftarPetugas = new Petugas [50];
    private Gudang [] daftarGudang = new Gudang [20];
    private int nPenyedia = 0;
    private int nPetugas = 0;
    private int nGudang = 0;
    
    public void addPenyedia (Penyedia py) {
        this.daftarPenyedia[nPenyedia] = py;
        nPenyedia++;
    }
    
    public Penyedia getPenyedia (String id) {
        for (int i = 0; i < daftarPenyedia.length; i++) {
            if (id == daftarPenyedia[i].getId()) {
                return daftarPenyedia[i];
            }
        }
        return null;
    }
    
    public void deletePenyedia (String id) {
        for (int i = 0; i < daftarPenyedia.length; i++) {
            if (getPenyedia(id) != null) {
                daftarPenyedia[i] = null;
            }
        }
    }
    
    public void addPetugas (Petugas pt) {
        this.daftarPetugas[nPetugas] = pt;
        nPetugas++;
    }
    
    public Petugas getPetugas (String id) {
        for (int i = 0; i < daftarPetugas.length; i++) {
            if (id == daftarPetugas[i].getId()) {
                return daftarPetugas[i];
            }
        }
        return null;
    }
    
    public void deletePetugas (String id) {
        for (int i = 0; i < daftarPetugas.length; i++) {
            if (getPetugas(id) != null) {
                daftarPetugas[i] = null;
            }
        }
    }
    
    public void addGudang (Gudang g) {
        this.daftarGudang[nGudang] = g;
        nGudang++;
    }
    
    public Gudang getGudang (String namaGudang) {
        for (int i = 0; i < daftarGudang.length; i++) {
            if (namaGudang == daftarGudang[i].getNamaGudang()) {
                return daftarGudang[i];
            }
        }
        return null;
    }
    
    public void deleteGudang (String namaGudang) {
        for (int i = 0; i < daftarGudang.length; i++) {
            if (getGudang(namaGudang) != null) {
                daftarGudang[i] = null;
            }
        }
    }
    
    public void MenuPenyedia() {
        String namaPenyedia;
        String idPenyedia;
        String namaGudang;
        String namaBrg;
        int idBrg;
        int i;
        
        Scanner scan = new Scanner(System.in);
        Penyedia q1 = new Penyedia (namaPenyedia = scan.next(), idPenyedia = scan.next());
        Gudang g1 = new Gudang (namaGudang = scan.next());
        
        q1.createBarang(namaBrg = scan.next(), idBrg = scan.nextInt());
        q1.removeBarang(q1.getBarang(i = scan.nextInt()));
    }
    
    public void MenuPetugas() {
        String namaPetugas;
        String idPetugas;
        String namaGudang;
        Barang b = new Barang();
        int idBrg;
        int j;
        
        Scanner scan = new Scanner(System.in);
        Petugas p1 = new Petugas (namaPetugas = scan.next(), idPetugas = scan.next());
        Gudang g = new Gudang (namaGudang = scan.next());
        
        g.addBarang(b);
        p1.cekBarang(b);
        g.removeBarang();
    }
    
    public void MainMenu() {
        int pil;
        
        Scanner scan = new Scanner(System.in);
        if ((pil = scan.nextInt()) == 1 ) {
            MenuPenyedia();
        }
        else if ((pil = scan.nextInt()) == 2 ) {
            MenuPetugas();
        }
    }
}
