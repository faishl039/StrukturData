package latihanModul;
import java.util.ArrayList;

public class hewan {
    public static void main(String[] args) {
        ArrayList<String> Hewan = new ArrayList<>();
        Hewan.add("sapi");
        Hewan.add("kelinci");
        Hewan.add("kambing");
        Hewan.add("unta");
        Hewan.add("domba");
        System.out.println("Hewan : " +Hewan);

        ArrayList<String> delete = new ArrayList<>();
        delete.add("kelinci");
        delete.add("kambing");
        delete.add("unta");

        ArrayList<String> deleteHewan = new ArrayList<>();
        for (String warna : delete) {
            Hewan.removeIf(h -> h.equals(warna));
            deleteHewan.add(warna);
        }
        System.out.println("Hewan yang dihapus: " +deleteHewan);

        System.out.println("Update hewan : " +Hewan);

    }
}
