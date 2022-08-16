package StringUtil;

public class Demo {
    public static void main(String[] args) {
        StringUtil ob1 = new StringUtil();

        System.out.println(ob1.trim("   jghjo bgfh n h    "));
        System.out.println(ob1.getCountBySymbol("jjyaa dfy ogad", 'a'));
        System.out.println(ob1.getCountBySymbols("jghjo bgjjjfh on ho", 'o', 'j'));
        System.out.println(ob1.middleTwo("abhjgjm tk f"));
        System.out.println(ob1.endsLy("kghkukul"));
        System.out.println(ob1.theEndOrFront("hjjyuy", false));
        System.out.println(ob1.hasBad("ahjhjbadlili"));
        System.out.println(ob1.firstTwo("hjyhjyfjyj"));
        System.out.println(ob1.repeatEnd("gngjyhjfgt", 3));
        System.out.println();
        System.out.println(ob1.mixString("hi", "ghj"));
    }
}
