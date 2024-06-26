package poly.ex2;

// 배열과 메스드를 활용한 리팩터링
public class AnimalPolyMain3 {
    public static void main(String[] args) {

        Animal[] animalArr = {new Dog(), new Cat(), new Caw()};

        // 동물이 추가 되어도 변하지 않는 코드
        for(Animal animal : animalArr) {
            soundAnimal(animal);
        }
    }
    //동물이 추가 되어도 변하지 않는 코드
    private static void soundAnimal(Animal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    // 메서드 생성 단축키 : 실행 문장 선택 + ctrl + alt + M
    // iter : 향상된 for 문 생성
}
