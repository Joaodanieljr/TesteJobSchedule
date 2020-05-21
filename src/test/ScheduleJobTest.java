package test;

import static org.junit.Assert.assertThat;

import java.text.ParseException;
import java.util.ArrayList;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import model.Job;
import service.ScheduleJob;

public class ScheduleJobTest {

	@Test
	public void testGotAllJobs() throws ParseException {

		ScheduleJob sc = new ScheduleJob();
		
		ArrayList<Job> schedule = sc.schedule();
		ArrayList<Integer> lista = new ArrayList<>();
		
		
		for(Job n: schedule){
			lista.add(n.getId());
		}
		
		assertThat(lista, CoreMatchers.hasItems(1,2,3));
		
		
	}
	
	@Test
	public void testSequence() throws ParseException {

		ScheduleJob sc = new ScheduleJob();
		
		ArrayList<Job> schedule = sc.schedule();
		ArrayList<Integer> listaIdeal = new ArrayList<>();
		listaIdeal.add(1);
		listaIdeal.add(3);
		listaIdeal.add(2);
		
		
		ArrayList<Integer> listaSchedule = new ArrayList<>();
		
		for(Job n: schedule){
			listaSchedule.add(n.getId());
		}
		
		
		if(listaSchedule.equals(listaIdeal)){
			System.out.println("Sequencia Correta");
		}else{
			System.out.println("Sequencia Incorreta");
		}
		
		
	}
	

}
