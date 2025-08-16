import java.util.Random;
class random_num
{ public static void main(String args[])
  { int randomnum = new Random().nextInt(9999);
    System.out.println("Generated number is:" + randomnum);
  }
}
