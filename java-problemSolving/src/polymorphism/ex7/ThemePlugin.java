package polymorphism.ex7;

public class ThemePlugin implements Plugin{
    @Override
    public void activate(){
        System.out.println("ThemePlugin 활성화.");
    }

    @Override
    public void deactivate(){
        System.out.println("ThemePlugin 비활성화.");
    }
}
