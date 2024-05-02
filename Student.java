/**
 * Student
 */
public class Student extends Person {
    String nim;
    private int spp;
    private int sks;
    private int modul;

    public Student(String name, String address, String nim) {
        super(name, address);
        this.nim = nim;
    }

    public void setSpp(int spp) {
        this.spp = spp;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public void setModul(int modul) {
        this.modul = modul;
    }

    public int getSpp() {
        return spp;
    }

    public int getSks() {
        return sks;
    }

    public int getModul() {
        return modul;
    }

    public String getNim() {
        return nim;
    }

    public int hitungPembayaran(int spp, int sks, int modul){
        int total = spp + (sks * 350000) + (modul * 100000);
        return total;
    }

    @Override
    public void identity() {
        super.identity();
        System.out.println("NIM: " + getNim());

    }
}

