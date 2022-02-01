import java.util.concurrent.TimeUnit;
class Main {
  public static void main(String[] args) {
    boolean trolling = true;//do not set to false it will cause the universe to collapse
    int numOfTimes = 0;
    int[] nums;
    nums = new int[11];
    nums[0] = 0;
    for(int j = 1; j < 11; j++){
      nums[j] = (int)(Math.random() * 10) + 1;
    }

    for (int i = 1; i < 11; i++) {
      int done = 1;
      while (done == 1){
        if (nums[i] == nums[i-1]+1){
          done = 0;
        }
          else if (nums[i] != nums[i-1]+1){
            nums[i] = (int)(Math.random() * 10) + 1;
            numOfTimes++;
            for (int kekw = 1; kekw < 11; kekw++){
            System.out.print(nums[kekw] + ", ");
            }
            System.out.println("");
          }
          try{
    Thread.sleep(300);
}
catch(InterruptedException ex)
{
    Thread.currentThread().interrupt();
}
        }
      }
       System.out.println("Number of tries " + numOfTimes);
       if(numOfTimes == 69){
         System.out.println("nice bruv три полоски");
           }
           if(numOfTimes >= 100){
           System.out.println("блин, на что ушло много попыток, дебил");
           //english is "pancake that was a lot of tries debil"
           //slav english is "blin that was a lot of tries debil"
           if(trolling != true){
             System.out.println("the universe is collapsing why would you set it to false!!!");
         }
       }
    }
  }