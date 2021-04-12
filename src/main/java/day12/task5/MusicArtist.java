package day12.task5;

public class MusicArtist {
    private String nameOfArtist;
    private int ageOfArtist;

    public MusicArtist(String nameOfArtist, int ageOfArtist) {
        this.nameOfArtist = nameOfArtist;
        this.ageOfArtist = ageOfArtist;
    }

    public String getNameOfArtist() {
        return nameOfArtist;
    }

    public void setNameOfArtist(String nameOfArtist) {
        this.nameOfArtist = nameOfArtist;
    }

    public int getAgeOfArtist() {
        return ageOfArtist;
    }

    public void setAgeOfArtist(int ageOfArtist) {
        this.ageOfArtist = ageOfArtist;
    }

    @Override
    public String toString() {
        return "MusicArtist{" +
                "nameOfArtist='" + nameOfArtist + '\'' +
                ", ageOfArtist=" + ageOfArtist +
                '}';
    }
}
