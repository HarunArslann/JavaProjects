public class Main {
    public static void main(String[] args) {

        int possibility = 0;

        for(int i=1 ; i>=0 ; i--){
            for(int j=2-2*i ; j>=0 ; j--){
                for(int k=4-2*j ; k>=0 ; k--){
                    for(int l = (int) (10-2.5*k); l>=0 ; l--){
                        for(int r=20-2*l ; r>=0 ; r--){
                            for(int m=40-2*r ; m>=0 ; m--){
                                for(int n = (int) (100-2.5*m); n>=0 ; n--){
                                    for(int p=200-2*n ; p>=0 ; p--){
                                        if((i*200+j*100+k*50+l*20+r*10+m*5+n*2+p*1)==200){
                                            possibility++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(possibility);
    }
}