/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.drone2Receiver.drone2Receiver;

import java.io.IOException;
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


    
  @RabbitListener(queues = "queue1",autoStartup = "false")
public void verwerkBericht(BerichtGemaakt bericht) {
    try {
        sse.getEmitter().send(bericht);
    } catch (Exception e) {
        System.out.println("SSE fout: " + e.getMessage());
    }
}
}
