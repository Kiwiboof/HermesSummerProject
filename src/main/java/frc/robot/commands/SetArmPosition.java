// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Arm;

public class SetArmPosition extends CommandBase {

  private double m_setPoint;
  private Arm m_arm;
  
  public SetArmPosition(double setPoint, Arm arm) {
    // addRequirements(m_arm);
    m_setPoint = setPoint;
    m_arm = arm;

  }


  @Override
  public void initialize() {
    m_arm.setPosition(m_setPoint);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
