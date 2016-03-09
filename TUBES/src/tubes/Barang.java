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
public class Barang {
    private String namaBrg;
    private int idBrg;
    private String kondisi;
    
    public Barang (String namaBrg, int idBrg) {
        this.namaBrg = namaBrg;
        this.idBrg = idBrg;
    }
    
    public Barang (String namaBrg) {
        this.namaBrg = namaBrg;
    }
    
    public void setNamaBarang (String namaBrg) {
        this.namaBrg = namaBrg;
    }
    
    public String getNamaBarang () {
        return namaBrg;
    }
    
    public void setIdBarang (int idBrg) {
        this.idBrg = idBrg;
    }
    
    public int getIdBarang () {
        return idBrg;
    }
    
    public void setKondisiBarang (String kondisi) {
        this.kondisi = kondisi;
    }
    
    public String getKondisiBarang() {
        return kondisi;
    }
}
