/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PBO_0Pendahuluan;

/**
 *
 * @author ASUS
 */
public class Utama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {///aves,mamalia,

        //Bagian Amphibia
        System.out.println("=> Amphibia");
        Amphibia katak = new Amphibia();
        katak.setNama("Katak");//MH
        katak.setJenisKelamin("Jantan & Betina");//MH
        katak.setJumlahKaki(4);//Hewan
        katak.setBerjalan("kaki untuk melompat");//Hewan
        katak.setJenisKulit("Licin");
        System.out.println("Saya " + katak.getNama() + ", Jenis kelamin = " + katak.getJenisKelamin() + ", memiliki kaki sebanyak = " + katak.getJumlahKaki() + katak.getBerjalan() + ", dan memiliki kulit yang " + katak.getJenisKulit());
        katak.berevolusi();//MH
        katak.bergerak();//Hewan
        katak.berkembangBiak();//MH
        katak.bermetabolisme();//MH
        katak.bernafas();//MH
        katak.makan();//MH
        katak.utama();//Amphibia
        katak.kulit();//Amphibia
        katak.jantung();//Amphibia
        katak.reproduksi();//Amphibia

        //Bagian Aves
        System.out.println(" ");
        System.out.println("=> Aves");
        Aves bebek = new Aves();
        bebek.setNama("Bebek");//MH
        bebek.setJenisKelamin("Jantan & Betina");//MH
        bebek.setJumlahKaki(2);//Hewan
        bebek.setBerjalan("kaki untuk berjalan");//Hewan
        bebek.setJenisKulit("berbulu");
        bebek.setParuh("lebar, pipih yang dilengkapi lamela");
        System.out.println("Saya " + bebek.getNama() + ", Jenis kelamin = " + bebek.getJenisKelamin() + ", memiliki kaki sebanyak = " + bebek.getJumlahKaki() + bebek.getBerjalan() + ", memiliki kulit yang " + bebek.getJenisKulit()+", dan memiliki paruh yang ");
        bebek.berevolusi();//MH
        bebek.bergerak();//Hewan
        bebek.berkembangBiak();//MH
        bebek.bermetabolisme();//MH
        bebek.bernafas();//MH
        bebek.makan();//MH
        bebek.utama();//Av
        bebek.sayap();//Av
        bebek.jantung();//Av
        bebek.kaki();//Av

        //Bagian Mamalia
        System.out.println(" ");
        System.out.println("=> Mamalia");
        Mamalia sapi = new Mamalia();
        sapi.setNama("Sapi");//MH
        sapi.setJenisKelamin("Jantan & Betina");//MH
        sapi.setJumlahKaki(4);//Hewan
        sapi.setBerjalan("kaki untuk berjalan");//Hewan
        sapi.setJenisKulit("berbulu tipis dan berkulit tebal");
        System.out.println("Saya " + sapi.getNama() + ", Jenis kelamin = " + sapi.getJenisKelamin() + ", memiliki kaki sebanyak = " + sapi.getJumlahKaki() + sapi.getBerjalan() + ", dan memiliki kulit yang "+sapi.getJenisKulit());
        sapi.berevolusi();//MH
        sapi.bergerak();//Hewan
        sapi.berkembangBiak();//MH
        sapi.bermetabolisme();//MH
        sapi.bernafas();//MH
        sapi.makan();//MH
        sapi.utama();//Ma
        sapi.rambut();//Ma
        sapi.tulang();//Ma
        sapi.jantung();//Ma

        //Bagian Pisces
        System.out.println(" ");
        System.out.println("=> Pisces");
        Pisces hiu = new Pisces();
        hiu.setNama("Hiu");//MH
        hiu.setJenisKelamin("Jantan & Betina");//MH
        hiu.setJumlahKaki(0);//Hewan
        hiu.setBerjalan("namun memiliki 2 sirip untuk berenang");//Hewan
        System.out.println("Saya " + hiu.getNama() + ", Jenis kelamin = " + hiu.getJenisKelamin() + ", memiliki kaki sebanyak = " + hiu.getJumlahKaki() + hiu.getBerjalan() + ", dan memiliki kulit yang "+hiu.getJenisKulit());
        hiu.berevolusi();//MH
        hiu.bergerak();//Hewan
        hiu.berkembangBiak();//MH
        hiu.bermetabolisme();//MH
        hiu.bernafas();//MH
        hiu.makan();//MH
        hiu.utama();//Pi
        hiu.sisik();//Pi
        hiu.gerak();//Pi
        hiu.khusus();//Pi

        //Bagian Reptilia
        System.out.println(" ");
        System.out.println("=> Reptilia");
        Reptilia buaya = new Reptilia();
        buaya.setNama("Buaya");//MH
        buaya.setJenisKelamin("Jantan & Betina");//MH
        buaya.setJumlahKaki(4);//Hewan
        buaya.setBerjalan("kaki untuk berjalan");//Hewan
        //buaya.setJenisKulit("Licin");
        System.out.println("Saya " + buaya.getNama() + ", Jenis kelamin = " + buaya.getJenisKelamin() + ", memiliki kaki sebanyak = " + buaya.getJumlahKaki() + buaya.getBerjalan() + ", dan memiliki kulit yang "+buaya.getJenisKulit());
        buaya.berevolusi();//MH
        buaya.bergerak();//Hewan
        buaya.berkembangBiak();//MH
        buaya.bermetabolisme();//MH
        buaya.bernafas();//MH
        buaya.makan();//MH
        buaya.utama();//Re
        buaya.tulang();//Re
        buaya.nafas();//Re
        buaya.cakar();//Re

        //Bagian Dikotil
        System.out.println(" ");
        System.out.println("=> Dikotil");
        Dikotil bungaMatahari = new Dikotil();
        bungaMatahari.setNama("Bunga Matahari");//MH
        bungaMatahari.setJenisKelamin("bunga jantan & betina");//MH
        bungaMatahari.setArahDaun("timur");//Tumb.
        bungaMatahari.setWarnaDaun("hijau");//Tumb.
        bungaMatahari.setWarnaBunga("kuning");//Tumb.
        bungaMatahari.setTinggi("3-5 meter");//Tumb.
        System.out.println("Saya " + bungaMatahari.getNama() + ", jenis kelamin = " + bungaMatahari.getJenisKelamin() + ", arah daun ketika pagi hari = " + bungaMatahari.getArahDaun() + ", memiliki warna daun = " + bungaMatahari.getWarnaDaun() + ", memiliki warna bunga = " + bungaMatahari.getWarnaBunga() + ", biasanya tingginya mencapai = " + bungaMatahari.getTinggi());
        bungaMatahari.berevolusi();//MH
        bungaMatahari.berkembangBiak();//MH
        bungaMatahari.bermetabolisme();//MH
        bungaMatahari.bernafas();//MH
        bungaMatahari.makan();//MH
        bungaMatahari.kepingBiji();//DK
        bungaMatahari.akar();//DK
        bungaMatahari.batang();//DK
        bungaMatahari.tulangDaun();//DK
        bungaMatahari.bunga();//DK
        bungaMatahari.reproduksi();//DK
        bungaMatahari.kambium();//DK
        bungaMatahari.stomata();//DK

        //Bagian Monokotil
        System.out.println(" ");
        System.out.println("=> Monokotil");
        Monokotil kelapa = new Monokotil();
        kelapa.setNama("Kelapa");//MH
        kelapa.setJenisKelamin("bunganya majemuk => jantan dan betina");//MH
        kelapa.setArahDaun("null");//Tumb.
        kelapa.setWarnaDaun("hijau");//Tumb.
        kelapa.setWarnaBunga("bermacam-macam, umumnya kuning kehijauan");//Tumb.
        kelapa.setTinggi("20-30 meter");//Tumb.
        System.out.println("Saya " + kelapa.getNama() + ", jenis kelamin = " + kelapa.getJenisKelamin() + ", arah daun ketika pagi hari = " + kelapa.getArahDaun() + ", memiliki warna daun = " + kelapa.getWarnaDaun() + ", memiliki warna bunga = " + kelapa.getWarnaBunga() + ", biasanya tingginya mencapai = " + kelapa.getTinggi());
        kelapa.berevolusi();//MH
        kelapa.berkembangBiak();//MH
        kelapa.bermetabolisme();//MH
        kelapa.bernafas();//MH
        kelapa.makan();//MH
        kelapa.kepingBiji();//MK
        kelapa.akar();//MK
        kelapa.batang();//MK
        kelapa.tulangDaun();//MK
        kelapa.bunga();//MK
        kelapa.reproduksi();//MK
        kelapa.kambium();//MK
        kelapa.stomata();//MK
        
        //Contoh dari Pak Bayu Adhi Nugroho, Ph.D
        // TODO code application logic here
//        Hewan kucing = new Hewan();
//        System.out.println("Saya Kucing");
//        kucing.bernafas();
//        kucing.tumbuh();
//        kucing.setBerjalan("dengan kaki");
//        System.out.println("Dan berjalan " + kucing.getBerjalan());
//
//        System.out.println(" ");
//        Tumbuhan mangga = new Tumbuhan();
//        System.out.println("");
//        System.out.println("Saya Mangga");
//        mangga.setWarnaDaun("Hijau");/*Setter*/
//        mangga.setJenisAkar("Tunggang");
//        mangga.setJenisBiji("Dikotil");
//        mangga.bernafas();
//        mangga.tumbuh();
//        System.out.println("Warna daun = " + mangga.getWarnaDaun());/*Getter*/
//        System.out.println("Arah daun pagi hari = " + mangga.getArahDaun());
//        System.out.println("Jenis Akar = " + mangga.getJenisAkar());
//        System.out.println("Jenis Biji = " + mangga.getJenisBiji());
//
//        System.out.println(" ");
//        Tumbuhan bungaMatahari = new Tumbuhan();
//        System.out.println(" ");
//        System.out.println("Saya Bunga Matahari");
//        bungaMatahari.setWarnaDaun("Hijau");
//        bungaMatahari.setArahDaun("Timur");
//        bungaMatahari.setJenisAkar("Tunggang");
//        bungaMatahari.setJenisBiji("Dikotil");
//        bungaMatahari.bernafas();
//        bungaMatahari.tumbuh();
//        System.out.println("Warna daun = " + bungaMatahari.getWarnaDaun());
//        System.out.println("Arah daun = " + bungaMatahari.getArahDaun());
//        System.out.println("Jenis Akar = " + bungaMatahari.getJenisAkar());
//        System.out.println("Jenis Biji = " + bungaMatahari.getJenisBiji());
//
//        System.out.println(" ");
//        Tumbuhan pisang = new Tumbuhan();
//        System.out.println(" ");
//        System.out.println("Saya Pisang");
//        pisang.setWarnaDaun("Hijau");
//        pisang.setJenisAkar("Tunggang");
//        pisang.setJenisBiji("Dikotil");
//        pisang.bernafas();
//        pisang.tumbuh();
//        System.out.println("Warna daun = " + pisang.getWarnaDaun());
//        System.out.println("Arah daun = " + pisang.getArahDaun());
//        System.out.println("Jenis Akar = " + pisang.getJenisAkar());
//        System.out.println("Jenis Biji = " + pisang.getJenisBiji());
//
//        System.out.println(" ");
//        System.out.println("Saya KOI ");
//        Pisces koi = new Pisces();
//        koi.bernafas();
//        koi.tumbuh();
//        koi.setJumlahKaki(2);
//        System.out.println("Jumlah kaki koi= " + String.valueOf(koi.getJumlahKaki()));
    }

}
