package basicmeeting.demo.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import basicmeeting.demo.model.userAdmin;

@Repository

public interface userAdminRepo extends JpaRepository<userAdmin,Integer>
{
      @Query(value = "select * from user_admin u JOIN profile p on p.admin_id=u.id",nativeQuery = true)
      List<userAdmin> selectall();

}
