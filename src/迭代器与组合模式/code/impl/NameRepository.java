package 迭代器与组合模式.code.impl;

import 迭代器与组合模式.code.Container;
import 迭代器与组合模式.code.Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NameRepository implements Container {

   private List<NameRepository> nameRepositoryList = new ArrayList<>();

   public String[] names;

   public NameRepository(String[] names) {
      this.names = names;
   }

   @Override
   public Iterator getIterator() {
      return new NameIterator();
   }

   public List<NameRepository> getNameRepositoryList() {
      return nameRepositoryList;
   }

   public void setNameRepositoryList(List<NameRepository> nameRepositoryList) {
      this.nameRepositoryList = nameRepositoryList;
   }

   @Override
   public String toString() {
      return "NameRepository{" +
              "nameRepositoryList=" + nameRepositoryList +
              ", names=" + Arrays.toString(names) +
              '}';
   }

   private class NameIterator implements Iterator {
 
      int index;
 
      @Override
      public Boolean hasNext() {
         if(index < names.length){
            return true;
         }
         return false;
      }
 
      @Override
      public Object next() {
         if(this.hasNext()){
            return names[index++];
         }
         return null;
      }     
   }
}