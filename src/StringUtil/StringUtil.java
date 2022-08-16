package StringUtil;

public class StringUtil {
    //Տրված տեքստից Ջնջում ենք սկզբի և վերջի բացատները(պռաբելները) և արդյունքը վերադարձնում ենք
    public String trim(String text) {
        while (text.startsWith(" ")) {
            text = text.substring(1);
        }

        while (text.endsWith(" ")) {
            text = text.substring(0, text.length() - 2);
        }
        return text;
    }


    //Վերադարձնում ենք տրված տեքստի մեջ տրված սինվոլի քանակը․
    public int getCountBySymbol(String text, char symbol) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == symbol) {
                count++;
            }
        }
        return count;
    }

    //Վերադարձնում ենք տրված տեքստի մեջ տրված սինվոլների ընդհանուր քանակը․
    public int getCountBySymbols(String text, char... symbols) {
        int count = 0;
        for (int i = 0; i < symbols.length; i++) {
            count += getCountBySymbol(text, symbols[i]);
        }
        return count;
    }

    //Վերադարձնում է մեջտեղի 2 տառերը
    public String middleTwo(String str) {
        if (str.length() <= 1) {
            return str;
        } else {
            int len = str.length();
            return "" + str.charAt(len / 2 - 1) + str.charAt(len / 2);
        }
    }

    //Վերադարձնում է true եթե տրված տեքստը վերջանում է ly-ով, հակառակ դեպքում false
    public boolean endsLy(String str) {
        if (str.substring(str.length() - 2).equals("ly")) {
            return true;
        } else
            return false;
    }

    //Եթե front-փոփոխականը տանք true կվերադարձնի տրված str-ի առաջին տառը, հակառակ դեպքում վերջինը։
    public String theEndOrFront(String str, boolean front) {
        if (front == true) {
            return "" + str.charAt(0);
        } else
            return "" + str.charAt(str.length() - 1);
    }

    //վերադարձնում է true, եթե տրված տեքստը սկսվում է bad բառով,
    // կամ 2րդ տառից սկսած է պարունակում bad բառը։ օր․ xbadxx -> true, xxbadxx -> false
    public boolean hasBad(String str) {
//        if (str.length()<= 2){
//            return false;
//        }
//        else if(str.substring(0,3).equals("bad") || str.substring(1,4).equals("bad")){
//            return true;
//        }else
//            return false;

        int index0fbed = str.indexOf("bad");
        return index0fbed == 0 || index0fbed == 1;
    }

    //Վերադարձնում է առաջին 2 տառերը։ օր․ Hello-> He
    public String firstTwo(String str) {
        return "" + str.charAt(0) + str.charAt(1);
        //return str.substring(0,2);
    }

    //Հետաքրքիր է ։Ճ
    //Վերադարձնում է true եթե տեքստը պարունակում է bob բառը, բայց o-ի տեղը կարող է լինել ցանկացած սինվոլ։
    //օր․ abcbob → true, b9b -> true, բայց ասենք bac-> false
    public boolean bobThere(String str) {
        boolean res = false;
        for (int i = 0; i < str.length() - 2; i++) {

            if (str.charAt(i) == 'b') {
                if (str.charAt(i + 2) == 'b') {
                    res = true;
                    break;
                }
            }
        }
        return res;
    }

    //Ավելի հետաքրքիր է ։Ճ
    //Վերադարձնում է տրված տեքստի վերջին n քանակի սինվոլները n անգամ
    //օր․ ("Hello", 3) → "llollollo", ("Hello", 2) → "lolo", ("Hello", 1) → "o"
    public String repeatEnd(String str, int n) {
        String ends = "";
        for (int i = 0; i < n; i++) {
            ends += str.substring(str.length() - n);
        }
        return ends;
    }

    //Վերադարձնում է 2 ընդունող տեքստերի խառնուրդը))
    //օր․ ("abc", "xyz") → "axbycz",    ("Hi", "There") → "HTihere", ("xxxx", "There") → "xTxhxexre"
    public String mixString(String a, String b) {
        String ab = "";
        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                ab += "" + a.charAt(i) + b.charAt(i);
            }
        } else if (a.length() < b.length()) {
            for (int i = 0; i < a.length(); i++) {
                ab += "" + a.charAt(i) + b.charAt(i);
            }
            ab += b.substring(b.length() - a.length());
        } else {
            for (int i = 0; i < b.length(); i++) {
                ab += "" + a.charAt(i) + b.charAt(i);
            }
            ab += b.substring(a.length() - b.length());
        }
        return ab;
    }

    //Վերադարձնում ենք տրված տեքստի revers եղած տարբերակը․
    public String reverse(String str) {
        String text = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            text += str.charAt(i);
        }
        text = str;
        return str;
    }
}
