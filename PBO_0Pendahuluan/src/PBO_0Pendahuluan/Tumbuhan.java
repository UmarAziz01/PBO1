/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO_0Pendahuluan;

/**
 *
 * @author ASUS
 */
public class Tumbuhan extends MakhlukHidup {

    /**
     * @return the tinggi
     */
    public String getTinggi() {
        return tinggi;
    }

    /**
     * @param tinggi the tinggi to set
     */
    public void setTinggi(String tinggi) {
        this.tinggi = tinggi;
    }

    private String warnaDaun;
    private String arahDaun;
    private String warnaBunga;
    private String tinggi;

    public void berfotosintesis() {
        System.out.println("Dapat berfotosintesis");
    }

    public void autrotof() {
        System.out.println("Dapat membuat makanannya sendiri");
    }

    public void reproduksi() {
        System.out.println("Dapat ber-reproduksi secara seksual maupun aseksual");
    }

    public void nafas() {
        System.out.println("Nafasnya menggunakan stomata");
    }

    public void ekskresi() {
        System.out.println("Dapat mengeluarkan uap air dari stomata");
    }

    public void peka() {
        System.out.println("Dapat peka terhadap rangsangan baik terhadap sentuhan, zat kimia, atau yang lainnya");
    }

    public void jenis() {
        System.out.println("Dan juga pada tumbuhan memiliki pengelompokan seperti tumbuhan paku, tumbuhan berbiji, dan juka lumut");
    }

    /**
     * @return the warnaDaun
     */
    public String getWarnaDaun() {
        return warnaDaun;
    }

    /**
     * @param warnaDaun the warnaDaun to set
     */
    public void setWarnaDaun(String warnaDaun) {
        this.warnaDaun = warnaDaun;
    }

    /**
     * @return the arahDaun
     */
    public String getArahDaun() {
        return arahDaun;
    }

    /**
     * @param arahDaun the arahDaun to set
     */
    public void setArahDaun(String arahDaun) {
        this.arahDaun = arahDaun;
    }

    /**
     * @return the warnaBunga
     */
    public String getWarnaBunga() {
        return warnaBunga;
    }

    /**
     * @param warnaBunga the warnaBunga to set
     */
    public void setWarnaBunga(String warnaBunga) {
        this.warnaBunga = warnaBunga;
    }

    

}
