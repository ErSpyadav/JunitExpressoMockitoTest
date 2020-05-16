package demo.pushnotification.junittestappjan2020;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Before;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class ApiServiceImplTest {

    @Before
    public void  onSetup() {

    }

    @Test
    public void getMathDetail() {
        /*We are using stub class to return value*/
        ApiService apiService =new ApiServiceStub();
        ApiServiceImpl apiServiceImpl = new ApiServiceImpl(apiService);
        List<String> list = apiServiceImpl.getMathDetail("Math");
        assertEquals(3, list.size());
    }

    @Test
    public void getMathDetailMock() {
        /*we can mock of class and interface.apiService.getDetail will return empty list
        * That why create to return some value
        * Instead of Stub we are using Mock*/

        ApiService apiServiceMock =mock(ApiService.class);
        //apiService.getMathDetail("Dummy")//we are calling on dummy so it will not return any thing
        List<String> todos = Arrays.asList(
                "Math is Good",
                "We love Love Math",
                "Mona like Englisg",
                "Sarayu Practise Math"
        );
        when(apiServiceMock.getMathDetail("Math")).thenReturn(todos);
        ApiServiceImpl apiServiceImpl =new ApiServiceImpl(apiServiceMock);
        List<String> filterDetail =apiServiceImpl.getMathDetail("Math");
        assertEquals(3,filterDetail.size());
    }
}