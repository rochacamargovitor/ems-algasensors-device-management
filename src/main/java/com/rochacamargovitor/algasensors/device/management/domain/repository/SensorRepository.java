package com.rochacamargovitor.algasensors.device.management.domain.repository;

import com.rochacamargovitor.algasensors.device.management.domain.model.Sensor;
import com.rochacamargovitor.algasensors.device.management.domain.model.SensorId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorRepository extends JpaRepository<Sensor, SensorId> {
}
