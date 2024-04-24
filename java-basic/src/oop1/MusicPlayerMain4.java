package oop1;

// 객체 지향
public class MusicPlayerMain4 {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        // on
        musicPlayer.on();

        // volume Up
        musicPlayer.volumeUp();
        musicPlayer.volumeUp();

        // volume Dowm
        musicPlayer.volumeDown();

        // 음악 플레이어 상태 확인
        musicPlayer.showState();

        //off
        musicPlayer.off();
    }
}
