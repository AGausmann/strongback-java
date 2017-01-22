package org.strongback.hardware;

import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.PIDSourceType;
import org.strongback.components.NavX;

class HardwareNavX implements NavX {
    private final AHRS ahrs;

    HardwareNavX(AHRS ahrs) {
        this.ahrs = ahrs;
    }


    @Override
    public double getPitch() {
        return ahrs.getPitch();
    }

    @Override
    public double getRoll() {
        return ahrs.getRoll();
    }

    @Override
    public double getYaw() {
        return ahrs.getYaw();
    }

    @Override
    public double getHeading() {
        return ahrs.getCompassHeading();
    }

    @Override
    public void zeroYaw() {
        ahrs.zeroYaw();
    }

    public boolean isCalibrating() {
        return ahrs.isCalibrating();
    }

    public boolean isConnected() {
        return ahrs.isConnected();
    }

    public double getByteCount() {
        return ahrs.getByteCount();
    }

    public int getActualUpdateRate() {
        return ahrs.getActualUpdateRate();
    }

    public int getRequestedUpdateRate() {
        return ahrs.getRequestedUpdateRate();
    }

    public double getUpdateCount() {
        return ahrs.getUpdateCount();
    }

    public long getLastSensorTimestamp() {
        return ahrs.getLastSensorTimestamp();
    }

    @Override
    public double getAccelerationX() {
        return ahrs.getWorldLinearAccelX();
    }

    @Override
    public double getAccelerationY() {
        return ahrs.getWorldLinearAccelY();
    }

    @Override
    public double getAccelerationZ() {
        return ahrs.getWorldLinearAccelZ();
    }

    @Override
    public boolean isMoving() {
        return ahrs.isMoving();
    }

    @Override
    public boolean isRotating() {
        return ahrs.isRotating();
    }

    public double getBarometricPressure() {
        return ahrs.getBarometricPressure();
    }

    @Override
    public double getAltitude() {
        return ahrs.getAltitude();
    }

    @Override
    public boolean isAltitudeValid() {
        return ahrs.isAltitudeValid();
    }

    @Override
    public double getFusedHeading() {
        return ahrs.getFusedHeading();
    }

    @Override
    public boolean isMagneticDisturbance() {
        return ahrs.isMagneticDisturbance();
    }

    public boolean isMagnetometerCalibrated() {
        return ahrs.isMagnetometerCalibrated();
    }

    @Override
    public double getQuaternionW() {
        return ahrs.getQuaternionW();
    }

    @Override
    public double getQuaternionX() {
        return ahrs.getQuaternionX();
    }

    @Override
    public double getQuaternionY() {
        return ahrs.getQuaternionY();
    }

    @Override
    public double getQuaternionZ() {
        return ahrs.getQuaternionZ();
    }

    @Override
    public void resetDisplacement() {
        ahrs.resetDisplacement();
    }

    @Override
    public double getVelocityX() {
        return ahrs.getVelocityX();
    }

    @Override
    public double getVelocityY() {
        return ahrs.getVelocityY();
    }

    @Override
    public double getVelocityZ() {
        return ahrs.getVelocityZ();
    }

    @Override
    public double getDisplacementX() {
        return ahrs.getDisplacementX();
    }

    @Override
    public double getDisplacementY() {
        return ahrs.getDisplacementY();
    }

    @Override
    public double getDisplacementZ() {
        return ahrs.getDisplacementZ();
    }

    public PIDSourceType getPIDSourceType() {
        return ahrs.getPIDSourceType();
    }

    public void setPIDSourceType(PIDSourceType type) {
        ahrs.setPIDSourceType(type);
    }

    public double pidGet() {
        return ahrs.pidGet();
    }

    @Override
    public double getAngle() {
        return ahrs.getAngle();
    }

    @Override
    public double getRate() {
        return ahrs.getRate();
    }

    public void setAngleAdjustment(double adjustment) {
        ahrs.setAngleAdjustment(adjustment);
    }

    public double getAngleAdjustment() {
        return ahrs.getAngleAdjustment();
    }

    public void reset() {
        ahrs.reset();
    }

    public double getRawGyroX() {
        return ahrs.getRawGyroX();
    }

    public double getRawGyroY() {
        return ahrs.getRawGyroY();
    }

    public double getRawGyroZ() {
        return ahrs.getRawGyroZ();
    }

    public double getRawAccelX() {
        return ahrs.getRawAccelX();
    }

    public double getRawAccelY() {
        return ahrs.getRawAccelY();
    }

    public double getRawAccelZ() {
        return ahrs.getRawAccelZ();
    }

    public double getRawMagX() {
        return ahrs.getRawMagX();
    }

    public double getRawMagY() {
        return ahrs.getRawMagY();
    }

    public double getRawMagZ() {
        return ahrs.getRawMagZ();
    }

    public double getPressure() {
        return ahrs.getPressure();
    }

    public double getTempC() {
        return ahrs.getTempC();
    }

    public AHRS.BoardYawAxis getBoardYawAxis() {
        return ahrs.getBoardYawAxis();
    }
}
