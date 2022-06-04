public class Main {
    public static void main(String[] args) {

        String number = "";
        int maxPandigital = 0;
        int maxNumber = 0;



        for(int i = 150000000 ; i > 1 ; i--){
            for(int n = 1 ; n < 10  ;n++){

                number = number + i * n ;

                if(!isNotRepeated(number)){
                    break;
                }else if(isNineDigits(number) < 9){
                    continue;
                }else if (isNineDigits(number) == 9) {
                    if(Integer.parseInt(number) > maxPandigital){
                        maxPandigital = Integer.parseInt(number);
                        maxNumber = i;
                    }
                }else{
                    break;
                }
            }
            number = "";
        }
        System.out.println(maxPandigital);
        System.out.println(maxNumber);
    }

    public static int isNineDigits(String number){

        return number.length();
    }
    public static boolean isNotRepeated(String number){

        if(number.contains("0")){
            return false;
        }

        for(int i = 0 ; i < number.length() - 1; i++){
            for(int j = i + 1 ; j < number.length() ; j++){
                if(number.charAt(i) == number.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
}