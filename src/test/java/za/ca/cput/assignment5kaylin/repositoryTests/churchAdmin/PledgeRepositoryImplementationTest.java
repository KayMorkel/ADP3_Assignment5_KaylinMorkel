//package za.ca.cput.assignment5kaylin.repositoryTests.churchAdmin;
//
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.FixMethodOrder;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.junit.runners.MethodSorters;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import za.ca.cput.assignment5kaylin.domain.churchAdmin.Pledge;
//import za.ca.cput.assignment5kaylin.factory.churchAdmin.PledgeFactory;
//import za.ca.cput.assignment5kaylin.repository.churchAdmin.PledgeRepository;
//import za.ca.cput.assignment5kaylin.repository.churchAdmin.implementations.PledgeRepositoryImplementation;
//
//import java.util.Set;
//
//@SpringBootTest
//@RunWith(SpringRunner.class)
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//public class PledgeRepositoryImplementationTest
//{
//	@Autowired
//	private PledgeRepositoryImplementation classRepository;
//	private Set<Pledge> classes;
//	Pledge cl;
//	Pledge c2;
//
//	@Before
//	public void setUp() throws Exception
//	{
//		//this.classRepository = PledgeRepositoryImplementation.getRepository();
//	}
//
//	@Test
//	public void l_create()
//	{
//		cl = PledgeFactory.getPledge("1", "EFT");
//		c2 = PledgeFactory.getPledge("2", "EFT");
//		Pledge c = this.classRepository.create(cl);
//		Assert.assertEquals(cl, c);
//		Pledge cc = this.classRepository.create(c2);
//		Assert.assertEquals(c2, cc);
//	}
//
//	@Test
//	public void m_read()
//	{
//		String s = "1";
//		Pledge cl = this.classRepository.read(s);
//
//		Assert.assertEquals(s, cl.getPledgeNum());
//		//return classes.iterator().next();
//		System.out.println(cl.getPledgeNum() + " " + cl.getPaymentType());
//	}
//
//	@Test
//	public void n_update()
//	{
//		cl = PledgeFactory.getPledge("1", "Cash");
//		Pledge c = this.classRepository.update(cl);
//		Assert.assertEquals(cl, c);
//		System.out.println(c.getPledgeNum() + "\n"+c.getPaymentType());
//	}
//
//	@Test
//	public void o_delete()
//	{
//		String s = "1";
//		this.classRepository.delete(s);
//		classes = this.classRepository.getAll();
//		int size = classes.size();
//		Assert.assertEquals(1, size);
//	}
//
//	@Test
//	public void p_getAll()
//	{
//		classes = this.classRepository.getAll();
//		Assert.assertEquals(1, classes.size());
//
//		System.out.println(classes.size());
//	}
//}