// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterSub extends SubsystemBase {
  /** Creates a new ShooterSub. */
  public ShooterSub() {}
  private SparkMax motor = new SparkMax(0, MotorType.kBrushless);
  

  @Override
  public void periodic() {


    // This method will be called once per scheduler run
  }

  public Command setVoltageCommand(double Voltage){

    return runEnd(() -> motor.setVoltage(Voltage), () -> motor.setVoltage(0));
    
  }
}
