package com.storemanagement.dao.impl;


public class TestDBConnectionImpl {
   /* private static SqlSessionFactory sessionFac = null;
    private static Reader reader;
    private static String CONFIGURATION_FILE = "sqlmap-config.xml";

    static{
        try {
            reader = Resources.getResourceAsReader(CONFIGURATION_FILE);
            sessionFac = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
        e.printStackTrace();
        }
    }

    public static void main(String[] args) {
    	
    	
        SqlSession session = sessionFac.openSession();
        try {
        	
            ProductServices productServiceObj = session.getMapper(ProductServices.class);
            Product product = new Product();
            product.setId((long)(Math.random()*100));
            product.setBrand("LG");
            product.setModel("P500");
            product.setName("Optimus One");
            productServiceObj.save(product);
            session.commit();

        } finally {
        session.close();
        }
    }
*/
}