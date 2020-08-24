package 生成器模式.test;

import 生成器模式.code.Company;
import 生成器模式.code.CompanyBuilder;

/**
 * @description:
 * @author: zhangys
 * @create: 2020-08-24 16:44
 **/
public class Main {

    public static void main(String[] args) {
        CompanyBuilder companyBuilder1 = new CompanyBuilder("公司", "北京", "010 2222222");

        Company company1 = companyBuilder1.setVary("图书").setPostcode("1111111").build();
        Company company2 = companyBuilder1.setVary("图书").setPostcode("2222222").build();
        Company company3 = companyBuilder1.setVary("图书").setPostcode("3333333").build();

        CompanyBuilder companyBuilder2 = new CompanyBuilder("公司", "上海", "010 1111111");
        Company company11 = companyBuilder2.setVary("图书").setPostcode("1111111").build();
        Company company12 = companyBuilder2.setVary("图书").setPostcode("2222222").build();
        Company company13 = companyBuilder2.setVary("图书").setPostcode("3333333").build();

        System.out.println(company1.toString());
        System.out.println(company2.toString());
        System.out.println(company3.toString());
        System.out.println(company11.toString());
        System.out.println(company12.toString());
        System.out.println(company13.toString());
    }
}
