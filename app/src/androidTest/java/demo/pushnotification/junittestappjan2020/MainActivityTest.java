package demo.pushnotification.junittestappjan2020;

import android.view.View;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.recyclerview.widget.RecyclerView;
import androidx.test.espresso.contrib.RecyclerViewActions;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.contrib.RecyclerViewActions.scrollToPosition;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.*;

import static org.hamcrest.core.IsNull.notNullValue;
import static androidx.test.espresso.Espresso.onView;


@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> activityRule =
            new ActivityTestRule(MainActivity.class);


    @Test
    public void testField(){
        onView(withId(R.id.changeTextBt)).check(matches(withText("Change text")));
        onView(withId(R.id.editTextUserInput)).perform(typeText("Sarayu"));
        onView(withId(R.id.changeTextBt)).perform(click());
        //onView(withId(R.id.textToBeChanged)).check(matches(withText("Sunita")));//fail
        onView(withId(R.id.textToBeChanged)).check(matches(withText("Sarayu"))); //pass

    }

    @Test
    public void recycleViewTest(){
        MainActivity activity =activityRule.getActivity();
        View recyclerView =activity.findViewById(R.id.rvAnimals);
        assertThat(recyclerView,notNullValue());
        RecyclerView recyclerView1 =(RecyclerView) recyclerView;
        RecyclerView.Adapter adapter =recyclerView1.getAdapter();
        assertThat(adapter.getItemCount(),greaterThan(0));
//        /*onData intead of onView*/
        assertEquals(activity.getName(),new String("Sarayu Yadav"));



}

}