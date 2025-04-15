package extendsThreadClass;

public class sampleThread extends Thread{


    public sampleThread(){
        start();
    }
    @Override
    public  void run(){
        try{
            System.out.println("part1- printing the numbers from 1-10 in ascending order");
            for (int i=1;i<=10;i++){
                System.out.println("i value is : "+i);
                Thread.sleep(5);
            }
        } catch (Exception e){
            System.out.println("Exception occured : "+e.getMessage());
        }

    }

}
