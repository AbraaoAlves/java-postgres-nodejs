package net.work.app.bussiness;

public class MyClass {
  private int age;
  private int adultAge;
  
  public MyClass(int adultAge){
    this.adultAge = adultAge;
  }
  
  public void setAge(int age) {
    this.age = age;
  }
  
  public boolean isAdult(){
    return age>adultAge;
  }  
}
