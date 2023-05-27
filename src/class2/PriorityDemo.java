package class2;

import org.testng.annotations.Test;

public class PriorityDemo {

    @Test(priority = 2)
    public void firstMethod(){

        System.out.println("I am first method but i should run second");
    }
    @Test(priority = 3)
    public void secondMethod(){

        System.out.println("I am second method but i should run third");
    }
    @Test(priority = 1)
    public void thirdMethod(){
        System.out.println("I am third method but i should run first");
    }

}
