package com.gmail.wiaripost.mylearning;
/*Дана строка символов. Группы символов, разделенные одним или
        несколькими пробелами и не содержащие пробелов внутри
        себя, будем называть словами. В самом длинном слове
        заменить все буквы «a» на «b».*/

import com.gmail.danze.framework.DanzeHelper;
        import java.util.ArrayList;
        import java.util.List;

public class Learning7SEls27 {
    public static void main(String[] args) {
        System.out.println("Введите числа:");
        String [] f = DanzeHelper.inputStringSequenceFromUser(".");
        List<String> in = new ArrayList<String>();
        List<String> xin = new ArrayList<String>();
        String delimeter = " ";
        for (int i = 0; i < f.length; i++) {
            String t;
            String [] z;
            t = f[i];
            z = t.split(delimeter);
            for (int j = 0; j < z.length; j++) {
                xin.add(z[j]);
            }
        }
        String[] y = xin.toArray(new String[xin.size()]);
        int maxLengthString = 0;
        for(int i=0;i<y.length;i++){
            if(y[i].length()>maxLengthString){
                maxLengthString = y[i].length();
            }
        }
        for(int i=0;i<y.length;i++){
            if(y[i].length()==maxLengthString){
                in.add(y[i].replace("a", "d"));
            }
        }
        System.out.println(in);
    }

}

