package payment.service.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import payment.service.entity.PaymentEntity;

@Repository
public interface  PaymentRepository extends CrudRepository<PaymentEntity, Integer>
{

}
