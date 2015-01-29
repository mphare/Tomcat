package com.whitehare.simple.java;

import org.apache.log4j.Logger;

public class SimpleJavaExceptionLog4j
{

  private static Logger logger = Logger.getLogger("Demo1");

  /**
   * @param args
   */
  public static void main(String[] args)
  {
    // TODO Auto-generated method stub

    logger.trace("This is TRACE level");
    logger.debug("This is DEBUG level");
    logger.info("This is INFO level");
    logger.warn("This is WARN level");
    logger.error("This is ERROR level");
    logger.fatal("This is FATAL level");

    logger.info("method Started");

    System.out.println("Hello, world");
    SomeStuff ss = new SomeStuff();

    ss.writeSomeStuff();

    String[] strArray = new String[2];

    try
    {
      // This is going to fail because the size of the strArray is only defined
      // as 2
      strArray[4] = "Hello";
    } catch (ArrayIndexOutOfBoundsException e)
    {
      e.printStackTrace();
      logger.error("Error occurred due to: ", e);
    }

    System.out.println("Completed");

    logger.info("method Finished");
  }

}
