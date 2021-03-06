package com.robolx.runner;


import com.xtremelabs.robolectric.RobolectricConfig;
import com.xtremelabs.robolectric.RobolectricTestRunner;
import org.junit.runners.model.InitializationError;

import java.io.File;

public class RoboLXTestRunner extends RobolectricTestRunner{
    public RoboLXTestRunner(Class<?> testClass) throws InitializationError {
        super(testClass,new RobolectricConfig(new File("src/test/resources/AndroidManifest.xml"),
                new File("src/test/resources/res")));
    }
}
