package ImpPrograms;

public class DuplicateCharacters {

    public static void main (String[]args){
        duplicateCharacters();
    }
    static void duplicateCharacters() {
        String in = "This is a string, which needs to tested";
        int count;
        char c[] = in.toCharArray();
        System.out.println("Duplicate characters in a string");
        for (int i = 0; i < c.length; i++) {
            count = 1;
            for (int j = i + 1; j < c.length; j++) {
                if (c[i] == c[j] && c[i] != ' ') {
                    count++;
                    c[j] = '0';
                }
            }

            //if count>1

            if (count > 1 && c[i] != '0') {
                System.out.println(c[i] + " = " + count);
            }
        }
    }
}
