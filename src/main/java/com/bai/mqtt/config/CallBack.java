package com.bai.mqtt.config;

import lombok.extern.slf4j.Slf4j;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CallBack implements MqttCallback {

    @Override
    public void connectionLost(Throwable throwable) {
        log.info("程序出现异常，断线！");
    }

    @Override
    public void messageArrived(String s, MqttMessage mqttMessage) {
        log.info(String.format("s : %s", s));
        log.info(String.format("mqttMessage : %s", mqttMessage));
        log.info("messageArrived !");
    }

    @Override
    public void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken) {
        log.info("deliveryComplete !");
    }

}
