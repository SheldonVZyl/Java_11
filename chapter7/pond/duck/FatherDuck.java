package chapter7.pond.duck;
//This is perfectly legal code because everything is one class:

public class FatherDuck {
    private String noise = "quack";

    private void quack() {
        System.out.println(noise); // private access is ok
    }

    private void makeNoise() {
        quack(); // private access is ok
    }
}

