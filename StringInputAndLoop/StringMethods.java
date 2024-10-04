import java.util.Arrays;
import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        // 1. Length()
        String s1 = "Java";
        System.out.println("Java");
        System.out.println(s1.length());  //4
        System.out.println("Jav a".length());  //5
        System.out.println("Java/n".length());  //6

        // 2. isEmpty()
        String s2 = "";
        String s21 = "not Empty";
        System.out.println(s2.isEmpty());  //true
        System.out.println(s21.isEmpty());   //false

        // 3. TRIM
        String s3 = " hello ";
        System.out.println(s3 + "how are you");     // hello how are you
        System.out.println(s3.trim() + "how are you");      //hellohow are you

        // 4. toLowerCase()
        String s4 = "HELLO how ARE you";
        System.out.println(s4.toLowerCase());       //hello how are you

        // 5. toUpperCase()
        System.out.println(s4.toUpperCase());   //HELLO HOW ARE YOU

        // 6. concat()
        String s6 = "My:";
        String s61 = "Name: is: Pemba";
        System.out.println(s6.concat(s61));     //My:Name: is: Pemba

        // 7. split()
        String[] result = s61.split(":");
        System.out.println("result is " + Arrays.toString(result));  //result is [Name, is, Pemba]

        //8. charAt()
        String s8 = "Java";
        System.out.println(s8.charAt(0));   //J

        //9. compareTo()
        String s91="hello";
        String s92="hello";
        String s93="hemlo";
        String s94="flag";
        System.out.println(s91.compareTo(s92)); // 0 because both are equal
        System.out.println(s91.compareTo(s93)); //-1 because "l" is only one time lower than "m"
        System.out.println(s91.compareTo(s94)); // 2 because "h" is 2 times greater than "f"

        //10. subString()
        String str1 = "java is fun";
        System.out.println(str1.substring(0, 4));   //java

        //11. indexOf(), result = str1.indexOf('s');

        //12. contains(), result = str1.contains("Java"); //true or false
        //13. replace(), System.out.println("Lava".replace('L', 'J'));  //Java
        //14. replaceAll(), "Java123is456fun".replaceAll("//d", " ") //replace all digits with space
        //15. string compares, equals() or == or compareTo()
        //16. equals(), s1.equals(s2); //true or false
        //17. System.out.println(s1==s2) //true or false
        //18. System.out.println(s1.compareTo(s2)); //0 or 1 if (s1>s3) or -1 (s1<s4)


    }
}
