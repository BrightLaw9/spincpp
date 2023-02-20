// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

#include "Robot.h"

#include <frc2/command/CommandScheduler.h>
#include "ctre/Phoenix.h"
#include <iostream>

#ifndef RUNNING_FRC_TESTS
int main() {
  TalonFX talLeft(0); 
  TalonFX talRight(1); 
  
  while (true) {
  talLeft.Set(TalonFXControlMode::PercentOutput, 0.25); 
  talRight.Set(TalonFXControlMode::PercentOutput, -0.25);
  }

  int a = 0; 
  std::cin >> a; 
  std::cout << "Speed 0.25"; 

  return 0;
}
#endif
