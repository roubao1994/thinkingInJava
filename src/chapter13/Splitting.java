package chapter13;

import java.util.Arrays;

/**
 * Created by lulei on 2017/6/1.
 */
public class Splitting {
    public static final String knights = "Then, when you have found the shrubbery, " +
            "you must cut down the mightiest tree in the forest... with... a herring!";

    public static void main(String[] args) {
        // 开头大写，以句号结尾
        String regex1 = "^[A-Z].*\\.$";
        System.out.print("Test".matches(regex1));
        System.out.print("TEst.".matches(regex1));

        System.out.println(Arrays.toString(knights.split("the|you")));

        System.out.println(knights.replaceAll("a|e|i|o|u", "_"));
    }
}
