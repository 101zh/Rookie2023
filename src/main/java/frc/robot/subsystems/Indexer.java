// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Victor;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Indexer extends SubsystemBase {
  /** Creates a new Indexer. */
  private Victor indexerMotor = new Victor(Constants.ManipulatorConstants.kIndexerPort);

  public Indexer() {
  }

  // Set speed of the indexer motor
  public void rawIndexer(double power) {
    indexerMotor.set(power);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
