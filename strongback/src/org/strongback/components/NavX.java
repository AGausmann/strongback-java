package org.strongback.components;

public interface NavX extends ThreeAxisAccelerometer, Gyroscope {
    double getPitch();

    double getRoll();

    double getYaw();

    double getHeading();

    void zeroYaw();

    double getAccelerationX();

    double getAccelerationY();

    double getAccelerationZ();

    boolean isMoving();

    boolean isRotating();

    double getAltitude();

    boolean isAltitudeValid();

    double getFusedHeading();

    boolean isMagneticDisturbance();

    double getQuaternionW();

    double getQuaternionX();

    double getQuaternionY();

    double getQuaternionZ();

    void resetDisplacement();

    double getVelocityX();

    double getVelocityY();

    double getVelocityZ();

    double getDisplacementX();

    double getDisplacementY();

    double getDisplacementZ();

    double getAngle();

    double getRate();


    @Override
    default Accelerometer getXDirection() {
        return this::getAccelerationX;
    }

    @Override
    default Accelerometer getYDirection() {
        return this::getAccelerationY;
    }

    @Override
    default Accelerometer getZDirection() {
        return this::getAccelerationZ;
    }
}
