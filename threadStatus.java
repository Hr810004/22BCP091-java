class A extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            try{
                if(i==3){
                    sleep(5000);
                    System.out.println("is run method alive:" + Thread.currentThread().isAlive());
                }
            }
            catch(Exception e){}
            System.out.println("from thread: i = " + i );
        }
        System.out.println("Exit from A");
    }
}
class threadStatus{
    public static void main(String[] args) {
        A t1 = new A();
        System.out.println("Thread a is alive:" + t1.isAlive());
        t1.start();
        System.out.println("Thread a is alive:" + t1.isAlive());
    }  
}


