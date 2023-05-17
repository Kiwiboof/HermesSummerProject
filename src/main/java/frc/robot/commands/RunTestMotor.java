// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.TestMotor;

public class RunTestMotor extends CommandBase {
  /** Creates a new RunTestMotor. */
  private TestMotor m_testMotor;
  private double m_speed;

  public RunTestMotor(double speed, TestMotor testMotor) {
    m_speed = speed;
    m_testMotor = testMotor;

    addRequirements(m_testMotor);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_testMotor.run(m_speed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
