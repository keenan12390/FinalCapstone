package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.StagedOrder;

@Repository
public interface StagedOrderRepository extends JpaRepository<StagedOrder, Integer>{

}
