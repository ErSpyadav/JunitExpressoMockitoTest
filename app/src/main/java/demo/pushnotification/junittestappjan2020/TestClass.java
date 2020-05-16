package demo.pushnotification.junittestappjan2020;

import java.util.List;

public class TestClass {

    public static void main(String[] args) {
        ApiServiceStub apiServiceStub =new ApiServiceStub();
        ApiServiceImpl apiImp =new ApiServiceImpl(apiServiceStub);
        List<String > list =apiImp.getMathDetail("Math");
        System.out.print(list);
    }
}
