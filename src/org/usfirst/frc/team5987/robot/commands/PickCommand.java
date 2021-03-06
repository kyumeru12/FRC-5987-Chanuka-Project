package org.usfirst.frc.team5987.robot.commands;

import org.usfirst.frc.team5987.robot.Robot;
import org.usfirst.frc.team5987.robot.subsystems.PickerSubsystem;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class PickCommand extends Command {

	private double speed;

    public PickCommand(double speed)
    {
    	requires(Robot.pickerSubsystem);
    	this.speed = speed;
    }
    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	PickerSubsystem.rotate(speed);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
