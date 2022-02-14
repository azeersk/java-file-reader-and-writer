class threadClass extends Thread{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println(i);
            try{
                Thread.sleep(500);
            }
            catch(Exception e){
                System.out.println("Exception: " + e);
            }
        }
    }
}


public class threadMain {
    public static void main(String[] args){
        threadClass obj = new threadClass();
        threadClass objOne = new threadClass();
        System.out.println("thread name is: " + obj.getName());
        System.out.println("thread name is: " + objOne.getName());
        System.out.println("thread priority is: " + obj.getPriority());
        System.out.println("thread priority is: " + objOne.getPriority());

        obj.setPriority(3);
        objOne.setPriority(5);
        obj.start();
        objOne.start();

        obj.setName("MyThread");
        objOne.setName("newThread");

        System.out.println("thread name is: " + obj.getName());
        System.out.println("thread name is: "+ objOne.getName());
        System.out.println("thread priority is: " + obj.getPriority());
        System.out.println("thread priority is: " + objOne.getPriority());

    }
}
