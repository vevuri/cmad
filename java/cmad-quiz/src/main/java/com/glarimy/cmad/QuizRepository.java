package com.glarimy.cmad;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRepository extends JpaRepository<Question, Integer> {
	//public List<Question> findBySubjectAndLevel(String subject, int level);
	public Long countByQidAndAnswer(int qid, String answer);
	public Page<Question> findBySubjectAndLevel(String subject, int level, Pageable page);

}
