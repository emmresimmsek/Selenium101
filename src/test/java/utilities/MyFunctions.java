package utilities;

public class MyFunctions {

    public static void Bekle(int second){

        try {
            Thread.sleep(1000 * second );
        } catch (InterruptedException e ) {

            throw new RuntimeException(e);
        }


    }






}
