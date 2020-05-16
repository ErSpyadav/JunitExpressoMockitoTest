package demo.pushnotification.junittestappjan2020;

import java.util.ArrayList;
import java.util.List;

public class ApiServiceImpl {

    ApiService apiService;

    public ApiServiceImpl(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<String> getMathDetail(String searchVal){
        List<String> list =new ArrayList<>();
        List<String> detail =apiService.getMathDetail(searchVal);
        for(String str:detail){
            if(str.contains(searchVal))
                list.add(str);
        }
        return list;
    }
}
