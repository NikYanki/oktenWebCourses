package homework2.task2;

public interface Battery {
   default boolean isHaveABattery(boolean answer){
       return answer;
   };
   default boolean isBatteryIntegrated(boolean answer){
       return answer;
   }
}
