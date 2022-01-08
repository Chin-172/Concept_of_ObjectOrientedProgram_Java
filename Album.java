public class Album {

  private String songName;
  private String artists;

  public Album(){
  }

  public String getSongName() {
    return songName;
  }

  public void setSongName(String songName) {
    this.songName = songName;
  }

  public String getArtists() {
    return artists;
  }

  public void setArtists(String artists) {
    this.artists = artists;
  }

  public void addNewSong(String songName , String artists){
    setSongName(songName);
    setArtists(artists);
  }

}
