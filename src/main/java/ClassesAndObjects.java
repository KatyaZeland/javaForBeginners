public class ClassesAndObjects {
    public  static void main(String[] args) {
      Person person1 = new Person();
      person1.name = "����";
      person1.age = 40;
      person1.speak();
        person1.sayHello();
      Person person2 = new Person();
      person2.name = "����";
      person2.age = 20;
     int year1 = person1.calculateYearsToRetirement();
     int year2 = person2.calculateYearsToRetirement();
        System.out.println("������� �������� �� ������: " + year1+ "���" );
        System.out.println("������� �������� �� ������: " + year2+ "���" );
    }
}
class Person{
    String name;
    int age;
 int calculateYearsToRetirement(){
     int years =65-age;
     return years;
 }
    void  speak(){
     for (int i=0; i<3;i++) {
         System.out.println("���� ����� " + name + "," + "��� " + age + " ���");
     }
 }
     void sayHello(){
         System.out.println("������!");
     }
 }

