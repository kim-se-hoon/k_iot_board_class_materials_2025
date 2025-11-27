package org.example.boardback.service.payment.gateway;

import org.example.boardback.dto.payment.request.PaymentCreatRequestDto;
import org.springframework.stereotype.Component;

@Component
public class KakaoPayGateway implements PaymentGateway{
    @Override
    public PaymentResult pay(PaymentCreatRequestDto request) {
        return null;
    }
}
