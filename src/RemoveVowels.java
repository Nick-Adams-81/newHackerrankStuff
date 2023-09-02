import java.util.Locale;

public class RemoveVowels {
    public String removeVowels(String str) {
        return str.replaceAll("[aeiou]", "");
    }

    public String remove(String str) {
      StringBuilder result = new StringBuilder();
      String vowels = "aeiouAEIOU";
      for(int i = 0; i < str.length(); i++) {
          char ch = str.charAt(i);
          if(vowels.indexOf(ch) == -1) {
              result.append(ch);
          }
      }
      return result.toString();
    }

}
