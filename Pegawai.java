public abstract class Pegawai {
    private String nama;
    private String noKTP;

    public Pegawai (String nama, String noKTP) {
        this.nama = nama;
        this.noKTP = noKTP;
    }

    public String getNama() {
        return nama;
    }

    public String getNoKTP() {
        return noKTP;
    }

    //tidak dipakai
    public String toString(){
        return String.format(getNama()+ "\nNo KTP : \t\t: "+getNoKTP());
    }

    public abstract double gaji();
    
}