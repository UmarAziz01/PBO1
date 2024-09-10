/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO_0Pendahuluan;

/**
 *
 * @author ASUS
 */
public class Hewan extends MakhlukHidup {

    private int jumlahKaki;
    private String berjalan;
    private String jenisKulit;//halus hingga kasar

    public void bergerak() {
        System.out.println("Bisa bergerak");
    }

    /**
     * @return the jumlahKaki
     */
    public int getJumlahKaki() {
        return jumlahKaki;
    }

    /**
     * @param jumlahKaki the jumlahKaki to set
     */
    public void setJumlahKaki(int jumlahKaki) {
        this.jumlahKaki = jumlahKaki;
    }

    /**
     * @return the berjalan
     */
    public String getBerjalan() {
        return berjalan;
    }

    /**
     * @param berjalan the berjalan to set
     */
    public void setBerjalan(String berjalan) {
        this.berjalan = berjalan;
    }

    /**
     * @return the jenisKulit
     */
    public String getJenisKulit() {
        return jenisKulit;
    }

    /**
     * @param jenisKulit the jenisKulit to set
     */
    public void setJenisKulit(String jenisKulit) {
        this.jenisKulit = jenisKulit;
    }
}
