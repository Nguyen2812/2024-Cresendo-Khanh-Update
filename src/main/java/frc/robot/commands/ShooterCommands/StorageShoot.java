// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.ShooterCommands;

import com.revrobotics.CANSparkMax;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Shooter;

public class StorageShoot extends Command {

  private final CANSparkMax l;
  private final CANSparkMax r;
  private final CANSparkMax b;
  private final double defaultSpeed = 0.6;
  /** Creates a new StorageShoot. */
  public StorageShoot(Shooter s, CANSparkMax l, CANSparkMax r, CANSparkMax b) {
    this.l = l;
    this.r = r;
    this.b = b;
    addRequirements(s);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    l.set(defaultSpeed);
    r.set(-defaultSpeed);
    b.set(defaultSpeed);
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
