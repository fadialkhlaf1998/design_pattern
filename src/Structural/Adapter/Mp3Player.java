package Structural.Adapter;

public class Mp3Player implements AudioPlayer{
    Adapter adapter;
    @Override
    public void play(String file) {
        if(file.endsWith(".mp3")){
            System.out.println("mp3");
        }else {
            adapter = new Adapter(file);
            adapter.play(file);
        }
    }
}
