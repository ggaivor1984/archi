package day12.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        MusicBand bandC = new MusicBand("Demo", 1997, new ArrayList<>(Arrays.asList(new MusicArtist("Joe Lee", 34))));
        MusicBand bandD = new MusicBand("Leningrad", 2003, new ArrayList<>(Arrays.asList(new MusicArtist("Vasilii Terkin", 38))));
        MusicBand.transferMembers(bandC, bandD);
        bandC.printMembers();
        System.out.println("//////////////////");
        bandD.printMembers();
        System.out.println("//////////////////");
        List<MusicArtist> members = bandD.getMembers();
        System.out.println(members);
        System.out.println("////////////////////");
        List<MusicArtist> members1 = bandC.getMembers();
        System.out.println(members1);
    }
}
