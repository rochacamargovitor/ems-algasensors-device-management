package com.rochacamargovitor.algasensors.device.management.api.client;

import com.rochacamargovitor.algasensors.device.management.api.model.SensorMonitoringOutput;
import io.hypersistence.tsid.TSID;

public interface SensorMonitoringClient {

    void enableMonitoring(TSID sensorId);

    void disableMonitoring(TSID sensorId);

    SensorMonitoringOutput getDetail(TSID sensorId);

}
