public class App {

  public static void main(String[] args) {
    MusicPlayer musicPlayer = new MusicPlayer();
    musicPlayer.addPlayList();
    musicPlayer.play(musicPlayer.albums[2]);
    musicPlayer.next();
    musicPlayer.pause();
    musicPlayer.next();
    musicPlayer.next();
    musicPlayer.next();
    musicPlayer.pervious();
    musicPlayer.pervious();
    musicPlayer.jumpTo(musicPlayer.albums[0]);
  }

}
