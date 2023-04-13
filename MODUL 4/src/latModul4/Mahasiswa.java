package latModul4;

import java.util.HashMap;
import java.util.Scanner;

public class Mahasiswa {
    String nama, kelas, matkulPrak, nim;
//    int nim;

    public Mahasiswa(String nm, String cl, String mtkl, String ni){
        nama = nm;
        kelas = cl;
        matkulPrak = mtkl;
        nim = ni;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Mahasiswa> mhs = new HashMap<>();
        String input;
        Mahasiswa data;

        mhs.put("1", new Mahasiswa("Faishal", "A", "Strudat", "202110370311018"));
        mhs.put("2", new Mahasiswa("Akbar", "A", "Strudat", "202110370311000"));

        System.out.print("Masukkan ID: ");
        input = in.nextLine();
        data = mhs.get(input);
        if (data != null){
            System.out.println("Data Mhs: " +data.nama + ", kelas: " +data.kelas
            + ", matkul: " +data.matkulPrak + ", NIM: " +data.nim);
        }
    }


}
