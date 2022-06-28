public class Person {
  private String name;
  private int age;
  private char sex;

  Person(){
    name = this.name;
    age = this.age;
    sex = this.sex;
  }

  public void setName(String newName){
    this.name = newName;
  }

  public void setAge(int newAge){
    this.age = newAge;

  }

  public void setSex(char newSex){
    this.sex = newSex;

  }

  public String getName(){
    return name;

  }

  public int getAge(){
    return age;
  }

  public char getSex(){
    return sex;
  }
}
