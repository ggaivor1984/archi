package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        MusicBand bandA = new MusicBand("Prodigy", 1991, new ArrayList<>(Arrays.asList("Liam Howlet", "Keith Flint")));
        MusicBand bandB = new MusicBand("Splin", 1993, new ArrayList<>(Arrays.asList("Stas Namin", "Sergei Shnur")));
        MusicBand.transferMembers(bandA, bandB);
        bandA.printMembers();
        bandB.printMembers();
        List<String> listOfMembers = bandA.getMembers();
        System.out.println(listOfMembers);
    }
}
