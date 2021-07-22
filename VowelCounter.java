import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        int a =0;
        int e =0;
        int i =0;
        int o =0;
        int u =0;
        int nonVowel =0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String user = scan.next();

        for(int k=0; k<user.length();k++){
            char ch = user.charAt(k);
            if (ch == 'a'){
                a++;
            }
            if (ch == 'e'){
                e++;
            }
            if (ch == 'i'){
                i++;
            }
            if (ch == 'o'){
                o++;
            }
            if (ch == 'u') {
                u++;
            }
            if (ch !='a'&& ch !='e'&& ch !='i'&& ch !='o'&& ch !='u'){
                nonVowel++;
            }
        }
        System.out.println("a: " + a);
        System.out.println("e: " + e);
        System.out.println("i: " + i);
        System.out.println("o: " + o);
        System.out.println("u: " + u);
        System.out.println("non-vowel: " + nonVowel);
        
        scan.close();
    }
}
