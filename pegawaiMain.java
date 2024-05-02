import java.util.ArrayList;

public class pegawaiMain {
    public static void main(String[] args) {
        
        
        /////////////////// Pegawai Tetap ////////////////////
        
        ArrayList<PegawaiTetap> listTetap = new ArrayList<>();
        
        listTetap.add(new PegawaiTetap("Revan","350512011020004",5000000));
        listTetap.add(new PegawaiTetap("Sofyan","3505121304030007",3000000));
        listTetap.add(new PegawaiTetap("Brian","35051227030100030004",2000000));
        
        System.out.println("\n|-------------|| Informasi Pegawai Tetap|| -------------|\n");
        for (int i = 0; i < listTetap.size(); i++) {
            PegawaiTetap pT = listTetap.get(i);
            System.out.println("Nama\t\t: "+pT.getNama());
            System.out.println("No. KTP\t\t: " + pT.getNoKTP());
            System.out.println("Upah \t\t: " + pT.getUpah());
            System.out.printf("%s%.0f\n","Pendapatan\t: Rp ",pT.gaji());
            System.out.println("______________");
        }
        System.out.println();
        
        System.out.println("\n==================================================================================================\n");
        /////////////////// Pegawai Harian ////////////////////
        
        ArrayList<PegawaiHarian> listHarian = new ArrayList<>();
        
        listHarian.add(new PegawaiHarian("Aldiano","3505120506080001",10000,9));
        listHarian.add(new PegawaiHarian("Arbian","3505120506120008",20000,10));
        listHarian.add(new PegawaiHarian("Robby","3505121209670001",50000,5));
        
        System.out.println("\n|-------------|| Informasi Pegawai Harian ||-------------|\n");
        for (int i = 0; i < listHarian.size(); i++) {
            PegawaiHarian pH = listHarian.get(i);
            System.out.println("Nama\t\t: "+pH.getNama());
            System.out.println("No. KTP\t\t: " + pH.getNoKTP());
            System.out.println("Upah Per Jam\t: Rp " + pH.getUpahPerJam());
            System.out.println("Total Jam Kerja\t: " + pH.getTotalJam());
            System.out.printf("%s%.0f\n","Pendapatan\t: Rp ",pH.gaji());
            System.out.println("______________");
        }
        System.out.println();
        
        System.out.println("\n==================================================================================================\n");
        /////////////////// Pegawai Sales ////////////////////
        
        ArrayList<Sales> listSales = new ArrayList<>();
            
            listSales.add(new Sales("Joko","350512011020004",25,30000));
            listSales.add(new Sales("Bara","350512010603008",15,10000));
            listSales.add(new Sales("Joko","350512061090001",70,20000));
            
            System.out.println("\n|-------------|| Informasi Pegawai Sales ||-------------|\n");
            for (int i = 0; i < listSales.size(); i++) {
                Sales pS = listSales.get(i);
                System.out.println("Nama\t\t: "+pS.getNama());
                System.out.println("No. KTP\t\t: " + pS.getNoKTP());
                System.out.println("Total Penjualan\t: " + pS.getPenjualan());
                System.out.println("Besaran Komisi\t: " + pS.getKomisi());
                System.out.printf("%s%.0f\n","Pendapatan\t: Rp ",pS.gaji());
                System.out.println("______________");
            }
                System.out.println();
    }
}
