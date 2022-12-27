package oppKodlamaIo.dataAccess;

import oppKodlamaIo.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {

		System.out.println("JDBC ile veritabanına eğitmen eklendi : " 
		+ instructor.getInstructorFirstName() + instructor.getInstructorLastName());
		
	}

}
