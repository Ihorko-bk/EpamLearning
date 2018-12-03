package lesson00;

public class Diamond {
    public static void main(String[] args) {
        createDiamond("BeautifulDiamond");
    }
    static void createDiamond(String str) {
        int countOfCycles = str.length()%2==0 ? str.length() : str.length()-1;
        for (int i=0, inc=1, from=str.length()%2==0?str.length()/2-1:str.length()/2, to=str.length()/2;
             i <= countOfCycles; i++) {
            System.out.println(getSubstringWithSpaces(str, from, to));
            if (from==0) inc*=-1;
            from+=-inc; to+=inc;
        }
    }
    static String getSubstringWithSpaces(String str, int from, int to) {
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) if (i<from || i>to) sb.append(' '); else sb.append(chars[i]);
        return sb.toString();
    }
}
