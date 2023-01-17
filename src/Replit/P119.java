package Replit;

public class P119 {
    /*Write a method header with the following specs:
Returns:
a String
Name:
censorLetter
Parameters:
a String
a char
Then complete the method by programming the following behavior
Replace all instances of given character with a "*" within the given String.
See below examples.
Examples:
censorLetter("computer science",'e') ==> "comput*r sci*nc*"
censorLetter("trick or treat",'t') ==> "*rick or *rea*"
```*/
    public String censorLetter(String s,char c){
        String newStr = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == c){
                s=s.replace(c,'*');
            }
        }
        return s;
    }

    public static void main(String[] args) {
        P119 obj = new P119();
        String s = obj.censorLetter("Kathmandu", 'a');
        System.out.println(s);
    }
}
