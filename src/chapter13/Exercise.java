package chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lulei on 2017/6/2.
 */
public class Exercise {
    public static final String testStr1 = "Java now has regular expressions";
    private Pattern p;
    public Exercise(String regex) {
        this.p = Pattern.compile(regex);
    }

    public boolean matches(String testStr1) {
        Matcher m = p.matcher(testStr1);
        boolean res = m.find();
        if (res){
            System.out.println(m.group());
        }
        return res;

    }
    public static void main(String[] args) {
        Exercise e1 = new Exercise("\\W+[^A-Z]\\w+");
        System.out.println(e1.matches(testStr1));
    }
}
