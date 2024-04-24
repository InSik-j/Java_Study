package root;

public class RootEx2 {
    public static void main(String[] args) {
        int num=2;
        int count=1;

        while (count<=10){
            System.out.println("while- "+num);
            num+=2;
            count++;
        }

        for(count=1, num=2;count<=10;num+=2, count++){
            System.out.println("for- "+num);
        }
    }
}
