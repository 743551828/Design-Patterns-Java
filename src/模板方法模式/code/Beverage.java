package 模板方法模式.code;


/**
 * @description:
 * @author: zhangys
 * @create: 2020-08-18 11:17
 **/
public abstract class Beverage {

    public final void make(){
        prepareIngredients();
        filter();
        doUp();
    }

    protected abstract void prepareIngredients();

    protected abstract void filter();

    protected abstract void doUp();

}
