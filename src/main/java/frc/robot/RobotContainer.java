// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

import java.util.concurrent.TimeUnit;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.Subsystem;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.subsystems.ShooterSubsystem;
import frc.robot.subsystems.DriveSubsystem;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.subsystems.*;

public class RobotContainer {

  public final DriveSubsystem m_robotDrive = new DriveSubsystem();
  public final ShooterSubsystem m_shoot = new ShooterSubsystem();
  public final CommandXboxController m_XboxController = new CommandXboxController(1);



  public RobotContainer() {
    configureBindings();

    m_robotDrive.setDefaultCommand(new RunCommand(
      () -> m_robotDrive.drive(m_XboxController.getLeftY(), m_XboxController.getLeftX()), m_robotDrive));

     m_shoot.setDefaultCommand(new RunCommand(
    () -> m_shoot.fireTime(false), m_shoot));
  
    }


  private void configureBindings() {
    m_XboxController.a().whileTrue(new RunCommand(
      () -> {
        try {
          m_shoot.shoot(0.2);
        } catch (InterruptedException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
      }, m_shoot));
     //wait(5000);
    
     //WaitCommand.class(50000);
    
  }


}
