/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO_0Pendahuluan;

/**
 *
 * @author ASUS
 */
public class Aves extends Hewan {

    /**
     * @return the paruh
     */
    public String getParuh() {
        return paruh;
    }

    /**
     * @param paruh the paruh to set
     */
    public void setParuh(String paruh) {
        this.paruh = paruh;
    }

    private String paruh;//pemakan biji,pemakan serangga,pemakan ikan

    public void utama() {
        System.out.println("Ciri utamanya yaitu  memiliki tubuh yang tertutup bulu yang dapat digunakan untuk kamuflase, menghangatkan badan, dan juga terbang");
    }

    public void sayap() {
        System.out.println("Memiliki satyap yang terbentuk dari modifikasi anggota badan depan yang memungkinkan digunakan untuk terbang");
    }

    public void jantung() {
        System.out.println("Memiliki jantung yang terdiri dari 4 ruang, dua ventrikel dan dua buah atrium. Sistem peredaran darahnya tertutup dan ganda");
    }
    
    public void kaki(){
        System.out.println("umummnya memiliki kaki yang bersisik");
    }
}
