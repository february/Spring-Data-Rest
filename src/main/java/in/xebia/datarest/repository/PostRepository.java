package in.xebia.datarest.repository;

import in.xebia.datarest.domain.Post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.repository.annotation.RestResource;


public interface PostRepository extends JpaRepository<Post, Long> {
	
	public Post findByUserUserName(@Param("userName") String userName);
	
	public Post findByTitle(@Param("title") String title);
	
}
