package HopGiaoCua2FileVanBan;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("D:/ZJava/KiemTra/File/HopGiaoCua2FileVanBan/DATA1.txt");
        WordSet s2 = new WordSet("D:/ZJava/KiemTra/File/HopGiaoCua2FileVanBan/DATA2.txt");
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
