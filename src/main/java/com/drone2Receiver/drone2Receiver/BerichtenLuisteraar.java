/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.drone2Receiver.drone2Receiver;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 *
 * @author rafde
 */
@Component
public class BerichtenLuisteraar {
    private final SseController sse;

    public BerichtenLuisteraar(SseController sse) {
        this.sse = sse;
    }

@RabbitListener(queues = "queue1")
    public void verwerkBericht(BerichtGemaakt bericht) {
        sse.send(bericht);
    }  

}
