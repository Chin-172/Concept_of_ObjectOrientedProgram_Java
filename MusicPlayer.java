import java.util.Arrays;
import java.util.Scanner;
public class MusicPlayer extends Album implements Drive{

  public Album[] albums;
  private int currentIndex = 0;
  public MusicPlayer() {
    Album song = new Album();
    if (getPlayListLength() == 0) {
      System.out.println("Please add a new song first");
    }
  }

  public Album[] addPlayList(){
    int songs;
    String songName;
    String artist;
    String emptyLine;
    System.out.println("How many songs do you want to add ? ");
    Scanner sc = new Scanner(System.in);
    songs = sc.nextInt();
    emptyLine = sc.nextLine();
    this.albums = new Album[songs];
    for (int i = 0 ; i < songs ; i++){
        this.albums[i] = new Album();
      System.out.print("Song : ");
      songName = sc.nextLine();
      System.out.print("Artist : ");
      artist = sc.nextLine();
      this.albums[i].addNewSong(songName,artist);
    }
    return albums;
  }

  public int getPlayListLength(){
    if (this.albums == null){
      return 0;
    }
    return albums.length;
  }

  public void playListPreview(){
    for (int i = 0 ; i < getPlayListLength() ; i++){
      System.out.println("Song : "+ albums[i].getSongName()+" Artist : "+ albums[i].getArtists());
    }
  }
  @Override
  public void play(Album song) {
    System.out.println(song.getSongName()+" is playing");
    currentIndex = Arrays.asList(albums).indexOf(song);
  }

  @Override
  public void pause() {
    System.out.println("MusicPlayer is paused now");
  }

  @Override
  public void next() {
    System.out.println("next song is loading....");
    currentIndex = (currentIndex+1)%getPlayListLength();
    play(albums[currentIndex]);
  }

  @Override
  public void pervious() {
    System.out.println("pervious song is loading....");
    if (currentIndex - 1 < 0){
      currentIndex = getPlayListLength() - 1;
    }else {
      currentIndex = currentIndex - 1;
    }
    play(albums[currentIndex]);
  }

  @Override
  public void jumpTo(Album song) {
    System.out.println("jumping to "+ song.getSongName() + " ....");
    currentIndex = Arrays.asList(albums).indexOf(song);
    play(albums[currentIndex]);
  }
}
