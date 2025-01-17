package com.demo.design.行为型设计模式.迭代器模式;

/**
 * @Author: Aoisora
 * @Date: 2025-01-18-07:04
 * @Description:
 * @Version 1.0 （版本号）
 */
public class AggregateImpl implements Aggregate{


    protected final String[] list = {"李逍遥","唐钰小宝","赵灵儿","林月如","阿奴"};

    /**
     * 返回一个迭代器对象
     * @return
     */
    @Override
    public Iterator getIterator() {
        return new IteratorImpl();
    }

    public class IteratorImpl implements Iterator{

        int index = 0;

        /**
         * 判断时否有下一个元素
         * @return
         */
        @Override
        public boolean haxNext() {
            if(index < list.length){
                return true;
            }
            return false;
        }

        /**
         * 返回下一个元素
         * @return
         */
        @Override
        public Object next() {
            if(haxNext()){
                Object obj = list[index];
                index ++;
                return obj;
            }
            return null;
        }
    }
}
