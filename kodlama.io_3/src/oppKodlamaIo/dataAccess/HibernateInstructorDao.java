package oppKodlamaIo.dataAccess;

import oppKodlamaIo.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile veritaban�na e�itmen eklendi :" 
				+ instructor.getInstructorFirstName() + " "
				+ instructor.getInstructorLastName());
	}

}