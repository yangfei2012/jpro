package org.fei.test;

import org.fei.test.service.CrmDmQueryService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        customTransferApprovalView();

        System.out.println("======================");
    }





    // 商家交接审批页面，移走至bdsBmsTransferApprovalController
    public static void customTransferApprovalView() {
        ApplicationContext container = new ClassPathXmlApplicationContext("classpath:mytest.xml");

        CrmDmQueryService service = (CrmDmQueryService)container.getBean("crmDmQueryService");
        List<CrmDmBdsBms> crmDmBdsBmses = service.getSalerListByCityId(100010000L);

        for (CrmDmBdsBms u : crmDmBdsBmses) {
            System.out.println(u.getSalerId()+" "+u.getSalerName());
        }
    }

    public static void CrmDmDbsBmsMapperDemo() {
        ApplicationContext container = new ClassPathXmlApplicationContext("classpath:mytest.xml");

        CrmDmDbsBmsMapper mapper = (CrmDmDbsBmsMapper)container.getBean("crmDmDbsBmsMapper");
        List<CrmDmBdsBms> crmDmBdsBmses = mapper.findSalerListByCityId(100010000L);

        for (CrmDmBdsBms u : crmDmBdsBmses) {
            System.out.println(u.getSalerId()+" "+u.getSalerName());
        }
    }

    public static void demo() {
        ApplicationContext container = new ClassPathXmlApplicationContext("classpath:mytest.xml");

        UserMapper userMapper = (UserMapper)container.getBean("userMapper");
        List<User> users = userMapper.fetchAll();

        for (User u : users) {
            System.out.println(u);
        }
    }
}
