package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveSubsystem extends SubsystemBase{
    
    private DifferentialDrive m_drivetrain;

    public DriveSubsystem() {
        WPI_TalonSRX m_LeftFront = new WPI_TalonSRX(2);
        WPI_TalonSRX m_RightFront = new WPI_TalonSRX(3);
        WPI_TalonSRX m_LeftRear = new WPI_TalonSRX(4); 
        WPI_TalonSRX m_RightRear = new WPI_TalonSRX(5);

        m_LeftRear.follow(m_LeftFront);
        m_RightRear.follow(m_RightFront);

        m_LeftFront.setInverted(true);
        m_LeftRear.setInverted(true);
        m_RightFront.setInverted(false);
        m_RightRear.setInverted(false);

        m_drivetrain = new DifferentialDrive(m_LeftFront,m_RightFront);
    }

    public void drive(double speed, double rotation) {
        m_drivetrain.arcadeDrive(speed, rotation);
    }
    
}
