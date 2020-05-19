package repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Job;

public class RepositoryJob {

	public List<Job> getListaJobs(){
		
		List<Job> listaJobs = new ArrayList<>();
		
		Job job1 = new Job ( 1,"Importa��o de arquivos de fundos", 6000000000L,6000000000L);

	    Job job2 = new Job (2,"Importa��o de dados da Base Legada",1L,1L);

	    Job job3 = new Job (3,"Importa��o de dados de integra��o",1L,1L );
	    
	    listaJobs.add(job1);
	    listaJobs.add(job2);
	    listaJobs.add(job3);
		
	    Collections.sort(listaJobs);
	    
	    return listaJobs;
		
		}
}
