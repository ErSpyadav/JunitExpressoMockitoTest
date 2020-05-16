package demo.pushnotification.junittestappjan2020;

public class Calculator {

    public int addTwoNum(int a, int b) {
        return a + b;
    }

    public int subTwoNum(int a, int b) {
        return a-b;
    }

    public void divideTwoNum(int a,int b){
        int result= 1/0;
    }

    public void timeOut() throws Exception{
        Thread.sleep(1000);
    }
}
