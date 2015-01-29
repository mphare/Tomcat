package com.whitehare.simple.java;

public class SimpleJavaException
{

  /**
   * @param args
   */
  public static void main(String[] args)
  {
    // TODO Auto-generated method stub

    System.out.println("Hello, world");
    SomeStuff ss = new SomeStuff();

    ss.writeSomeStuff();

    String[] strArray = new String[2];

    try
    {
      strArray[4] = "Hello";
    } catch (ArrayIndexOutOfBoundsException e)
    {
      e.printStackTrace();
    }

    System.out.println("Completed");

  }

}
