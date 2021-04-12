package day12.task3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> bands = new ArrayList<>();
        bands.add(new MusicBand("Progigy", 1991));
        bands.add(new MusicBand("Queen", 1979));
        bands.add(new MusicBand("Beatles", 1961));
        bands.add(new MusicBand("Ramstein", 2001));
        bands.add(new MusicBand("Babki", 2005));
        bands.add(new MusicBand("Chaif", 1995));
        bands.add(new MusicBand("Timoty", 2011));
        bands.add(new MusicBand("Hippoband", 2015));
        bands.add(new MusicBand("Eminem", 1999));
        bands.add(new MusicBand("Pals", 2020));

        Collections.shuffle(bands);
        System.out.println(bands);
        List<MusicBand> bands2000 = groupsAfter2000(bands);
        System.out.println(bands2000);

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> bandsAfter2000 = new ArrayList<>();
        for (int i = 0; i < bands.size(); i++) {
            if (bands.get(i).getYear() > 2000) {
                bandsAfter2000.add(bands.get(i));
            }
        }
        return bandsAfter2000;
    }
}
