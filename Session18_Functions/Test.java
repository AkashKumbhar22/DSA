//cpint the number of vowels
public class Test {
   public static int countVowels(String v){
    int count = 0;
    for(int i = 0 ; i < v.length() ; i++){
        if(v.charAt(i) == 'a' || v.charAt(i) == 'e' || v.charAt(i) == 'i' || v.charAt(i) == 'o' || v.charAt(i) == 'u'||
        v.charAt(i) == 'A' || v.charAt(i) == 'E' || v.charAt(i) == 'I' || v.charAt(i) == 'O' || v.charAt(i) == 'U') {
            count++;
        }
    }
    return count;
   }
}
    

