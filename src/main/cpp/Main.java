// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package main.cpp; 

import com.ctre.phoenix.motorcontrol.TalonFXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

/**
 * Do NOT add any static variables to this class, or any initialization at all. Unless you know what
 * you are doing, do not modify this file except to change the parameter class to the startRobot
 * call.
 */
public final class Main {
  private Main() {}

  /**
   * Main initialization function. Do not perform any initialization here.
   *
   * <p>If you change your main robot class, change the parameter type.
   */
  public static void main(String... args) {
    TalonFX leftMotor = new TalonFX(0); 

    TalonFX rightMotor = new TalonFX(1); 

    leftMotor.set(TalonFXControlMode.PercentOutput, 0.5); 
    rightMotor.set(TalonFXControlMode.PercentOutput, -0.5); 
  }
}