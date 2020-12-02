package com.yang.test;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class TestMyBatis {

//    @Test
//    @Autowired
//    public void run1() throws Exception {
//        //加载配置文件
//
//        AccountDao dao=sqlSession.getMapper(AccountDao.class);
//        List<Account> lists=dao.findAll();
//        for (Account list:lists){
//            System.out.println(list);
//        }
//        sqlSession.close();
//        in.close();
//
//
//    }
//    @Test
//    public void run2() throws Exception {
//        //加载配置文件
//        InputStream in=Resources.getResourceAsStream("SqlMapConfig.xml");
//        SqlSessionFactory factory= new SqlSessionFactoryBuilder().build(in);
//        SqlSession sqlSession=factory.openSession();
//        AccountDao dao=sqlSession.getMapper(AccountDao.class);
//        Account account=new Account();
//        account.setName("vvv");
//        account.setMoney(100f);
//        dao.saveAccount(account);
//        sqlSession.commit();
//        sqlSession.close();
//        in.close();
//
//
//    }
}
