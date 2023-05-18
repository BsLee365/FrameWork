package com.jvision.admin.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository의 기능을 PostsRepository가 상속을 받아서 사용하고 있음. 실제로 데이터 베이스를 사용할수 있게끔 해줌.
public interface PostsRepository extends JpaRepository<Posts, Long> {
}
