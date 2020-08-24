package 复合模式.test;

import 复合模式.code.controller.DJController;
import 复合模式.code.model.DJModel;

/**
 * @description:
 * @author: zhangys
 * @create: 2020-08-24 14:24
 **/
public class Main {

    public static  void main(String[] args){
        DJModel djModel = new DJModel();
        new DJController(djModel);
    }
}
