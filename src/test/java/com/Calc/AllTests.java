package com.Calc;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CheckVisibility.class, Tests.class, TestsMinus.class, TestsDivide.class, TestsMultiply.class })
public class AllTests {

}
