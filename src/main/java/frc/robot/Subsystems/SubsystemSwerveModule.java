// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import com.revrobotics.AbsoluteEncoder;
import com.revrobotics.spark.SparkClosedLoopController;
import com.revrobotics.spark.SparkMax;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class SubsystemSwerveModule extends SubsystemBase {
  SparkMax driverMotor;
  SparkMax turningMotor;
  SparkClosedLoopController driverController;
  SparkClosedLoopController turningController;
  AbsoluteEncoder turningEncoder;
  public static final double wheelRadius = 2.0; 
  public SubsystemSwerveModule() {
 
   
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
