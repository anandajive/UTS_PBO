import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);

        System.out.println("---------DOSEN-------");
        System.out.println("Masukkan nama Dosen :");
        String nama = masukan.next();
        System.out.println("Masukkan nip dosen  :");
        String nip = masukan.next();
        System.out.println("Masukkan gaji pokok :");
        long GajiPokok = masukan.nextLong();
        System.out.println("Masukkan jumlah sks yang diambil dosen:");
        float sks = masukan.nextFloat();

        dosen dsn = new dosen();
        dsn.setNama(nama);
        dsn.setNip(nip);
        dsn.setGajiPokok(GajiPokok);
        dsn.setsks(sks);

        System.out.println("---------STAFF-------");
        System.out.println("Masukkan nama Staff :");
        String namastaff = masukan.next();
        System.out.println("Masukkan nip Staff :");
        String nipstaff = masukan.next();
        System.out.println("Masukkan gaji pokok :");
        long GajiPokokstaff = masukan.nextLong();
        System.out.println("Masukkan jumlah jam lembur :");
        int JamLembur = masukan.nextInt();

        staff staff = new staff();
        staff.setNama(namastaff);
        staff.setNip(nipstaff);
        staff.setGajiPokok(GajiPokokstaff);
        staff.setJamLembur(JamLembur);


        System.out.println("nama dosen              :" + dsn.nama);
        System.out.println("nip dosen               :" + dsn.nip);
        System.out.println("gaji pokok dosen        :" + dsn.GajiPokok);
        System.out.println("gaji per sks dosen      :" + dsn.getsks());
        System.out.println("Gaji total dosen        :" + dsn.hitungGajiTotal());

        System.out.println("nama pegawai Staff       :" + staff.nama);
        System.out.println("nip pegawai Staff        :" + staff.nip);
        System.out.println("gaji pokok pegawai Staff :" + staff.GajiPokok);
        System.out.println("jumlah jam lembur Staff  :" + staff.getJamLembur());
        System.out.println("gaji total pegawai Staff :" + staff.hitungGajiTotal());

    }
}