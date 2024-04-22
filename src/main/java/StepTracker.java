import java.util.ArrayList;
public class StepTracker
{
 private int activeDays;
 private int minSteps;
 private int days;
 private int steps;
 public StepTracker(int min){
  minSteps=min;
  activeDays=0;
  days=0;
  steps=0;
 }
 public void addDailySteps(int num){
  if(num>=minSteps)
   activeDays++;
  days++;
  steps+=num;

 }
 public int activeDays(){
 return activeDays;
 }
 public double averageSteps(){
  if(days==0)
   return 0;
 return (steps/((double)days));
 }
} 
