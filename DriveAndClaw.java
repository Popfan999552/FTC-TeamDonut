package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

public class DriveAndClaw extends OpMode {
    DcMotor left;
    DcMotor right;
    DcMotor arm;
    Servo claw;
    @Override
    public void init() {
        left=hardwareMap.dcMotor.get("left");
        right=hardwareMap.dcMotor.get("right");
        claw=hardwareMap.servo.get("claw");
        arm=hardwareMap.dcMotor.get("arm");
    }

    @Override
    public void loop() {
        float clawPosition=90;
        //if you do ___, activate the left motor
        left.setPower(gamepad1.left_stick_y);
        right.setPower(gamepad1.right_stick_y);
        //if you do ___, activi
        //L2 claw open, R2 claw close
        if(gamepad1.left_bumper){
            //the claw opens
            //claw uses position
            //increase the position
            clawPosition= clawPosition+1;

            //set the position
            claw.setPosition(clawPosition);
        }
        if(gamepad1.right_bumper){
            //the claw opens
            //claw uses position
            //decrease the position
            clawPosition= clawPosition-1;

            //set the position
            claw.setPosition(clawPosition);
        }
        //up arrow is arm raise, down arrow is arm lower
        if(gamepad1.dpad_up){
            //turn arm motor
            arm.setPower(0.5);

        } else if (!gamepad1.dpad_up){
            arm.setPower(0);
        }
    }
}
