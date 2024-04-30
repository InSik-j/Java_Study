package polymorphism.ex7;

public class SocialMediaPlugin implements Plugin{
    @Override
    public void activate(){
        System.out.println("SocialMediaPlugin 활성화.");
    }

    @Override
    public void deactivate(){
        System.out.println("SocialMediaPlugin 비활성화.");
    }
}
