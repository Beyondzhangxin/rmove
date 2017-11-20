/*** 
*<p>Title: UserService</p>
* <p>Description: </p>
* <p>Company: </p> 
* @author  joyu
* @date  2017年11月9日
*/
package cn.com.aiidc.rmove.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;

/**
 * 所有dao都继承这个接口，免得每个dao都继承一堆jpa的接口
 * @author joyu
 * @date 2017年11月14日
 * @param <T>
 * @param <ID>
 */
//@Repository
@NoRepositoryBean
public interface BaseDao<T,ID extends Serializable> extends JpaRepository<T, ID>, PagingAndSortingRepository<T, ID>, JpaSpecificationExecutor<T> {

}
