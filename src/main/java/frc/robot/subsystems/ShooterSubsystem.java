package frc.robot.subsystems;

import java.util.concurrent.TimeUnit;

import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterSubsystem extends SubsystemBase{

        public boolean fireRate = false;
 
        int Counter = 1; 
        //wait = new wait(5000);
        DigitalOutput output1 = new DigitalOutput(1);
        DigitalOutput output2 = new DigitalOutput(2);
        DigitalOutput output3 = new DigitalOutput(3);
        DigitalOutput output4 = new DigitalOutput(4);
        DigitalOutput output5 = new DigitalOutput(5);
        DigitalOutput output6 = new DigitalOutput(6);
        DigitalOutput output7 = new DigitalOutput(7);
        DigitalOutput output8 = new DigitalOutput(8);
 

    public ShooterSubsystem(){}

    public void shootTime(double valveopentime) {

    }

    public void shoot(double valveopentime) throws InterruptedException {
      SmartDashboard.putNumber("counter", Counter);  
      if (Counter == 1){

          output7.set(true);
          SmartDashboard.putBoolean("Charging", true);
          Thread.sleep(4000);
          output7.set(false);
          SmartDashboard.putBoolean("Charging", false);
          Thread.sleep(20);

          output1.set(true);
          SmartDashboard.putBoolean("do1", output1.get());
          Thread.sleep(500);

            output1.set(false);
            Counter ++;
            SmartDashboard.putBoolean("do1", output1.get());
            Thread.sleep(500);

      } else if (Counter == 2){

          output7.set(true);
          SmartDashboard.putBoolean("Charging", true);
          Thread.sleep(4000);
          output7.set(false);
          SmartDashboard.putBoolean("Charging", false);
          Thread.sleep(20);
          output2.set(true);
          Thread.sleep(500);

            output2.set(false);
            Counter ++;
            Thread.sleep(500);

          } else if (Counter == 3){

          output7.set(true);
          SmartDashboard.putBoolean("Charging", true);
          Thread.sleep(4000);
          output7.set(false);
          SmartDashboard.putBoolean("Charging", false);
          Thread.sleep(20);

              output3.set(true);
              Thread.sleep(500);

            output3.set(false);
            Counter ++;
            Thread.sleep(500);

      } else if (Counter == 4){

          output7.set(true);
          SmartDashboard.putBoolean("Charging", true);
          Thread.sleep(4000);
          output7.set(false);
          SmartDashboard.putBoolean("Charging", false);
          Thread.sleep(20);

          output4.set(true);
          Thread.sleep(500);

            output4.set(false);
            Counter ++;
            Thread.sleep(500);

      } else if (Counter == 5){

          output7.set(true);
          SmartDashboard.putBoolean("Charging", true);
          Thread.sleep(4000);
          output7.set(false);
          SmartDashboard.putBoolean("Charging", false);
          Thread.sleep(20);

          output5.set(true);
          Thread.sleep(500);

            output5.set(false);
            Counter ++;
            Thread.sleep(500);

      } else if (Counter == 6){

          output7.set(true);
          SmartDashboard.putBoolean("Charging", true);
          Thread.sleep(4000);
          output7.set(false);
          SmartDashboard.putBoolean("Charging", false);
          Thread.sleep(20);

          output6.set(true);
          Thread.sleep(500);

            output6.set(false);
            Counter = 1;
            Thread.sleep(500);

          }
      // }
        // if (Counter <= 6 && fireRate == false) {
        //     fireRate = true;
        //     Counter++;
        //   //output.pulse(3);
        //  // output.close();
        // }else if(Counter==6){
        //     //DigitalOutput output = new DigitalOutput(1);
        //     Counter = 1;
            
        //   // output.pulse(valveopentime);
        // }
      }
      
        public void fireTime(boolean fireRate) {
          fireRate = false;
        }

        @Override
        public void periodic(){
          SmartDashboard.putBoolean("do1", output1.get());
        }
        
}

