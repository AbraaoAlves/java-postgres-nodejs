package net.work.app.bussiness;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class MyClassTests {
  
  @Test
  void isAdult() {
    MyClass obj = new MyClass(18);
    obj.setAge(26);
    assertTrue(obj.isAdult());
  }  
}
