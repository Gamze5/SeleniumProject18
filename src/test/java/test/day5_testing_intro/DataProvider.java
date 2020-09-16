package test.day5_testing_intro;

import org.testng.annotations.Test;

public class DataProvider {

    @org.testng.annotations.DataProvider(name="test")
    public Object[][] getData() {
    Object[][] data= new Object[3][2];
       data[0][0]="user1";
       data[0][1]="password1";

        data[1][0]="user2";
        data[1][1]="password2";

        data[2][0]="user3";
        data[2][1]="password3";
        return data;
    }
    @Test(dataProvider = "test")
    public void login(String username,String password){
        System.out.println(username+" "+password);
    }

}
