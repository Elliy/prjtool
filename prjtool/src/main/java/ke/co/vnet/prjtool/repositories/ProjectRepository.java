package ke.co.vnet.prjtool.repositories;

import ke.co.vnet.prjtool.domain.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface ProjectRepository extends CrudRepository<Project,Long> {


}
