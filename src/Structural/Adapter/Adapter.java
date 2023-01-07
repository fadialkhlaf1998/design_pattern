package Structural.Adapter;

public class Adapter implements AudioPlayer{

    MediaPlayer mediaPlayer;

    public Adapter(String file){
        if(file.endsWith("mp4")){
            mediaPlayer = new Mp4Player();
        }else {
            mediaPlayer = new M4aPlayer();
        }
    }

    @Override
    public void play(String file) {
        if(file.endsWith("mp4")){
            mediaPlayer.mp4();
        }else {
            mediaPlayer.m4a();
        }
    }
}
