package task1.task11.controller;

import task1.task11.model.NumberContainer;

public class NumberTypeConverter {

    public static String convert(NumberContainer container, int systemNumber){
        int value = container.getDecimalDigit();
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int remainder;
        StringBuilder result = new StringBuilder();

        switch (systemNumber){
            case 2:
            case 8:
                while (value!=0){
                    remainder = value%systemNumber;
                    result.append(remainder);
                    value = value/systemNumber;
            }break;
            case 16:
                while (value!=0){
                    remainder = value%systemNumber;
                    result.append(hex[remainder]);
                    value = value/systemNumber;
                }


        }
        return result.reverse().toString();
    }

}
