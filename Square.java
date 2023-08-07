package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
@Autonomous (name = "Square", group = "Push Bot")
public class Square extends LinearOpMode {
    DcMotor left;
    DcMotor right;
    @Override
    public void runOpMode() throws InterruptedException {
        sleep(5000);
        left=hardwareMap.dcMotor.get("left");
        right=hardwareMap.dcMotor.get("right");
        for(int i=0; i<4; i++){
            left.setPower(.5);
            right.setPower(.5);
            wait(1000);
            left.setPower(.5);
            right.setPower(-.5);
            wait(500);
        }
    }
}
