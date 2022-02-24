package io.thewokecoder.pojogeneratorexample;

import io.thewokecoder.pojo.Employee;

public class Application {

  public static void main(String[] args) {
    var employee1 = new Employee().withFirstName("John").withLastName("Doe").withAge(42D);
    System.out.println(employee1);
  }
}
