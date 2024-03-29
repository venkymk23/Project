package SpringBoot.SpringJPA.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringBoot.SpringJPA.entity.Department;
import SpringBoot.SpringJPA.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Override
    public Department saveDepartment(Department department)
    {
        return departmentRepository.save(department);
    }
	
	// Read operation
    @Override public List<Department> fetchDepartmentList()
    {
        return (List<Department>)
            departmentRepository.findAll();
    }
 // Update operation
    @Override
    public Department
    updateDepartment(Department department,
                     Long departmentId)
    {
 
        Department depDB
            = departmentRepository.findById(departmentId)
                  .get();
 
        if (Objects.nonNull(department.getDepartmentName())
            && !"".equalsIgnoreCase(
                department.getDepartmentName())) {
            depDB.setDepartmentName(
                department.getDepartmentName());
        }
 
        if (Objects.nonNull(
                department.getDepartmentAddress())
            && !"".equalsIgnoreCase(
                department.getDepartmentAddress())) {
            depDB.setDepartmentAddress(
                department.getDepartmentAddress());
        }
 
        if (Objects.nonNull(department.getDepartmentcode())
            && !"".equalsIgnoreCase(
                department.getDepartmentcode())) {
            depDB.setDepartmentcode(
                department.getDepartmentcode());
        }
 
        return departmentRepository.save(depDB);
    }
 
    // Delete operation
    @Override
    public void deleteDepartmentById(Long departmentId)
    {
        departmentRepository.deleteById(departmentId);
    }
	
	

}
