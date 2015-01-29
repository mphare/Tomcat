package com.whitehare.simple.test;

import static org.junit.Assert.fail;

import org.apache.log4j.Logger;
import org.junit.Test;

public class SimpleTest
{
  private static Logger log = Logger.getLogger("Demo1");

  @Test
  public void test()
  {
    log.debug("In the testcase");
    fail("Not yet implemented");
  }

}
