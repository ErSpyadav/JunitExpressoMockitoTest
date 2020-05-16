package demo.pushnotification.junittestappjan2020;

import java.util.Arrays;
import java.util.List;

public class ApiServiceStub implements ApiService {
    @Override
    public List<String> getMathDetail(String value) {
       List<String> detail = Arrays.asList(
               "Math is Good",
               "We love Love Math",
               "Mona like Englisg",
               "Sarayu Practise Math"
       );
        return detail;
    }
}
