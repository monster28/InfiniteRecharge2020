package frc.team2412.robot.Commands.IntakeCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.team2412.robot.Subsystems.IntakeMotorOnOffSubsystem;

public class IntakeFrontOffIntakeBackOnCommand extends CommandBase {

	private IntakeMotorOnOffSubsystem m_intakeMotorOnOffSubsystem;

	public IntakeFrontOffIntakeBackOnCommand(IntakeMotorOnOffSubsystem intakeMotorSubsystem) {
		addRequirements(intakeMotorSubsystem);
		this.m_intakeMotorOnOffSubsystem = intakeMotorSubsystem;
	}

	@Override
	public void execute() {
		m_intakeMotorOnOffSubsystem.frontIntakeOffBackIntakeOn();
	}

	@Override
	public boolean isFinished() {
		return true;
	}

}
