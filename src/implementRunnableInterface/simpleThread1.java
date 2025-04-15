package implementRunnableInterface;

public class simpleThread1 implements Runnable{
    public simpleThread1(){
        Thread t1 = new Thread( this,"simple Thread1");
        t1.start();
    }
    @Override
    public void run() {
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
