import java.util.List;
public class Strings{
    public static void main(String args[]){
        String name = "nick";
        System.out.println(name);
        System.out.println(name.length());
        String age = "13 years old";
        System.out.println(name + " is " + age);
        System.out.printf("My name is %s, l am %s\n", name, age);
        String sentence = String.format("My name is %s, l am %s", name, age);
        String a[] = sentence.split(",");
        for(String i: a){
            System.out.println(i);
        }
        String new_sentence = sentence.replaceAll(" ", " whitespace ");
        System.out.println(new_sentence);
        int length = sentence.length();
        System.out.println(length);
        int index = sentence.indexOf("a");
        System.out.println(index);
        System.out.println(sentence.startsWith("My"));
    }
}