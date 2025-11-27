package org.example.boardback.repository.payment;

import org.example.boardback.entity.payment.PaymentRefund;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<PaymentRefund, Long> {
}
