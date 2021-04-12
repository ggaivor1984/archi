package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> groupMates;

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    public MusicBand(String name, int year, List<String> groupMates) {
        this.name = name;
        this.year = year;
        this.groupMates = groupMates;
    }

    public static void transferMembers(MusicBand band1, MusicBand band2) {
        band2.groupMates.addAll(band1.groupMates);
        band1.groupMates.clear();
    }

    public void printMembers() {
        for (String groupMember : groupMates
        ) {
            System.out.println(groupMember);
        }
    }

    public List<String> getMembers() {
        return groupMates;
    }
}
