public class HelloMaven {

    public static void main(String[] args) {
        HelloMaven hm = new HelloMaven();
        hm.speak("Hello World!");
    }

    public HelloMaven(){

    }

    public void speak(String msg){
        System.out.println(msg);
        System.out.println("msj from project 'Hello Maven'");
    }
}
