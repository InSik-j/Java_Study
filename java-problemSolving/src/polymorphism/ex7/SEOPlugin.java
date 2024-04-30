package polymorphism.ex7;

public class SEOPlugin implements Plugin{
    @Override
    public void activate(){
        System.out.println("SEOPlugin 활성화.");
    }

    @Override
    public void deactivate(){
        System.out.println("SEOPlugin 비활성화.");
    }
}
