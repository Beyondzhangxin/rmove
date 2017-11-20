/*** 
*<p>Title: ExecuteProcedureDao</p>
* <p>Description: </p>
* <p>Company: </p> 
* @author  joyu
* @date  2017年11月14日
*/
package cn.com.aiidc.rmove.dao;
import cn.com.aiidc.rmove.entity.TestPoint;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.query.Procedure;
/**
 * @author joyu
 * @date 2017年11月14日
 */
@Repository
public interface  ExecuteProcedureDao extends CrudRepository<TestPoint, Long>{
	@Procedure(name = "generatePointRate")
    void generatePointRate();

}
