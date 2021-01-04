import java.util.*;

public class MakeStars {
    public static void main(String[] args) {

        Scanner lines = new Scanner(System.in);

        while (lines.hasNextLine()) {

            Scanner line = new Scanner(lines.nextLine());
            String starsLine = "";
            while(line.hasNext()) {
                String word = line.next();
                String stars = "";
                for(int i = 0; i < word.length(); i++) {
                    stars += "*";
                }
                starsLine += stars;
                if (line.hasNext()) { starsLine += " ";}
            }
            System.out.println(starsLine);
            line.close();
        }
        lines.close();
    }
}