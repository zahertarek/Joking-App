package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.os.SystemClock;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Pair;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * Created by New on 2/7/2018.
 */

@RunWith(AndroidJUnit4.class)
public class TestClass {

    Context context;
    @Test
    public void asynctest(){
        context = InstrumentationRegistry.getContext();
        MainActivity.EndpointsAsyncTask endpointsAsyncTask = new MainActivity.EndpointsAsyncTask(){

            @Override
            protected void onPostExecute(String result) {
                assertTrue(result!=null);
            }
        };

        endpointsAsyncTask.execute(new Pair<Context, String>(context,"s"));
    }
}
