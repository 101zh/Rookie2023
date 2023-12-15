// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsystems.Intake;

public class IntakeXboxController extends CommandBase {
  Intake intake;
  final CommandXboxController m_CommandXboxController;

  /** Creates a new IntakeXboxController. */
  public IntakeXboxController(Intake intake, CommandXboxController xboxController) {
    this.intake = intake;
    this.m_CommandXboxController = xboxController;

    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(intake);

  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    intake.rawIntake(m_CommandXboxController.getRightY() * 0.8);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
