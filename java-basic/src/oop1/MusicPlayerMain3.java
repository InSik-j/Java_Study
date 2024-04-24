package oop1;

// 절차 지향 - 메서드 추출
public class MusicPlayerMain3 {
    public static void main(String[] args) {

        MusicPlayerData data = new MusicPlayerData();

        // 음악 플레이어 켜기
        powerOn(data);

        // 볼륨 증가
        volumeUp(data);
        // 볼륨 증가
        volumeUp(data);
        // 볼륨 감소
        volumeDown(data);

        // 음악 플레이어 상태
        playerState(data);

        // 음악 플레이어 끄기
        powerOff(data);
    }
    public static void powerOn(MusicPlayerData data){
        System.out.println("음악 플레이어를 시작합니다");
        data.isOn = true;
    }
    public static void powerOff(MusicPlayerData data){
        System.out.println("음악 플레이어를 종료합니다");
        data.isOn = false;
    }
    public static void volumeUp(MusicPlayerData data){
        data.volume++;
        System.out.println("음악 플레이어 볼륨 UP"+data.volume);
    }
    public static void volumeDown(MusicPlayerData data){
        data.volume--;
        System.out.println("음악 플레이어 볼륨 DOWN"+data.volume);
    }
    public static void playerState(MusicPlayerData data){
        System.out.println("음악 플레이어 상태 확인");
        if(data.isOn){
            System.out.println("음악 플레이어 ON, 볼륨 : "+data.volume);
        }else{
            System.out.println("음악 플레이어 OFF");
        }
    }

}
