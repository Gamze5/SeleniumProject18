package test.day5_testing_intro;

import org.testng.annotations.Test;

public class Grouping {
    @Test(groups={"sanity-group"})
    public void testOne(){
        System.out.println("This is sanity group ");
    }


    @Test(enabled=false)
    public void testTwo(){
        System.out.println("Thiis is not sanity group");
    }

    @Test(groups={"sanity-group"})
    public void testThree(){
        System.out.println("This is sanity group ");
    }

}
