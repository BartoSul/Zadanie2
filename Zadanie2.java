class Zadanie2{
    public static void main(String[] args){

        long value=0;
        long sum=0;
        long ncount= 0;
        long fn0= 1;
        long fn1= 2;
        while(true){
  
            value= fn0;
            if(value > 4000000){
                break;
            }
            ncount++;
            System.out.println( ncount+ "th number=" + value);
            fn0= fn0 + fn1;
            if(value % 2 == 0){
                sum= sum + value;
                System.out.println("sum=" +sum);
            }
            value= fn1;
            if(value > 4000000){
                break;
            }
            ncount++;
            System.out.println( ncount+ "th number=" + value);
            fn1= fn0 + fn1;
            if(value % 2 == 0){
                sum= sum + value;
            System.out.println("sum=" + sum);
            }


            
            
            
            

        }
    }
}