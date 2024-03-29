package SpringBoot.SpringJPA.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import SpringBoot.SpringJPA.entity.Department;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long>{

}
