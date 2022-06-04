public class Main {
    public static void main(String[] args) {

        int totalCount = 0;

        for(int i=1 ; i<= 9 ; i++){
            totalCount = totalCount + oneDigitCount(i);
            System.out.println(i + "---->" + oneDigitCount(i));
        }

        for(int i=10 ; i<= 99 ; i++){
            totalCount = totalCount + twoDigitCount(i);
            System.out.println(i + "---->" + twoDigitCount(i));
        }

        for(int i=100 ; i<= 1000 ; i++){
            totalCount = totalCount + threeDigitCount(i);
            System.out.println(i + "---->" + threeDigitCount(i));
        }

        System.out.println(totalCount);

        }

        public static int threeDigitCount(int number){

            int count = 0;
            int hundredand = 10;

            switch (number / 100) {
                case 1, 2, 3, 4, 5, 6, 7, 8, 9->
                        count = oneDigitCount(number / 100) + hundredand + twoDigitCount(number % 100);
                case 10 -> count = oneDigitCount(number / 1000) + 8;
            }

            return count;
        }

        public static int twoDigitCount(int number){

            int count = 0;
            if(number >= 10){
                switch (number/10){
                    case 0:
                        count = 0;
                        break;
                    case 1:
                        switch (number % 10) {
                            case 0:
                                count = 3;
                                break;
                            case 1:
                            case 2:
                                count = "eleven".length();
                                break;
                            case 3:
                            case 4:
                            case 8:
                            case 9:
                                count = "fourteen".length();
                                break;
                            case 5:
                            case 6:
                                count = "fifteen".length();
                                break;
                            case 7:
                                count = "seventeen".length();
                                break;
                        }break;
                    case 2:
                    case 3:
                    case 8:
                    case 9:
                        count = "twenty".length() + oneDigitCount(number % 10);
                        break;
                    case 4:
                    case 5:
                    case 6:
                        count = "forty".length() + oneDigitCount(number % 10);
                        break;
                    case 7:
                        count = "seventy".length() + oneDigitCount(number % 10);
                        break;
                }
                }else{
                count = oneDigitCount(number);
            }

            return count;
        }

        public static int oneDigitCount(int number){

        int count = 0;

            switch (number){
                case 0:
                    count = 0;
                    break;
                case 1:
                case 2:
                case 6:
                    count = "one".length();
                    break;
                case 3:
                case 7:
                case 8:
                    count = "seven".length();
                    break;
                case 4:
                case 5:
                case 9:
                    count = "four".length();
                    break;
            }
        return count;
    }
}