import java.util.Scanner;

public class Main {

    private static final String numbers = ".0123456789";
    private static String str;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        str = input.nextLine();

        System.out.format(calculate(str));

    }
    public static String calculate(String strn){

        while(str.contains("(")){

            String part = str.substring(0,str.indexOf(")") + 1);

            String pStr = str.substring(part.lastIndexOf("(") + 1, str.indexOf(")"));

            str = solveParantheses(pStr, part.lastIndexOf("("));

        }

        String[] newStr;

        while(hasOperator(str.substring(1))){

            newStr = findNumbersAndOperator(str);
            String oldStr = newStr[0] + newStr[1] + newStr[2];
            str = str.replace(oldStr,operations(Double.parseDouble(newStr[0]), newStr[1],Double.parseDouble(newStr[2])));

        }
        return str;
    }
    public static String[] findNumbersAndOperator(String str){

        String number = "";
        String[] list = new String[3];
        boolean stopOuter = true;

        if(str.contains("*") || str.contains("/")){
            int index;
            if(str.contains("*") && str.contains("/")){
                index = Math.min(str.indexOf("*"), str.indexOf("/"));
            }else if(str.contains("*")){
                index = str.indexOf("*");
            }else{
                index = str.indexOf("/");
            }
            list[1] = String.valueOf(str.charAt(index));

            for(int i = index - 1 ;stopOuter ;i--){
                if(i >= 0 && numbers.contains(String.valueOf(str.charAt(i)))){
                    number = str.charAt(i) + number;
                }else{
                    list[0] = number;
                    number = "";
                    for(int j = index + 1 ; ; j++ ){
                        if(j < str.length() && numbers.contains(String.valueOf(str.charAt(j)))){
                            number = number + str.charAt(j);
                        }else{
                            list[2] = number;
                            stopOuter = false;
                            break;
                        }
                    }
                }
            }
            return list;
        }

        if(str.contains("+") || str.contains("-")){

            int index;

            if(str.contains("+") && str.substring(1).contains("-")){
                index = Math.min(str.indexOf("+"), str.substring(1).indexOf("-") + 1);
            }else if(str.substring(1).contains("-")){
                index = str.substring(1).indexOf("-") + 1;
            }else{
                index = str.indexOf("+");
            }
            list[1] = String.valueOf(str.charAt(index));

            for(int i = index - 1 ;stopOuter ;i--){
                if(i >= 0 && numbers.contains(String.valueOf(str.charAt(i)))){
                    number = str.charAt(i) + number;
                    if(str.charAt(0) =='-'){
                        number = str.charAt(0) + number;
                    }
                }else{
                    list[0] = number;
                    number = "";
                    for(int j = index + 1 ; ; j++ ){
                        if(j < str.length() && numbers.contains(String.valueOf(str.charAt(j)))){
                            number = number + str.charAt(j);
                        }else{
                            list[2] = number;
                            stopOuter = false;
                            break;
                        }

                    }
                }
            }
            return list;
        }
        return list;
    }
    public static String solveParantheses(String pStr, int index){

        String[] newStr;
        String result = pStr;

        while(hasOperator(result)){
            if(result.charAt(0) == '-'){
                break;
            }
            newStr = findNumbersAndOperator(result);
            String oldStr = newStr[0] + newStr[1] + newStr[2];
            String replaceStr = operations(Double.parseDouble(newStr[0]), newStr[1],Double.parseDouble(newStr[2]));
            result = result.replace(oldStr, replaceStr);

        }

        str = str.replace("(" + pStr + ")",result);

        if(str.charAt(index) == '-'){
            if(!hasOperator(str.substring(1))){
                return str;
            }
            switch (str.charAt(index - 1)) {
                case '*' -> {
                    for (int i = index - 2; ; i--) {
                        if (!numbers.contains(String.valueOf(str.charAt(i)))) {
                            index = i;
                            break;
                        }
                    }
                    if (str.charAt(index) == '-') {
                        str = str.substring(0, index) + "+" + str.substring(index + 1);
                    }
                    if (str.charAt(index) == '+') {
                        str = str.substring(0, index) + "-" + str.substring(index + 1);
                    }
                    str = str.replace("*-", "*");
                }
                case '/' -> {
                    for (int i = index - 2; ; i--) {
                        if (!numbers.contains(String.valueOf(str.charAt(i)))) {
                            index = i;
                            break;
                        }
                    }
                    if (str.charAt(index) == '-') {
                        str = str.substring(0, index) + "+" + str.substring(index + 1);
                    }
                    if (str.charAt(index) == '+') {
                        str = str.substring(0, index) + "-" + str.substring(index + 1);
                    }
                    str = str.replace("*-", "/");
                }
                case '-' -> str = str.replace("--", "+");
                case '+' -> str = str.replace("+-", "-");
            }
        }
        return str;
    }
    public static String operations(double number1,String operator, double number2){

        double value = switch (operator) {
            case "*" -> number1 * number2;
            case "/" -> number1 / number2;
            case "+" -> number1 + number2;
            case "-" -> number1 - number2;
            default -> 0;
        };

        return String.valueOf(value);

    }
    public static boolean hasOperator(String pStr){

        return pStr.contains("*") || pStr.contains("/") || pStr.contains("+") || pStr.contains("-");
    }
}