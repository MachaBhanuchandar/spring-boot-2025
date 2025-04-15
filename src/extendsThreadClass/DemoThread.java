package extendsThreadClass;

public class DemoThread extends Thread{
    public DemoThread(){
        start();
    }
    @Override
    public  void run(){
        try{
            System.out.println("part2- printing the numbers from 10-1 in descending order");
            for (int j=10;j>=1;j--){
                System.out.println("j value is : "+j);
                Thread.sleep(5);

            }

        } catch(Exception e){
            System.out.println("Exception occured : "+e.getMessage());

        }



    }
}
