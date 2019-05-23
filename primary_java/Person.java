public class Person{
   int age;
   public Person(String name,int work_experience){
      System.out.println("Hello," + name + "!");
	  System.out.println("you have " + work_experience + " years working experience,aren't you?"); 
   }
 
   public void setAge(int new_age){
       age = new_age;
   }
 
   public int getAge( ){
       System.out.println("you are " + age + " years old,aren't you?"); 
       return age;
   }
 
   public static void main(String[] args){
      Person me = new Person("nick", 3);
      me.setAge(13);
      me.getAge();
      System.out.println("l am " + me.age + " years old"); 
   }
}
