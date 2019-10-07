//package za.ca.cput.assignment5kaylin.repositoryTests.churchClasses;
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
//import za.ca.cput.assignment5kaylin.domain.churchClasses.SundaySchool;
//import za.ca.cput.assignment5kaylin.factory.churchClasses.SundaySchoolFactory;
//import za.ca.cput.assignment5kaylin.repository.churchClasses.SundaySchoolRepository;
//import za.ca.cput.assignment5kaylin.repository.churchClasses.implementations.SundaySchoolRepositoryImplmentation;
//
//import java.util.Set;
//
//@SpringBootTest
//@RunWith(SpringRunner.class)
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//public class SundaySchoolRepositoryImplmentationTest
//{
//	@Autowired
//	private SundaySchoolRepository classRepository;
//	private Set<SundaySchool> classes;
//	SundaySchool cl;
//	SundaySchool c2;
//
//	@Before
//	public void setUp() throws Exception
//	{
//		//this.classRepository = SundaySchoolRepositoryImplmentation.getRepository();
//	}
//
//	@Test
//	public void l_create()
//	{
//		cl = SundaySchoolFactory.getSunSchool("1");
//		c2 = SundaySchoolFactory.getSunSchool("2");
//		SundaySchool c = this.classRepository.create(cl);
//		Assert.assertEquals(cl, c);
//		SundaySchool cc = this.classRepository.create(c2);
//		Assert.assertEquals(c2, cc);
//	}
//
//	@Test
//	public void m_read()
//	{
//		String s = "2";
//		SundaySchool cl = this.classRepository.read(s);
//
//		Assert.assertEquals(s, cl.getClassNo());
//		//return classes.iterator().next();
//		System.out.println(cl.getClassNo());
//	}
//
//	@Test
//	public void n_update()
//	{
//		cl = SundaySchoolFactory.getSunSchool("1");
//		SundaySchool c = this.classRepository.update(cl);
//		Assert.assertEquals(cl, c);
//		System.out.println(c.getClassNo());
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