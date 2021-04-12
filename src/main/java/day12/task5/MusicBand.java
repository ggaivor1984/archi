package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> groupMates;

    public int getYear() {
        return year;
    }

    public List<MusicArtist> getGroupMates() {
        return groupMates;
    }

    public void setGroupMates(List<MusicArtist> groupMates) {
        this.groupMates = groupMates;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", groupMates=" + groupMates +
                '}';
    }

    public MusicBand(String name, int year, List<MusicArtist> groupMates) {
        this.name = name;
        this.year = year;
        this.groupMates = groupMates;
    }

    public static void transferMembers(MusicBand band1, MusicBand band2) {
        band2.groupMates.addAll(band1.groupMates);
        band1.groupMates.clear();
    }

    public void printMembers() {
        for (MusicArtist artist : getGroupMates()
        ) {
            System.out.println(artist);
        }
    }

    public List<MusicArtist> getMembers() {
        return groupMates;
    }
}
