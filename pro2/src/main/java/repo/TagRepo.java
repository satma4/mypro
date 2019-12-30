package repo;

import org.springframework.data.jpa.repository.JpaRepository;
import pojo.TagPo;

public interface TagRepo extends JpaRepository<TagPo,Long> {
TagPo findByPidAnName(Long id,String name);
}
