public class RemoveVowels {
    public String removeVowels(String str) {
        return str.replaceAll("[aeiou]", "");
    }

//    public String remove(String str) {
//        str = str.toLowerCase();
//        String result = "";
//        for(int i = 0; i < str.length(); i++) {
//            if(str.charAt(i) != 'a' || str.charAt(i) != 'e' || str.charAt(i) != 'i' || str.charAt(i) != 'o' || str.charAt(i) != 'u') {
//                result = result + str.charAt(i);
//            }
//        }
//        return result;
//    }
}
